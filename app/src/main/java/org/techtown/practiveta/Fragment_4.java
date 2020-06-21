package org.techtown.practiveta;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_4 extends Fragment {


    public Fragment_4() {
        // Required empty public constructor
    }
    EditText kor1, kor3, kor4, eng1, eng3, eng4, math1,math3,math4;
    TextView ackor, aceng, acmath;
    TextView result,result2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_fragment_4,null);
        kor1 = (EditText)view.findViewById(R.id.kor1);
        kor3 = (EditText)view.findViewById(R.id.kor3);
        kor4 = (EditText)view.findViewById(R.id.kor4);
        eng1 = (EditText)view.findViewById(R.id.eng1);
        eng3 = (EditText)view.findViewById(R.id.eng3);
        eng4 = (EditText)view.findViewById(R.id.eng4);
        math1 = (EditText)view.findViewById(R.id.math1);
        math3 = (EditText)view.findViewById(R.id.math3);
        math4 = (EditText)view.findViewById(R.id.math4);
        result = view.findViewById(R.id.result);
        result2 = view.findViewById(R.id.result2);
        ackor = (TextView)view.findViewById(R.id.ackor);
        aceng = (TextView)view.findViewById(R.id.aceng);
        acmath  = (TextView)view.findViewById(R.id.acmath);
        Button btn_server = (Button) view.findViewById(R.id.button4);
        btn_server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboardFrom(getContext(),view);
                String fks1 = kor1.getText().toString();
                String fes1 = eng1.getText().toString();
                String fms1 = math1.getText().toString();
                String sks1 = kor3.getText().toString();
                String ses1 = eng3.getText().toString();
                String sms1 = math3.getText().toString();
                String tks1 = kor4.getText().toString();
                String tes1 = eng4.getText().toString();
                String tms1 = math4.getText().toString(); //잘됨
                int fks = Integer.parseInt(fks1);
                int fes = Integer.parseInt(fes1);
                int fms = Integer.parseInt(fms1);
                int kks = whatsscore(fks);
                int ees = whatsscore(fes);
                int mms = whatsscore(fms);
                double sks = Double.parseDouble(sks1);
                double ses = Double.parseDouble(ses1);
                double sms = Double.parseDouble(sms1);
                double tks = Double.parseDouble(tks1);
                double tes = Double.parseDouble(tes1);
                double tms = Double.parseDouble(tms1);
                int S = kks + ees + mms;
                int X = fks + fes + fms;
                double m = sks + ses + sms;
                double q = tks + tes + tms;
                double z1 = (X - m) / q;
                double z = Math.round(z1*100000)/100000.0;
                double notrealresult = (S * 0.94) + Math.round(NORMSDIST(z)*100000.0)/100000.0*23.4;
                double notbutrealresult = Math.round(notrealresult*100000)/100000.0;

                ((MainActivity)getActivity()).fouscore=notbutrealresult;
                String k1 = new Character((char)(70-kks)).toString();
                String e1 = new Character((char)(70-ees)).toString();
                String m1 = new Character((char)(70-mms)).toString();
                ackor.setText(k1);
                aceng.setText(e1);
                acmath.setText(m1);
                result.setText(Double.toString(notbutrealresult));
                result2.setText(Double.toString(Math.round(notbutrealresult/15*4*100000.0)/100000.0));
            }
        });

        return view;
    }
    public static double NORMSDIST(double z) { //정상작동
        // this guards against overflow
        if (z > 6)
            return 1;
        if (z < -6)
            return 0;

        double  gamma = 0.231641900,
                a1 = 0.319381530,
                a2 = -0.356563782,
                a3 = 1.781477973,
                a4 = -1.821255978,
                a5 = 1.330274429;

        double x = Math.abs(z);
        double t = 1 / (1 + gamma * x);
        double n = 1
                - (1 / (Math.sqrt(2 * Math.PI)) * Math.exp(-z * z / 2))
                * (a1 * t + a2 * Math.pow(t, 2) + a3 * Math.pow(t, 3) + a4
                * Math.pow(t, 4) + a5 * Math.pow(t, 5));
        if (z < 0)
            return 1.0 - n;
        return n;
    }
    public int whatsscore(int score){
        if(score>=90){
            return 5;
        }
        else if(score>=80){
            return 4;
        }
        else if(score>=70){
            return 3;
        }
        else if(score>=60){
            return 2;
        }
        else if(score>=50){
            return 1;
        }
        else{
            return 0;
        }

    }
    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
