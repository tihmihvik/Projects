package customgenerictypes;

public class Account<T> implements Accounttable<T> {
    private T id;
    private Object sumsit;
    private int sum;

    <S> Account(T id, int sum, S sumsit){
        this(id,sum);
        this.sumsit = sumsit;
    }

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    @Override
    public T setId() {
        return null;
    }


    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
