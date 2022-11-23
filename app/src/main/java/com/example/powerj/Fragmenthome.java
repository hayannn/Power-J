package com.example.powerj;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmenthome extends Fragment {
    private Button btn_exercise;
    private Button btn_study;
    private Button btn_hobby;
    private Button btn_lifestyle;
    private Button btn_etc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        btn_exercise = view.findViewById(R.id.btn_exercise);
        btn_study = view.findViewById(R.id.btn_study);
        btn_hobby = view.findViewById(R.id.btn_hobby);
        btn_lifestyle = view.findViewById(R.id.btn_lifestyle);
        btn_etc = view.findViewById(R.id.btn_etc);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        btn_exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),CalendarActivity.class);
                startActivity(intent);
            }
        });

        btn_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),StudyActivity.class);
                startActivity(intent);
            }
        });

        btn_hobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),HobbyActivity.class);
                startActivity(intent);
            }
        });

        btn_lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),LifeStyleActivity.class);
                startActivity(intent);
            }
        });

        btn_etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),EtcActivity.class);
                startActivity(intent);
            }
        });
    }
}
