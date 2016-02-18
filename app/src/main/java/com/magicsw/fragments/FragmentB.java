package com.magicsw.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magicsw.fragmentwithjava.R;

/**
 * Created by manikant.upadhyay on 2/18/2016.
 */
public class FragmentB extends Fragment {
    TextView tv;
    String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_b,container,false);

        if(savedInstanceState == null){
          //Do nothing
        }
        else {
            data =savedInstanceState.getString("Text");
          TextView savedTv= (TextView) view.findViewById(R.id.textView);
          savedTv.setText(data);
        }

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Text", data);
    }

    public void changeData(String data){
        this.data = data;
        tv.setText(data);
    }
}
