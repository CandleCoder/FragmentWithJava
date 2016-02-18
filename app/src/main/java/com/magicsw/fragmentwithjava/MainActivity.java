package com.magicsw.fragmentwithjava;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.magicsw.Interfaces.FragmentCommunicator;
import com.magicsw.fragments.FragmentB;

public class MainActivity extends AppCompatActivity implements FragmentCommunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager = getFragmentManager();
        FragmentB fb = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fb.changeData(data);
    }
}
