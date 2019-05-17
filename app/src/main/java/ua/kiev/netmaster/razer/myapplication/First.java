package ua.kiev.netmaster.razer.myapplication;


import android.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class First extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first, null);
        View v = inflater.inflate(R.layout.fragment1, null);

        int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
        LinearLayout llMain = (LinearLayout) v.findViewById(R.id.llMain);
        RadioGroup rGroup = (RadioGroup) v.findViewById(R.id.rGroup);
        EditText editText = (EditText) v.findViewById(R.id.editText);

        public void sendMessage(View v){
            switch (v.getId()) {
                case R.id.button2:
                    LinearLayout.LayoutParams myParams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                    int btnGravity = Gravity.LEFT;

                    switch (rGroup.getCheckedRadioButtonId()) {
                        case R.id.btnLeft:
                            btnGravity = Gravity.LEFT;
                            break;
                        case R.id.btnCenter:
                            btnGravity = Gravity.CENTER;
                            break;
                        case R.id.btnRight:
                            btnGravity = Gravity.RIGHT;
                            break;
                    }
                    myParams.gravity = btnGravity;

                    Button newButt = new Button(this);
                    newButt.setText(editText.getText().toString());
                    llMain.addView(newButt, myParams);
                    Toast.makeText(this, "Создан объект", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnClear:
                    llMain.removeAllViews();
                    Toast.makeText(this, "Удалено", Toast.LENGTH_LONG).show();
                    break;


            }
        }

    }

}
