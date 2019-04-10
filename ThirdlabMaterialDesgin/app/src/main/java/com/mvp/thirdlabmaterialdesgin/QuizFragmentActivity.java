package com.mvp.thirdlabmaterialdesgin;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class QuizFragmentActivity extends Fragment {
    View view;

    public QuizFragmentActivity() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= (View) inflater.inflate(R.layout.quiz_fragment,container,false);
        return view;
    }
}
