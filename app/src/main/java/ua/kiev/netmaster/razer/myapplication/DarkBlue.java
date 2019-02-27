package ua.kiev.netmaster.razer.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class DarkBlue extends AppCompatActivity implements View.OnClickListener {

   Button btnSave;
   Button btnLoad;
   EditText edText;
   SharedPreferences sPref;
   final String SAVED_TEXT = "saved_text";




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dark_blue);

btnSave = (Button) findViewById(R.id.btnSave);
btnLoad = (Button) findViewById(R.id.btnLoad);
edText = (EditText) findViewById(R.id.edText);

btnLoad.setOnClickListener(this);
btnSave.setOnClickListener(this);
        loadText();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSave:
                saveText();
                break;
            case R.id.btnLoad:
                loadText();
                break;
                default:
                    break;

        }




    }
    private void saveText() {
sPref = getPreferences(MODE_PRIVATE);
SharedPreferences.Editor ed = sPref.edit();
ed.putString(SAVED_TEXT, edText.getText().toString());
ed.apply();
        Toast.makeText(DarkBlue.this,"Text saved",Toast.LENGTH_SHORT).show();

    }
    private void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        edText.setText(savedText);
        Toast.makeText(DarkBlue.this,"Text loaded",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    saveText();
    }
}
