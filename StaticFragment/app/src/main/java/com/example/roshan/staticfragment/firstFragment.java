package com.example.roshan.staticfragment;

import android.app.Activity;
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

public class firstFragment extends android.app.Fragment {
    Button frag1_b;
    EditText frag1_et;
    TextView frag1_tv;
    OnNameSetListener interface1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1 = inflater.inflate(R.layout.fragment_first, container, false);

        frag1_b = (Button) v1.findViewById(R.id.firstFragmentButtonid);
        frag1_et = (EditText) v1.findViewById(R.id.firstFragmentWriteHereEditText1id);
        frag1_tv = (TextView) v1.findViewById(R.id.firstFragmentOutputTextViewid);

        frag1_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = null;
                str1 = frag1_et.getText().toString();
                interface1.setName(str1);

            }
        });

        return v1;
    }

    public interface OnNameSetListener {
        public void setName(String str);

    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            interface1 = (OnNameSetListener) activity;
        } catch (Exception e) {
        }
    }


}
