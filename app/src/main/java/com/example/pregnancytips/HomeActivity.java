package com.example.pregnancytips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Set Homepage
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home_Fragment()).commit();

        //Set Navigation
        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.showIconOnly();
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("HOME", R.drawable.icn_home_inactive));
        spaceNavigationView.addSpaceItem(new SpaceItem("TIPS", R.drawable.info));
        spaceNavigationView.changeCenterButtonIcon(R.drawable.ic_baseline_add_24);
        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this, R.color.main_pink));
        spaceNavigationView.addSpaceItem(new SpaceItem("EXCERCISE", R.drawable.icn_excercise));
        spaceNavigationView.addSpaceItem(new SpaceItem("PLAN", R.drawable.icn_calendar));

//Set Navigation Functions
        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            Fragment selectedFragment = null;

            @Override
            public void onCentreButtonClick() {
                selectedFragment = new Plan_Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                //Toast.makeText(HomeActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                switch (itemIndex){
                    case 0:
                        selectedFragment = new Home_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 1:
                        selectedFragment = new Tips_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 3:
                        selectedFragment = new Excercise_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 4:
                        selectedFragment = new Plan_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                //Toast.makeText(HomeActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                switch (itemIndex){
                    case 0:
                        selectedFragment = new Home_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 1:
                        selectedFragment = new Tips_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 3:
                        selectedFragment = new Excercise_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                    case 4:
                        selectedFragment = new Plan_Fragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        break;
                }
            }
        });
    }
}