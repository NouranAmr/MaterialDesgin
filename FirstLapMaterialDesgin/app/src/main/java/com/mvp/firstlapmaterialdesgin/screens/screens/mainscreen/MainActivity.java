package com.mvp.firstlapmaterialdesgin.screens.screens.mainscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import com.mvp.firstlapmaterialdesgin.R;
import com.mvp.firstlapmaterialdesgin.screens.screens.constraintscreen.ConstraintActivity;
import com.mvp.firstlapmaterialdesgin.screens.screens.framescreen.FrameActivity;
import com.mvp.firstlapmaterialdesgin.screens.screens.gridscreen.GridActivity;
import com.mvp.firstlapmaterialdesgin.screens.screens.linearscreen.LinearScreen;
import com.mvp.firstlapmaterialdesgin.screens.screens.relativescreen.RelativeActivity;

public class MainActivity extends AppCompatActivity {

    Button constraint_btn , grid_btn,linear_btn , relative_btn , frame_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraint_btn=findViewById(R.id.constraint_btn);
        grid_btn=findViewById(R.id.grid_btn);
        linear_btn=findViewById(R.id.linear_btn);
        relative_btn=findViewById(R.id.relative_btn);
        frame_btn=findViewById(R.id.frame_btn);

        grid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (MainActivity.this, GridActivity.class);
                startActivity(intent);

            }
        });
        linear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent (MainActivity.this, LinearScreen.class);
                startActivity(intent);

            }
        });
        frame_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (MainActivity.this, FrameActivity.class);
                startActivity(intent);
            }
        });
        relative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (MainActivity.this, RelativeActivity.class);
                startActivity(intent);
            }
        });
        constraint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (MainActivity.this, ConstraintActivity.class);
                startActivity(intent);
            }
        });
    }
}
