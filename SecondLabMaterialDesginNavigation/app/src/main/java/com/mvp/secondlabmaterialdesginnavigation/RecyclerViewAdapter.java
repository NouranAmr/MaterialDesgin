package com.mvp.secondlabmaterialdesginnavigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> myImages = new ArrayList<>();
    private ArrayList<String> myNames = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> myImages, ArrayList<String> myNames, Context context) {
        this.myImages = myImages;
        this.myNames = myNames;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Log.e(TAG, "onBindViewHolder:called.");
        Glide.with(context).asBitmap().load(myImages.get(position)).into(viewHolder.circleImageView);
        viewHolder.textView.setText(myNames.get(position));
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick :clicked on " + myNames.get(position));
                Intent intent = new Intent(context.getApplicationContext(), ImageBackgroundActivity.class);
                intent.putExtra("image", myImages.get(position));
                intent.putExtra("name", myNames.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView circleImageView;
        TextView textView;
        RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView = itemView.findViewById(R.id.circleimage_id);
            textView = itemView.findViewById(R.id.image_name);
            relativeLayout = itemView.findViewById(R.id.relative_id);
        }
    }
}