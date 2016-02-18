package com.magicsw.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magicsw.fragmentwithjava.R;

/**
 * Created by manikant.upadhyay on 2/17/2016.
 */
public class MyFragment extends Fragment {


    //Attaching my_fragment_layout with Java file

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_layout,container,false);
    }
}
