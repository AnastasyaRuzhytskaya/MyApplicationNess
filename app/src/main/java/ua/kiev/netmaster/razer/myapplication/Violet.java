package ua.kiev.netmaster.razer.myapplication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class Violet extends Fragment implements View.OnClickListener{


    Fragment1 frag1;
    Fragment2 frag2;
    FragmentTransaction fTrans;
    CheckBox chbStack;
    Button btnAdd;
    Button btnRemove;
    Button btnReplace;


    public View onCreateView(LayoutInflater inflater, ViewGroup containerV,
                             Bundle savedInstanceState) {
        View vv = inflater.inflate(R.layout.violet, containerV, false);

        frag1 = new Fragment1();
        frag2 = new Fragment2();
        btnAdd = (Button) vv.findViewById(R.id.btnAdd);
        btnRemove = (Button) vv.findViewById(R.id.btnRemove);
        btnReplace = (Button) vv.findViewById(R.id.btnReplace);

        btnAdd.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
        btnReplace.setOnClickListener(this);

        chbStack = (CheckBox)vv.findViewById(R.id.chbStack);


      return vv;
    }
    public void onClick (View v){

        fTrans = getFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.btnAdd:
                fTrans.add(R.id.frgmCont, frag1);
                break;
            case R.id.btnRemove:
                fTrans.remove(frag1);
                fTrans.remove(frag2);
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



