package com.mvp.thirdlabmaterialdesgin;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appBarLayout=findViewById(R.id.appbar_id);
        viewPager=findViewById(R.id.viewpage_id);
        tabLayout=findViewById(R.id.tablayout_id);
        imageView=findViewById(R.id.imageview_id);
        ViewPagerAdapter viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new QuizFragmentActivity(),"Quiz");
        viewPagerAdapter.addFragment(new ExploreFragmentActivity(),"Explorer");
        viewPagerAdapter.addFragment(new StoreFragmentActivity(),"Store");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.beginFakeDrag();
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition()==0)
                {
                    imageView.setImageResource(R.drawable.quix);
                }
                else if(tab.getPosition()==1)
                {
                    imageView.setImageResource(R.drawable.scientist);
                }
                else
                {
                    imageView.setImageResource(R.drawable.scientist);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
