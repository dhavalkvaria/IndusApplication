package com.ambaitsystem.indusapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Toolbar_1 extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_toolbar);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        //Set Text to Tool bar
        toolbar.setTitle("Hi Dhaval");
        setSupportActionBar(toolbar);
    }
}
