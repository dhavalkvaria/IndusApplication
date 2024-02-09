package com.ambaitsystem.indusapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class Toolbar_Menu_2 extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_toolbar_menu);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar_2);
        toolbar.setTitle("Tool With Menu");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_navigation, menu);
        return true;
    }
}
