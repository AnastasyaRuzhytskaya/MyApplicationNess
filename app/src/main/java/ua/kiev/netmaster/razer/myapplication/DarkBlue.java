package ua.kiev.netmaster.razer.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RAZER on 08-Feb-18.
 */


public class DarkBlue extends Activity {


    int DIALOG_TIME = 1;
    int myHour = 14;
    int myMinute = 35;
    TextView tvTime;



public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dark_blue);
    tvTime = (TextView) findViewById(R.id.tvTime);


        }


    public void time(View view) {
    showDialog(DIALOG_TIME);
    }
    protected Dialog onCreateDialog(int id) {
    if (id == DIALOG_TIME){
        TimePickerDialog tpd = new TimePickerDialog( this, myCallBack, myHour, myMinute, true );
        return tpd;
    }

        return super.onCreateDialog(id);
    }


    TimePickerDialog.OnTimeSetListener myCallBack = new TimePickerDialog.OnTimeSetListener() {

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myHour = hourOfDay;
            myMinute = minute;
            tvTime.setText("Time is " + myHour + " hours " + myMinute + " minutes");
        }
    };
}
