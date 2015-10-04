package com.example.everest.dnas;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;

public class Recorder extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_recorder);
    }

}
