package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class test extends Activity  implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_intent_source_activity);

        Button btnsource = (Button) findViewById(R.id.btnsource);
        btnsource.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnsource:
                Intent i = new Intent(test.this,e_Intent_Destination_Activity.class);
                i.putExtra("parameter","Value");
                startActivityForResult(i,2);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String message=data.getStringExtra("MESSAGE");

        }
    }

}
