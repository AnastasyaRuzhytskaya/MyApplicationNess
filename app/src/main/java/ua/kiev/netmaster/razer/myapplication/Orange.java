package ua.kiev.netmaster.razer.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class Orange extends AppCompatActivity implements View.OnClickListener {
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    EditText etNum1;
    EditText etNum2;

    TextView tvResult;

    String oper = "";



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orange);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        etNum1 = (EditText)findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (v.getId()){
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1*num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
                default:
                    break;
        }
tvResult.setText(num1 + " "+ oper +" "+ num2+ "="+ result);
    }
}
