package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class e_Intent_Source_Activity extends Activity implements OnClickListener{
	//globle Variable
	EditText txtname;
	Button btnSource;
	String Name=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e_intent_source_activity);
        
        btnSource = (Button) findViewById(R.id.btnsource);
        btnSource.setOnClickListener(this);
    }


	@Override
	public void onClick(View v)
	{
		switch(v.getId())
		{
			case R.id.btnsource:
				//Create Object of Intent
				Intent myIntent = new Intent(this,e_Intent_Destination_Activity.class);
				myIntent.putExtra("paramenter", "Dhaval");
				startActivity(myIntent);
				break;
		}

	}
}