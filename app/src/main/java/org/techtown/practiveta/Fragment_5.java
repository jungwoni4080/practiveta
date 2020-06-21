package org.techtown.practiveta;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_5 extends Fragment {
    double ecus;
    double one,two,three,four,five,six;
    TextView textView, textView2,result1,result2;
    String[] items = {"0회","1회","2회","3회","4회","5회 이상"};
    String[] items2 = {"0회","1회","2회","3회 이상"};
    String[] items3 = {"0회","1회","2회","3회","4회","5회","6회 이상"};
    String[] items4 = {"0회","1회","2회","3회","4회","5회 이상"};
    String[] items5 = {"10시간 이하","11-20시간","21-30시간","31-40시간","41-50시간","51-59시간","60시간 이상"};
    String[] items6 = {"5권","6-7권","8-9권","10-11권","12-13권","14-15권","16-17권","18-19권","20-21권","22-23권","24-25권","26-27권","28-29권","30권 이상"};
    public Fragment_5() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_5,null);
        final Spinner spinner1 = (Spinner)view.findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner)view.findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner)view.findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner)view.findViewById(R.id.spinner4);
        final Spinner spinner5 = (Spinner)view.findViewById(R.id.spinner5);
        final Spinner spinner6 = (Spinner)view.findViewById(R.id.spinner6);
        final TextView textView2 = (TextView)view.findViewById(R.id.textView10);
        result1 = (TextView)view.findViewById(R.id.result);
        result2 = (TextView)view.findViewById(R.id.result2);
        ArrayAdapter<String> adapterSpinner1 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapterSpinner2 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapterSpinner3 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapterSpinner4 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapterSpinner5 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        ArrayAdapter<String> adapterSpinner6 = new ArrayAdapter(this.getActivity(), android.R.layout.simple_spinner_item);
        adapterSpinner1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinner2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinner3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinner4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinner5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinner6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(adapterSpinner1);
        spinner2.setAdapter(adapterSpinner2);
        spinner3.setAdapter(adapterSpinner3);
        spinner4.setAdapter(adapterSpinner4);
        spinner5.setAdapter(adapterSpinner5);
        spinner6.setAdapter(adapterSpinner6);
        adapterSpinner1.addAll(items);
        adapterSpinner2.addAll(items2);
        adapterSpinner3.addAll(items3);
        adapterSpinner4.addAll(items4);
        adapterSpinner5.addAll(items5);
        adapterSpinner6.addAll(items6);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location = spinner1.getSelectedItem().toString();
                if(location==items[0]){
                    one = 0;
                }
                else if(location==items[1]){
                    one = -1;
                }
                else if(location==items[2]){
                    one = -2;
                }
                else if(location==items[3]){
                    one = -3;
                }
                else if(location==items[4]){
                    one = -4;
                }
                else {
                    one = -5;
                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location2 = spinner2.getSelectedItem().toString();
                if(location2==items2[0]){
                    two = 0;
                }
                else if(location2==items2[1]){
                    two = -0.3;
                }
                else if(location2==items2[2]) {
                    two = -0.6;
                }
                else {
                    two=-1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location3 = spinner3.getSelectedItem().toString();
                if(location3==items3[0]){
                    three = -2;
                }
                else if(location3==items3[1]){
                    three = -1;
                }
                else if(location3==items3[2]) {
                    three = -0.8;
                }
                else if(location3==items3[3]) {
                    three = -0.6;
                }
                else if(location3==items3[4]) {
                    three = -0.4;
                }
                else if(location3==items3[5]) {
                    three = -0.2;
                }
                else {
                    three=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location4 = spinner4.getSelectedItem().toString();
                if(location4==items4[0]){
                    four = -1;
                }
                else if(location4==items4[1]){
                    four = -0.8;
                }
                else if(location4==items4[2]) {
                    four = -0.6;
                }
                else if(location4==items4[3]) {
                    four = -0.4;
                }
                else if(location4==items4[4]) {
                    four = -0.2;
                }
                else {
                    four=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location5 = spinner5.getSelectedItem().toString();
                if(location5==items5[0]){
                    five = -2;
                }
                else if(location5==items5[1]){
                    five=  -1;
                }
                else if(location5==items5[2]) {
                    five = -0.8;
                }
                else if(location5==items5[3]) {
                    five = -0.6;
                }
                else if(location5==items5[4]) {
                    five = -0.4;
                }
                else if(location5==items5[5]) {
                    five = -0.2;
                }
                else {
                    five=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String location6 = spinner6.getSelectedItem().toString();
                if(location6==items6[0]){
                    six = -3;
                }
                else if(location6==items6[1]){
                    six=  -2.4;
                }
                else if(location6==items6[2]) {
                    six = -2.2;
                }
                else if(location6==items6[3]) {
                    six = -2.0;
                }
                else if(location6==items6[4]) {
                    six = -1.8;
                }
                else if(location6==items6[5]) {
                    six = -1.6;
                }
                else if(location6==items6[6]) {
                    six = -1.4;
                }
                else if(location6==items6[7]) {
                    six = -1.2;
                }
                else if(location6==items6[8]) {
                    six = -1.0;
                }
                else if(location6==items6[9]) {
                    six = -0.8;
                }
                else if(location6==items6[10]) {
                    six = -0.6;
                }
                else if(location6==items6[11]) {
                    six = -0.4;
                }
                else if(location6==items6[12]) {
                    six = -0.2;
                }
                else {
                    six=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("");
            }
        });

        Button btn_server = (Button) view.findViewById(R.id.notbad);
        btn_server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ecus = one + two + three+four+five+six;
                ((MainActivity)getActivity()).fivscore = (double)20+ecus;
                double scoreing =((double)20+ecus);
                result1.setText(Double.toString(Math.round(scoreing*10.0)/10.0));
                result2.setText(Double.toString(Math.round(scoreing*10.0)/10.0));
            }
        });

        return view;
    }

}
