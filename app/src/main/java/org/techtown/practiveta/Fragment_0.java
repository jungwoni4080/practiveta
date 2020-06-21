package org.techtown.practiveta;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_0 extends Fragment {

    TextView one1,one2,one3,one4,one5,one7,two1,two2,two3,two4,two5,two7,jageuk1,jageuk2;
    EditText p1;
    double onescore;
    double twoscore;
    double thrscore;
    double fouscore;
    double fivscore;
    public Fragment_0() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_0,null);
        p1=view.findViewById(R.id.JAJAJA);

        one2= (TextView)view.findViewById(R.id.one2);
        one3= (TextView)view.findViewById(R.id.one3);
        one4= (TextView)view.findViewById(R.id.one4);
        one5= (TextView)view.findViewById(R.id.one5);
        one7= (TextView)view.findViewById(R.id.one7);
        one1= (TextView)view.findViewById(R.id.one1);
        two1= (TextView)view.findViewById(R.id.textView63);
        two2= (TextView)view.findViewById(R.id.textView62);
        two3= (TextView)view.findViewById(R.id.textView61);
        two4= (TextView)view.findViewById(R.id.textView60);
        two5= (TextView)view.findViewById(R.id.textView59);
        two7= (TextView)view.findViewById(R.id.textView57);
        jageuk1=view.findViewById(R.id.jageuk1);
        jageuk2=view.findViewById(R.id.jageuk2);

        twoscore = ((MainActivity)getActivity()).twoscore;
        double twoscore1=Math.round(twoscore*4/15*100000.0)/100000.0;
        String second1 = String.format("%.5f",twoscore);
        String second2 = String.format("%.5f",twoscore1);
        one2.setText(second1);
        two2.setText(second2);
        //one2.setText(Double.toString(twoscore));
        //two2.setText(Double.toString(Math.round(twoscore*4/15*100000.0)/100000.0));

        onescore = ((MainActivity)getActivity()).onescore;
        double onescore1 = Math.round(onescore*4/15*100000.0)/100000.0;
        String first1 = String.format("%.5f",onescore);
        String first2 = String.format("%.5f",onescore1);
        one1.setText(first1);
        two1.setText(first2);

        thrscore = ((MainActivity)getActivity()).thrscore;
        double thrscore1 = Math.round(thrscore*4/15*100000.0)/100000.0;
        String third1 = String.format("%.5f",thrscore);
        String third2 = String.format("%.5f",thrscore1);
        one3.setText(third1);
        two3.setText(third2);

        fouscore = ((MainActivity)getActivity()).fouscore;
        double fouscore1 = Math.round(fouscore*4/15*100000.0)/100000.0;
        String fourth1 = String.format("%.5f",fouscore);
        String fourth2 = String.format("%.5f",fouscore1);
        one4.setText(fourth1);
        two4.setText(fourth2);

        fivscore = ((MainActivity)getActivity()).fivscore;
        one5.setText(Double.toString(fivscore));
        two5.setText(Double.toString(Math.round(fivscore*100000.0)/100000.0));

        Button btn_server = (Button) view.findViewById(R.id.Great_Button);
        btn_server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jageuk = p1.getText().toString();
                double jageukjung = Double.parseDouble(jageuk);
                if(jageukjung>2){
                    jageukjung=2;
                }
                jageuk1.setText(Double.toString(jageukjung));
                jageuk2.setText(Double.toString(jageukjung));
                double notbutrealresult=onescore+twoscore+thrscore+fouscore;
                one7.setText(Double.toString(Math.round((notbutrealresult+fivscore)*100000.0)/100000.0+jageukjung));
                two7.setText(Double.toString(Math.round(notbutrealresult*4/15*100000.0)/100000.0+jageukjung+Math.round(fivscore*10.0)/10.0));
            }
        });
        return view;
    }

}
