package ua.kiev.netmaster.razer.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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



public class MainActivity extends AppCompatActivity {


    ColorRain rain = new ColorRain();
    First first = new First();
    Red red = new Red();
    Blue blue = new Blue();
    DarkBlue dark_blue = new DarkBlue();
    Green green = new Green();
    Orange orange = new Orange();
    Violet violet = new Violet();
    Yellow yellow = new Yellow();
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
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();



        Log.d(TAG, "Выбор кнопки по ид");
        switch (item.getItemId()) {
            case R.id.action_favorite:

                fragmentTransaction.replace(R.id.main, rain);


                Toast.makeText(this, "Fragment :)", Toast.LENGTH_LONG).show();
                break;

            case R.id.action_R:
                fragmentTransaction.replace(R.id.main, red );
                Toast.makeText(this, "Это фрагмент", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_O:
                fragmentTransaction.replace(R.id.main, orange );
                Toast.makeText(this, "Оранджевый fragment", Toast.LENGTH_LONG).show();
                break;

            case R.id.action_Y:
                fragmentTransaction.replace(R.id.main, yellow );
                Toast.makeText(this, "Желтое Fragment", Toast.LENGTH_LONG).show();
                break;

            case R.id.action_G:
                fragmentTransaction.replace(R.id.main, green );
                Toast.makeText(this, "Fragment green", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_B:
                fragmentTransaction.replace(R.id.main, blue);
                Toast.makeText(this, "Блу - это Fragment", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_DB:
                fragmentTransaction.replace(R.id.main, dark_blue );
                Toast.makeText(this, "Fragment dark blue", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_V:
                fragmentTransaction.replace(R.id.main, violet );
                Toast.makeText(this, "Фиолетовый - цвет депрессии. Fragment", Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }
        fragmentTransaction.commit();
        return super.onOptionsItemSelected(item);

    }

}



