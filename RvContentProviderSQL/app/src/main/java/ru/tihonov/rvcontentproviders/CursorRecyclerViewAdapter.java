package ru.tihonov.rvcontentproviders;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public abstract class CursorRecyclerViewAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {

    protected Context mContext;

    private Cursor mCursor;

    private boolean mDataValid;

    private int mRowIdColumn;

    private DataSetObserver mDataSetObserver;

    public CursorRecyclerViewAdapter(Context context, Cursor cursor) {
        mContext = context;
        mCursor = cursor;
        mDataValid = cursor != null;
        mRowIdColumn = mDataValid ? mCursor.getColumnIndex("_id") : -1;
        mDataSetObserver = new NotifyingDataSetObserver(this);
    }

    public Cursor getmCursor() {
        return mCursor;
    }

    @Override
    public int getItemCount() {
        if (mDataValid && mCursor != null) {
            return mCursor.getCount();
        }
        return 0;
    }


    @Override
    public long getItemId(int position) {
        if (mDataValid && mCursor != null && mCursor.moveToPosition(position)) {
            return mCursor.getLong(mRowIdColumn);
        }
        return 0;
    }

    @Override
    public void setHasStableIds(boolean hasStableIds) {
        super.setHasStableIds(true);
    }

    public static final String TAG = CursorRecyclerViewAdapter.class.getSimpleName();

    public abstract void onBindViewHolder(VH viewHolder, Cursor cursor);

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewTypew) {
        return null;
    }

    @Override
    public void onBindViewHolder(VH viewHolder, int position) {
        if (!mDataValid) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!mCursor.moveToPosition(position)) {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
        onBindViewHolder(viewHolder, mCursor);
    }

    public void changeCursor(Cursor cursor) {
        Cursor old = swapCursor(cursor);
        if (old != null) {
            old.close();
        }
    }

    public Cursor swapCursor(Cursor newCursor){
        if (newCursor == mCursor) {
            return null;
        }
        final Cursor oldCursor = mCursor;
        if (oldCursor != null && mDataSetObserver != null) {
            oldCursor.unregisterDataSetObserver(mDataSetObserver);
        }
        mCursor = newCursor;
        if (mCursor != null) {
            if (mDataSetObserver != null) {
                mCursor.registerDataSetObserver(mDataSetObserver);
            }
            mRowIdColumn = newCursor.getColumnIndexOrThrow("_id");
            mDataValid = true;
            notifyDataSetChanged();
        } else {
            mRowIdColumn = -1;
            mDataValid = false;
            notifyDataSetChanged();
        }
        return oldCursor;
    }

    public void setDataValid(boolean mDataValid){
        this.mDataValid = mDataValid;
    }
}



class NotifyingDataSetObserver extends DataSetObserver{
    private RecyclerView.Adapter adapter;

    public NotifyingDataSetObserver(RecyclerView.Adapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void onChanged() {
        super.onChanged();
        ((CursorRecyclerViewAdapter) adapter).setDataValid(true);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onInvalidated() {
        super.onInvalidated();
        ((CursorRecyclerViewAdapter) adapter).setDataValid(false);
    }
}

