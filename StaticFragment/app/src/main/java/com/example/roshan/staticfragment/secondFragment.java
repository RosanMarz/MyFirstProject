package com.example.roshan.staticfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class secondFragment extends android.app.Fragment {
    Button frag2_b;
    EditText frag2_et;
    TextView frag2_tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v2 = inflater.inflate(R.layout.fragment_second,container,false);
        frag2_tv = v2.findViewById(R.id.secondFragmentOutputTextViewid);
        return v2;
    }
    public void updateData(String s){
        frag2_tv.setText(s);
    }


}
