package com.ambaitsystem.indusapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIntent = (Button) findViewById(R.id.btnIntent);
        btnIntent.setOnClickListener(this);


        Button btnLayouts = (Button) findViewById(R.id.btnLayouts);
        btnLayouts.setOnClickListener(this);

        Button btnUIEvents = (Button) findViewById(R.id.btnUIEvents);
        btnUIEvents.setOnClickListener(this);

        Button btnAlertDialog = (Button) findViewById(R.id.btnAlertDialog);
        btnAlertDialog.setOnClickListener(this);

        Button btnCustomDialog = (Button) findViewById(R.id.btnCustomDialog);
        btnCustomDialog.setOnClickListener(this);

        Button btnToolbar1 = (Button) findViewById(R.id.btnToolbar1);
        btnToolbar1.setOnClickListener(this);

        Button btnToolbar2 = (Button) findViewById(R.id.btnToolbar2);
        btnToolbar2.setOnClickListener(this);

        Button btnToolbar_with_click = (Button) findViewById(R.id.btnToolbar_with_click);
        btnToolbar_with_click.setOnClickListener(this);

        Button btnListview = (Button) findViewById(R.id.btnListview);
        btnListview.setOnClickListener(this);

        Button btnSpinner = (Button) findViewById(R.id.btnSpinner);
        btnSpinner.setOnClickListener(this);

        Button btnsqlite = (Button) findViewById(R.id.btnsqlite);
        btnsqlite.setOnClickListener(this);

        Button btnMySQL = (Button) findViewById(R.id.btnMySQL);
        btnMySQL.setOnClickListener(this);

        Button btnMySQL_select = (Button) findViewById(R.id.btnMySQL_select);
        btnMySQL_select.setOnClickListener(this);

        Button btnPlaySong = (Button) findViewById(R.id.btnPlaySong);
        btnPlaySong.setOnClickListener(this);

        Button btnTouchSensor = (Button) findViewById(R.id.btnTouchSensor);
        btnTouchSensor.setOnClickListener(this);

        Button btnAccelerometer = (Button) findViewById(R.id.btnAccelerometer);
        btnAccelerometer.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.btnIntent:
                    //Create Object of Intent
                    Intent myIntent0 = new Intent(this,e_Intent_Source_Activity.class);
                    startActivity(myIntent0);
                    break;


                case R.id.btnLayouts:
                    //Create Object of Intent
                    Intent myIntent2 = new Intent(this,LayoutDemoActivity.class);
                    startActivity(myIntent2);
                    break;

                case R.id.btnUIEvents:
                    //Create Object of Intent
                    Intent myIntent3 = new Intent(this,TestProjectActivity.class);
                    startActivity(myIntent3);
                    break;
                case R.id.btnAlertDialog:
                    //Create Object of Intent
                    Intent myIntent4 = new Intent(this,AlertDialog_4.class);
                    startActivity(myIntent4);
                    break;
                case R.id.btnCustomDialog:
                    //Create Object of Intent
                    Intent myIntent5 = new Intent(this,Custom_AlertDialog_5.class);
                    startActivity(myIntent5);
                    break;
                case R.id.btnToolbar1:
                    //Create Object of Intent
                    Intent myIntent6 = new Intent(this,Toolbar_1.class);
                    startActivity(myIntent6);
                    break;
                case R.id.btnToolbar2:
                    //Create Object of Intent
                    Intent myIntent7 = new Intent(this,Toolbar_Menu_2.class);
                    startActivity(myIntent7);
                    break;
                case R.id.btnToolbar_with_click:
                    //Create Object of Intent
                    Intent myIntent8 = new Intent(this,Toolbar_Menu_3_click.class);
                    startActivity(myIntent8);
                    break;

                case R.id.btnListview:
                    //Create Object of Intent
                    Intent myIntent9 = new Intent(this,ListviewActivity.class);
                    startActivity(myIntent9);
                    break;
                case R.id.btnSpinner:
                    //Create Object of Intent
                    Intent myIntent10 = new Intent(this,Spinner_1.class);
                    startActivity(myIntent10);
                    break;

                case R.id.btnsqlite:
                    //Create Object of Intent
                    Intent myIntent11 = new Intent(this,m_sqlite_database.class);
                    startActivity(myIntent11);
                    break;
                case R.id.btnMySQL:
                    //Create Object of Intent
                    Intent myIntent12 = new Intent(this,Activity_Web_API.class);
                    startActivity(myIntent12);
                    break;

                case R.id.btnMySQL_select:
                    //Create Object of Intent
                    Intent myIntent13 = new Intent(this,json_using_slim_10.class);
                    startActivity(myIntent13);
                    break;

                    case R.id.btnPlaySong:
                    //Create Object of Intent
                    Intent myIntent14 = new Intent(this,l_play_media.class);
                    startActivity(myIntent14);
                    break;

                case R.id.btnAccelerometer:
                    //Create Object of Intent
                    Intent myIntent15 = new Intent(this,Accelerometer_8.class);
                    startActivity(myIntent15);
                    break;

                case R.id.btnTouchSensor:
                    //Create Object of Intent
                    Intent myIntent16 = new Intent(this,Screen_tapping_7.class);
                    startActivity(myIntent16);
                    break;

            }
    }
}
