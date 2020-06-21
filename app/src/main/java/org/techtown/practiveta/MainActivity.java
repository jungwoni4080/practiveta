package org.techtown.practiveta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.ActionBar;
import android.app.TimePickerDialog;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{


    double twoscore;
    double onescore;
    double thrscore;
    double fouscore;
    double fivscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tablayout
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("결과"));
        tabs.addTab(tabs.newTab().setText("정보"));
        tabs.addTab(tabs.newTab().setText("2-1"));
        tabs.addTab(tabs.newTab().setText("2-2"));
        tabs.addTab(tabs.newTab().setText("3-1"));
        tabs.addTab(tabs.newTab().setText("3-2"));
        tabs.addTab(tabs.newTab().setText("생기부"));
        tabs.setTabGravity(tabs.GRAVITY_FILL);

        //Adapter
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        final MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), 7);
        viewPager.setAdapter(myPagerAdapter);

        //탭 선택 이벤트
        tabs.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
    }


}