package ua.kiev.netmaster.razer.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Green extends Fragment implements View.OnClickListener {

     /*Context context = this ;
    TextView tvNifler;
    Button btnNifler;*/
    public View onCreateView(LayoutInflater inflater, ViewGroup containerG,
                             Bundle savedInstanceState) {
        View vg = inflater.inflate(R.layout.green, containerG, false);


        /*tvNifler = (TextView) vg.findViewById(R.id.text_nifler);
        btnNifler = (Button) vg.findViewById(R.id.btn_nifler);
        btnNifler.setOnClickListener(this);*/
        return vg;
    }

    @Override
    public void onClick(View v) {
       /* AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context);
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
        alertDialog.show();*/

    }
}


