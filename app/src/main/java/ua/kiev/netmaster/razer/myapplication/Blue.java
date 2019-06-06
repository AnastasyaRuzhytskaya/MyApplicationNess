package ua.kiev.netmaster.razer.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class Blue extends Fragment implements View.OnClickListener {



    public View onCreateView(LayoutInflater inflater, ViewGroup containerB,
                             Bundle savedInstanceState) {

        View vb = inflater.inflate(R.layout.blue, containerB, false);


        Button btnWeb = (Button) vb.findViewById(R.id.btnWeb);
        Button btnMap = (Button) vb.findViewById(R.id.btnMap);
        Button btnCall = (Button) vb.findViewById(R.id.btnCall);
        btnWeb.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnCall.setOnClickListener( this);
        return vb;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnWeb:
                intent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100009385320503"));
                startActivity(intent);
                break;
            case R.id.btnMap:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:50.470793, 30.329505"));
                startActivity(intent);
                break;
            case R.id.btnCall:
                intent = new Intent (Intent.ACTION_DIAL, Uri.parse("tel:1234567"));

                startActivity(intent);
                break;
        }

    }
}
