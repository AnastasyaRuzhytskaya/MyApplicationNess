package ua.kiev.netmaster.razer.myapplication;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class Yellow extends Fragment {

    final int MENU_ALPHA_ID = 1;
    final int MENU_SCALE_ID = 2;
    final int MENU_TRANSLATE_ID = 3;
    final int MENU_ROTATE_ID = 4;
    final int MENU_COMBO_ID = 5;

    TextView tv;
    public View onCreateView(LayoutInflater inflater, ViewGroup containerY,
                             Bundle savedInstanceState) {
        View vy = inflater.inflate(R.layout.yellow, containerY, false);

        tv = (TextView) vy.findViewById(R.id.tv);
        registerForContextMenu(tv);

        return vy;
    }


    public void onCreateContextMenu (ContextMenu contextMenu, View v,  ContextMenu.ContextMenuInfo menuInfo) {

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

    @RequiresApi(api = Build.VERSION_CODES.M)
    public boolean onContextItemSelected(MenuItem item) {
        Animation anim = null;

        switch (item.getItemId()) {
            case MENU_ALPHA_ID:
                // создаем объект анимации из файла anim/myalpha
                anim = (Animation) AnimationUtils.loadAnimation(getContext(), R.anim.myalpha);
                break;
            case MENU_SCALE_ID:
                anim = (Animation) AnimationUtils.loadAnimation(getContext(), R.anim.myscale);
                break;
            case MENU_TRANSLATE_ID:
                anim = (Animation) AnimationUtils.loadAnimation(getContext(), R.anim.mytrans);
                break;
            case MENU_ROTATE_ID:
                anim = (Animation) AnimationUtils.loadAnimation(getContext(), R.anim.myrotate);
                break;
            case MENU_COMBO_ID:
                anim = (Animation) AnimationUtils.loadAnimation(getContext(), R.anim.mycombo);
                break;
        }
        // запускаем анимацию для компонента tv
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}
