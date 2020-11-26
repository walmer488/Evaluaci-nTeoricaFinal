package com.example.evaluacinteoricafinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;

public class TabLayout extends AppCompatActivity {


    private com.google.android.material.tabs.TabLayout tabLayout;
    private int[] tabIcons = {R.drawable.ic_email, R.drawable.ic_mesaje, R.drawable.ic_notifications};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ViewPager viewPager = findViewById(R.id.viewPager);
        loadViewPager(viewPager);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabIcons ();
        iconColor(tabLayout.getTabAt(tabLayout.getSelectedTabPosition()), "#3b5998");
        tabLayout.addOnTabSelectedListener(new com.google.android.material.tabs.TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(com.google.android.material.tabs.TabLayout.Tab tab) {
                iconColor(tab, "#3b5998");
            }

            @Override
            public void onTabUnselected(com.google.android.material.tabs.TabLayout.Tab tab) {
                iconColor(tab, "#E0E0E0");
            }

            @Override
            public void onTabReselected(com.google.android.material.tabs.TabLayout.Tab tab) {

            }
        });

    }

    private  void  iconColor(com.google.android.material.tabs.TabLayout.Tab tab, String color){
        tab.getIcon().setColorFilter(Color.parseColor(color), PorterDuff.Mode.SRC_IN);
    }

    private void tabIcons() {
        for (int i = 0; i<3; i++){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    private void loadViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(newIntance("Correos"));
        adapter.addFragment(newIntance("Mensajes"));
        adapter.addFragment(newIntance("Notificaciones"));
        viewPager.setAdapter(adapter);
    }

    private Fragment_one newIntance(String title){
        Bundle  bundle = new Bundle();
        bundle.putString("title", title);
        Fragment_one fragment_one = new Fragment_one();
        fragment_one.setArguments(bundle);
        return fragment_one;
    }
}