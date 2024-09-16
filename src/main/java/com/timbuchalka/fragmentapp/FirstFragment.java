package com.timbuchalka.fragmentapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {


    @Override
    public void onAttach(@NonNull Context context) {

        Toast.makeText(context, "onAttach() is called", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(), "onResume() is called", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onStart() {

        Toast.makeText(getActivity(), "onStart() is called", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);

        Button firstBtn = view.findViewById(R.id.btn_frag1);
        TextView text = view.findViewById(R.id.text_frag1);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Welcome to the First Fragment",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}