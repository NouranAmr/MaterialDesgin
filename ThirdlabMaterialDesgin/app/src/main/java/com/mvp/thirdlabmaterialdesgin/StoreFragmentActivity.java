package com.mvp.thirdlabmaterialdesgin;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StoreFragmentActivity extends Fragment {
    View view;

    public StoreFragmentActivity() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= (View) inflater.inflate(R.layout.store_fragment,container,false);
        return view;
    }
}
