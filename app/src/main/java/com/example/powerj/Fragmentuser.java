package com.example.powerj;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmentuser extends Fragment {
    private Button btn_achieve;
    private Button btn_setting1;
    private Button btn_setting2;
    private Button btn_setting3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_user,container,false);
        btn_achieve = view.findViewById(R.id.btn_achieve);
        btn_setting1 = view.findViewById(R.id.btn_setting1);
        btn_setting2 = view.findViewById(R.id.btn_setting2);
        btn_setting3 = view.findViewById(R.id.btn_setting3);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        btn_achieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),BarChartActivity.class);
                startActivity(intent);
            }
        });

        btn_setting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),view);
                popupMenu.getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if (menuItem.getItemId() == R.id.action_menu1){
                            Intent intent = new Intent(getActivity(), SettingActivity.class);
                            startActivity(intent);
                        }else if (menuItem.getItemId() == R.id.action_menu2){
                            Intent intent = new Intent(getActivity(), Setting2Activity.class);
                            startActivity(intent);
                        }else if (menuItem.getItemId() == R.id.action_menu3){
                            Intent intent = new Intent(getActivity(), Setting3Activity.class);
                            startActivity(intent);
                        }else if (menuItem.getItemId() == R.id.action_menu4){
                            Intent intent = new Intent(getActivity(), Setting4Activity.class);
                            startActivity(intent);
                        }else {
                            Intent intent = new Intent(getActivity(), Setting5Activity.class);
                            startActivity(intent);
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
        btn_setting2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ConnectRoutineActivity.class);
                startActivity(intent);
            }
        });
        btn_setting3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
