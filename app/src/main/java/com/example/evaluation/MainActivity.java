package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Fragment;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

//    private DatabaseHelper databaseHelper;
//    private SQLiteDatabase database;
//    private TextView dataTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);


        tabLayout.setupWithViewPager(viewPager);
        Adapter adapter=new Adapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

//        CategoryItemsFragment categoryItemsFragment = new CategoryItemsFragment();
//        Fragment fragment = categoryItemsFragment;
//        adapter.addFragment(fragment, "Your String");


        adapter.addFragment(new CategoriesFragment(),"Meal List");
        adapter.addFragment(new CategoryItemsFragment(),"Meal Cart");
        viewPager.setAdapter(adapter);


    }


}