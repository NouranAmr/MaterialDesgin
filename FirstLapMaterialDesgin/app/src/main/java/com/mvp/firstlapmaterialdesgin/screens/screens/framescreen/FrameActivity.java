package com.mvp.firstlapmaterialdesgin.screens.screens.framescreen;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mvp.firstlapmaterialdesgin.R;

import java.util.Timer;
import java.util.TimerTask;

public class FrameActivity extends AppCompatActivity {

    // Create a TextView array to store TextView components in FrameLayout layout component.
    private TextView textViewArr[] = new TextView[7];

    // Store current color value.
    private int currColor = 0;

    // Initialise an int color array.
    private final int[] colorArr = new int[]{
            R.color.colorRed,
            R.color.colorOrange,
            R.color.colorYellow,
            R.color.colorGreen,
            R.color.colorCyan,
            R.color.colorBlue,
            R.color.colorPurple
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }

}
