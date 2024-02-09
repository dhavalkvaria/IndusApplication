package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class e_Intent_Destination_Activity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_intent_destination_activity);
       
       Bundle extras = getIntent().getExtras();
        if (extras == null)
        {
        		return;
        }
       else {
            String Name = extras.getString("parameter");
            TextView txtName =(TextView)findViewById(R.id.txtintentDestination);
            txtName.setText(Name);
        }

        Intent intent=new Intent();
        intent.putExtra("MESSAGE","Hi This is result");
        setResult(2,intent);
        finish();//finishing activity
    }

	
}