package ua.kiev.netmaster.razer.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;


public class Red extends Fragment implements SeekBar.OnSeekBarChangeListener {

    Button btn1;
    Button btn2;
    SeekBar sBar;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.red, container, false);
        sBar = (SeekBar) v.findViewById(R.id.sBar);
        sBar.setOnSeekBarChangeListener(this);
        btn1 = (Button) v.findViewById(R.id.btn1);
        btn2 = (Button)v.findViewById(R.id.btn2);

        lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
        return v;
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int leftValue = progress;
        int rightValue = seekBar.getMax()-progress;

        lParams1.weight = leftValue;
        lParams2.weight = rightValue;

        btn1.setText(String.valueOf(leftValue));
        btn2.setText(String.valueOf(rightValue));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
