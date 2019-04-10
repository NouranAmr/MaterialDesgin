package com.mvp.secondlabmaterialdesgin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity"; //logt
    private ArrayList<String> imagesArrayList = new ArrayList<>();
    private ArrayList<String> namesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started . ");
        initImageBitmaps();

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
        RecyclerView recyclerView= findViewById(R.id.recycleView);
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(imagesArrayList, namesArrayList,this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
