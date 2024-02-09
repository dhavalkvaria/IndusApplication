package com.ambaitsystem.indusapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    ListView listView;
    String contacts[] = {"Ajay", "Sachin", "Sumit", "Tarun", "Yogesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);

        menu.setHeaderTitle("Select The Action");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.call:
                Toast.makeText(getApplicationContext(), "calling code", Toast.LENGTH_LONG).show();
                break;
            case R.id.sms:
                Toast.makeText(getApplicationContext(), "sending sms code", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}
