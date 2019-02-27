package ua.kiev.netmaster.razer.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RAZER on 08-Feb-18.
 */

public class Green extends AppCompatActivity implements View.OnClickListener {
    final Context context = this;
    TextView tvNifler;
    Button btnNifler;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green);

        tvNifler = (TextView) findViewById(R.id.text_nifler);
        btnNifler = (Button) findViewById(R.id.btn_nifler);
        btnNifler.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.nifler, null);

        mDialogBuilder.setView(promptsView);


        final EditText userInput = (EditText) promptsView.findViewById(R.id.input_text);
        mDialogBuilder
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //Вводим текст и отображаем в строке ввода на основном экране:
                                tvNifler.setText("Я проказливый нюхль! Меня зовут " + userInput.getText() + "!");
                            }
                        })
                .setNegativeButton("Отмена",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        //Создаем AlertDialog:
        AlertDialog alertDialog = mDialogBuilder.create();

        //и отображаем его:
        alertDialog.show();

    }
}


