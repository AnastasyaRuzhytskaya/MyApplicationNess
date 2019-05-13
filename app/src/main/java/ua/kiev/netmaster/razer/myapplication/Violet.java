package ua.kiev.netmaster.razer.myapplication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Violet extends Activity {


    Fragment1 frag1;
    Fragment2 frag2;
    FragmentTransaction fTrans;
    CheckBox chbStack;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.violet);

        frag1 = new Fragment1();
        frag2 = new Fragment2();

        chbStack = (CheckBox)findViewById(R.id.chbStack);



    }
    public void onClick (View v){

        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btnAdd:
                fTrans.add(R.id.frgmCont, frag1);
                break;
            case R.id.btnRemove:
                fTrans.remove(frag1);
                break;
            case R.id.btnReplace:
                fTrans.replace(R.id.frgmCont, frag2);
            default:
                break;
        }
        if (chbStack.isChecked()) fTrans.addToBackStack(null);
        fTrans.commit();
    }





    }



