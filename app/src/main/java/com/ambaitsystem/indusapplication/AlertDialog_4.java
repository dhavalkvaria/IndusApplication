package com.ambaitsystem.indusapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialog_4 extends AppCompatActivity implements View.OnClickListener {

    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog_4);

        Button btnclickme = (Button) findViewById(R.id.btnclickme);
        btnclickme.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AlertDialog_4.this);

        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");

        alertDialogBuilder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(AlertDialog_4.this, "You clicked yes button", Toast.LENGTH_LONG).show();
                    }
                });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
