package ua.kiev.netmaster.razer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.util.Log.*;


public class MainActivity extends AppCompatActivity  {


    public static final String EXTRA_MESSAGE = "com.example.MyApplicationNess.MESSAGE";
    public static final String TAG = "myLogs";
    private View view;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "Создание верхнего меню");
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, "Выбор кнопки по ид");
        switch (item.getItemId()) {
            case R.id.action_R:
                Intent iR = new Intent(this, Red.class);
                startActivity(iR);
                Log.d(TAG, "rainbow");
                Toast.makeText(this, "Зеленым небо, красным облака - а больше краски не было у чудака", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_favorite:
                Intent iRain = new Intent(this, ColorRain.class);
                startActivity(iRain);
                Toast.makeText(this, "Радуга - флаг геев :)", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_O:
                Intent iO = new Intent(this, Orange.class);
                startActivity(iO);
                Toast.makeText(this, "Оранджевый - новый черный! Крутой сериал", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_Y:
                Intent iY = new Intent(this, Yellow.class);
                startActivity(iY);
                Toast.makeText(this, "Желтое солнышко, желтый птенчик. Разве не чудесно?", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_G:
                Intent iG = new Intent(this, Green.class);
                startActivity(iG);
                Toast.makeText(this, "Если у тебя зеленое лицо - ты Шрэк", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_B:
                Intent iB = new Intent(this, Blue.class);
                startActivity(iB);
                Toast.makeText(this, "Блу - это голубой, а бла - так говорит Дракула", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_DB:
                Intent iDB = new Intent(this, DarkBlue.class);
                startActivity(iDB);
                Toast.makeText(this, "Ах, а когда-то у меня были синие глаза", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_V:
                Intent iV = new Intent(this, Violet.class);
                startActivity(iV);
                Toast.makeText(this, "Фиолетовый - цвет депрессии. С тобой все впорядке?", Toast.LENGTH_LONG).show();
                return true;

            default:


                return super.onOptionsItemSelected(item);

        }
    }

   /* public void sendMessage(View view) {

        Log.d(TAG, "обработка нажатия клавиши Send");
        Intent intent = new Intent(this, DisplayMessageActivity.class);


        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
        Toast.makeText(this, "Нажал на кнопку - получай результат", Toast.LENGTH_LONG).show();


    }
*/




//clickButton ------> sendMessage
public void sendMessage (View v){
    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
    LinearLayout llMain = (LinearLayout) findViewById(R.id.llMain);
    RadioGroup rGroup = (RadioGroup) findViewById(R.id.rGroup);
    EditText editText = (EditText) findViewById(R.id.editText);


        switch (v.getId()){
            case R.id.button2:
                LinearLayout.LayoutParams myParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                int btnGravity = Gravity.LEFT;

                switch (rGroup.getCheckedRadioButtonId()){
                    case R.id.btnLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.btnCenter:
                        btnGravity = Gravity.CENTER;
                        break;
                    case R.id.btnRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                myParams.gravity = btnGravity;

                Button newButt = new Button(this);
                newButt.setText(editText.getText().toString());
                llMain.addView(newButt,myParams);
                Toast.makeText(this, "Создан объект", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_LONG).show();
                break;


        }

}

}

