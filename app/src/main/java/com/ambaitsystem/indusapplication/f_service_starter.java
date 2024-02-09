package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class f_service_starter extends Activity implements OnClickListener{
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_service_starter);
        
      Button  btnStart = (Button) findViewById(R.id.btnstartservice);
      btnStart.setOnClickListener(this);
      
      Button  btnStop = (Button) findViewById(R.id.btnstopservice);
      btnStop.setOnClickListener(this);
      
    }

	@Override
	public void onClick(View v) 
	{
		switch(v.getId())
		{
			case R.id.btnstartservice:
				//startService(new Intent(getBaseContext(), f_service.class));
				//AsynchTask Service
				startService(new Intent(getBaseContext(), f_service.class));
					break;
			case R.id.btnstopservice:
				//stopService(new Intent(getBaseContext(), f_service.class));
				//AsynchTask Service
				stopService(new Intent(getBaseContext(), g_service_AsynchTask.class));
					break;
		}
		
		
	}
}
