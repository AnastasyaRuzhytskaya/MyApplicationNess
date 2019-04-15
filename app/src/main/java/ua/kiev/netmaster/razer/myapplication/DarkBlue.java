package ua.kiev.netmaster.razer.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

/**
 * Created by RAZER on 08-Feb-18.
 */


public class DarkBlue extends Activity {


    int DIALOG_TIME = 1;
    int myYear = 2019;
    int myMonth = 2;
    int myDay = 28;
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
        if (id == DIALOG_TIME) {
            DatePickerDialog tpd = new DatePickerDialog(this, myCallBack, myYear, myMonth, myDay);
            return tpd;
        }

        return super.onCreateDialog(id);
    }

    DatePickerDialog.OnDateSetListener myCallBack = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int month, int day) {
            myYear = year;
            myMonth = month;
           myDay = day+1;

            tvTime.setText("Today is " + myDay + "/" + myMonth + "/" +  myYear + "/" );
        }
    };
}
