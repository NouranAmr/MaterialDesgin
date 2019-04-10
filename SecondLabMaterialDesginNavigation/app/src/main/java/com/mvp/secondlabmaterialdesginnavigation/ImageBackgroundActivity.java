package com.mvp.secondlabmaterialdesginnavigation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

public class ImageBackgroundActivity extends AppCompatActivity {
    private RelativeLayout relativeLayout;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_background);
        relativeLayout=findViewById(R.id.relativeImage_id);
        textView=findViewById(R.id.name);
        Intent intent=getIntent();
        String personName=intent.getStringExtra("name");
        String imaage = intent.getStringExtra("image");
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            relativeLayout.setBackground(getIntent().getArra("image"));
        }*/
        textView.setText(personName);
        // Glide.with(context).asBitmap().load(myImages.get(position)).into(viewHolder.circleImageView);
        Glide.with(getApplicationContext()).asBitmap()
                .load(imaage)
                .into(new SimpleTarget<Bitmap>(100,100) {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        Drawable dr = new BitmapDrawable(resource);
                        relativeLayout.setBackgroundDrawable(dr);
                    }

                });

    }
    }

