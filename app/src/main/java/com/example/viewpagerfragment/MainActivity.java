package com.example.viewpagerfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.viewPager_main);
        SlideAdapter slideAdapter=new SlideAdapter(this);
        viewPager2.setAdapter(slideAdapter);
        viewPager2.setOrientation(viewPager2.ORIENTATION_VERTICAL);
        viewPager2.setCurrentItem(4);

        TabLayout tabLayout=findViewById(R.id.tabLayout_main);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("A");
                        break;
                    case 1:
                        tab.setText("B");
                        break;
                    case 2:
                        tab.setText("C");
                        break;
                    case 3:
                        tab.setText("D");
                        break;
                    case 4:
                        tab.setText("E");
                        break;
                }

            }
        });
        tabLayoutMediator.attach();




    }
}