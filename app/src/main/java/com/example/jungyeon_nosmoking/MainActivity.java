package com.example.jungyeon_nosmoking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeFragment homeFragment = new HomeFragment();
    private IfmFragment ifmFragment = new IfmFragment();
    private ListFragment listFragment = new ListFragment();
    private ComFragment comFragment = new ComFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, homeFragment).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_menu);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch (item.getItemId())
                {
                    case R.id.first_tab:
                        transaction.replace(R.id.container,homeFragment).commitAllowingStateLoss();
                        break;
                    case R.id.second_tab:
                        transaction.replace(R.id.container, ifmFragment).commitAllowingStateLoss();
                        break;
                    case R.id.third_tab:
                        transaction.replace(R.id.container, listFragment).commitAllowingStateLoss();
                        break;
                    case R.id.fourth_tab:
                        transaction.replace(R.id.container, comFragment).commitAllowingStateLoss();
                        break;
                }
                return true;
            }
        });
    }
}