package ua.kiev.netmaster.razer.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class Yellow extends AppCompatActivity {
public static final String TAG  = "TAG";
    final int MENU_ALPHA_ID = 1;
    final int MENU_SCALE_ID = 2;
    final int MENU_TRANSLATE_ID = 3;
    final int MENU_ROTATE_ID = 4;
    final int MENU_COMBO_ID = 5;

    TextView tv;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellow);

        tv = (TextView) findViewById(R.id.tv);
        registerForContextMenu(tv);

    }
    public void onCreateContextMenu (ContextMenu contextMenu, View v,  ContextMenu.ContextMenuInfo menuInfo) {
        Log.d(TAG, "Создание меню ");
        switch (v.getId()) {
            case R.id.tv:
                // добавляем пункты
                contextMenu.add(0, MENU_ALPHA_ID, 0, "alpha");
                contextMenu.add(0, MENU_SCALE_ID, 0, "scale");
                contextMenu.add(0, MENU_TRANSLATE_ID, 0, "translate");
                contextMenu.add(0, MENU_ROTATE_ID, 0, "rotate");
                contextMenu.add(0, MENU_COMBO_ID, 0, "combo");
                break;
        }
        super.onCreateContextMenu(contextMenu, v, menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item) {
        Animation anim = null;
        Log.d(TAG, "Выбор элементов меню ");
        // определяем какой пункт был нажат
        switch (item.getItemId()) {
            case MENU_ALPHA_ID:
                // создаем объект анимации из файла anim/myalpha
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MENU_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MENU_TRANSLATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
            case MENU_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MENU_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
        }
        // запускаем анимацию для компонента tv
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}
