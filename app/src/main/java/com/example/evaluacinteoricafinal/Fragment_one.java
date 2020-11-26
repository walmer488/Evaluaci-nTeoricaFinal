package com.example.evaluacinteoricafinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_one extends Fragment {

    private TextView txtTitle;
    String title;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
         txtTitle = view.findViewById(R.id.txtTitle);

         if (getArguments() != null){
             title = getArguments().getString("title");
             txtTitle.setText(title);
         }


        return view;
    }
}