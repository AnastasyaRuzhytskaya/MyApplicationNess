package ua.kiev.netmaster.razer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {
LinearLayout llMain = (LinearLayout)findViewById(R.id.llMain);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);




    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_R:
                Intent iR = new Intent(this, Red.class);
                startActivity(iR);
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




}
