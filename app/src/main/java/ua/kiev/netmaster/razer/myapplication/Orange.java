package ua.kiev.netmaster.razer.myapplication;

import android.os.Bundle;
import android.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class Orange extends Fragment implements View.OnClickListener {
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    EditText etNum1;
    EditText etNum2;

    TextView tvResult;

    String oper = "";

    public View onCreateView(LayoutInflater inflater, ViewGroup containerO,
                             Bundle savedInstanceState) {
        View vo = inflater.inflate(R.layout.orange, containerO, false);
        btnAdd = (Button) vo.findViewById(R.id.btnAdd);
        btnSub = (Button) vo.findViewById(R.id.btnSub);
        btnMult = (Button)vo.findViewById(R.id.btnMult);
        btnDiv = (Button) vo.findViewById(R.id.btnDiv);

        etNum1 = (EditText)vo.findViewById(R.id.etNum1);
        etNum2 = (EditText) vo.findViewById(R.id.etNum2);

        tvResult = (TextView) vo.findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        return vo;
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
