package com.mvp.secondlabmaterialdesginnavigation;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private static final String TAG = "MainActivity"; //logt
    private ArrayList<String> imagesArrayList = new ArrayList<>();
    private ArrayList<String> namesArrayList = new ArrayList<>();
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                LinearLayout root = (LinearLayout) findViewById( R.id.LinearLayoutFab);
                DisplayMetrics dm = new DisplayMetrics();
                MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics( dm );

                int originalPos[] = new int[2];
                view.getLocationOnScreen( originalPos );

                int xDest = dm.widthPixels/6;
                xDest -= (view.getMeasuredWidth());

                TranslateAnimation anim = new TranslateAnimation( 0, xDest - originalPos[0] , 0, 0 );
                anim.setDuration(1000);
                anim.setFillAfter( true );
                anim.setRepeatMode(Animation.REVERSE);
                anim.setRepeatCount(1);
                view.startAnimation(anim);
            }
        });
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);


        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        menuItem.setChecked(true);

                        drawerLayout.closeDrawers();

                        return true;
                    }
                });

        initImageBitmaps();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void  initImageBitmaps()
    {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/china.png");
        namesArrayList.add("China");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/india.png");
        namesArrayList.add("India");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/unitedstates.png");
        namesArrayList.add("UnitedStates");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/indonesia.png");
        namesArrayList.add("Indonesia");


        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/brazil.png");
        namesArrayList.add("Brazil");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/pakistan.png");
        namesArrayList.add("Pakistan");


        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/nigeria.png");
        namesArrayList.add("Nigeria");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/bangladesh.png");
        namesArrayList.add("Bangladesh");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/russia.png");
        namesArrayList.add("Russia");

        imagesArrayList.add("http://www.androidbegin.com/tutorial/flag/japan.png");
        namesArrayList.add("Japan");

        initRecyclerView();
    }
    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: initial recycleview");
        RecyclerView recyclerView= findViewById(R.id.countries_RecycleView);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(imagesArrayList, namesArrayList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
