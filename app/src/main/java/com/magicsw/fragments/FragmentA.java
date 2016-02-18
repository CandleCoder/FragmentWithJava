package com.magicsw.fragments;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.magicsw.Interfaces.FragmentCommunicator;
import com.magicsw.fragmentwithjava.R;

/**
 * Created by manikant.upadhyay on 2/17/2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener {
    Button button;
    int counter = 0;
    FragmentCommunicator fc;
    //Attaching fragment_a with Java file

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fc = (FragmentCommunicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       counter++;
        fc.respond("The button is clicked "+counter+" times");
    }
}
