package com.ambaitsystem.indusapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Toolbar_Menu_3_click extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_toolbar_menu_click);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar_2);
        toolbar.setLogo(getResources().getDrawable(android.R.drawable.btn_star_big_on)); // setting a logo in toolbar
        toolbar.setTitle("Tool With Menu Click");
        //To Show Back button on Activity
            //getSupportActionBar().setDisplayShowHomeEnabled(true);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_refresh:
                Toast.makeText(this, "You clicked Refresh", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_settings:
                Toast.makeText(this, "You clicked settings", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
