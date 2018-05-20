package com.example.roshan.staticfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.roshan.staticfragment.R.id.secondFragmentid;

public class MainActivity extends AppCompatActivity implements firstFragment.OnNameSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setName(String str) {
        secondFragment fragment2 = getFragmentManager().findFragmentById(R.id.secondFragmentid);
        fragment2.updateData(str);
    }
}
