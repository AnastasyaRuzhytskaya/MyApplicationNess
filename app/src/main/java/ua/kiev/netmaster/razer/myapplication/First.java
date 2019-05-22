package ua.kiev.netmaster.razer.myapplication;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class First extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first, null);

        Button button2 = (Button) v.findViewById(R.id.button2);
        //Button btnClear = (Button) v.findViewById(R.id.btnClear);

        button2.setOnClickListener(new OnClickListener() {
            public void onClick (View v) {
                Toast toast = Toast.makeText(getActivity(),"Пора покормить кота!", Toast.LENGTH_SHORT);
                toast.show();


            }
        });

        return v;
    }
    }


