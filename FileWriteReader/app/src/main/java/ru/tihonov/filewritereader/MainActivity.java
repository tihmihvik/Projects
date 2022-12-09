package ru.tihonov.filewritereader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    private static final String FILE_NAME = "context.text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private File getExternalFile_Path(){
        return new File(getExternalFilesDir(null), FILE_NAME);
    }

    // Сохранить файл
    public void saveText(View view){
        FileOutputStream fos = null;
        try {
            EditText textBox = (EditText) findViewById(R.id.editor);
            String text = textBox.getText().toString();
            fos = new FileOutputStream(getExternalFile_Path()); //openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(text.getBytes());
            Toast.makeText(this, "Файл успешно сохранён", Toast.LENGTH_LONG).show();;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e){
                e.printStackTrace();
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    // Открыть файл

    public void opentext (View view){
        FileInputStream fis = null;
        TextView textView = (TextView) findViewById(R.id.textView);
        File file = getExternalFile_Path();
        try {
            //fis = openFileInput(FILE_NAME);
            fis = new FileInputStream(file);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            String text =  new String(bytes);
            textView.setText(text);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        } catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            try {
                if (fis != null){
                    fis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }


}