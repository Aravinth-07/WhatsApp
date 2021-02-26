package com.aravinth.whatsapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar custom_toolbar;
    private RecyclerView recyclerView;
    String s1[],s2[];
    int images[] = {R.drawable.mydp1,R.drawable.mydp1,R.drawable.mydp1,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,
            R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,
            R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,
            R.drawable.mydp,R.drawable.mydp,R.drawable.mydp,R.drawable.mydp};


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem chats = findViewById(R.id.chats);
        TabItem status = findViewById(R.id.status);
        TabItem calls = findViewById(R.id.chats);
        final ViewPager viewPager = findViewById(R.id.viewPager);

        custom_toolbar = findViewById(R.id.custom_toolbar);
        setSupportActionBar(custom_toolbar);
        getSupportActionBar().setTitle("WhatsApp");

        recyclerView = findViewById(R.id.recycler_view);
        s1 = getResources().getStringArray(R.array.name);
        s2 = getResources().getStringArray(R.array.description);
        customAdapter cust = new customAdapter(this,s1,s2,images);
        recyclerView.setAdapter(cust);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.custom_toolbar_menu,menu);
        return true;
    }
}
