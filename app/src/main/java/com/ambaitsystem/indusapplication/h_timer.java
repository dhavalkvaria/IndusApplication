package com.ambaitsystem.indusapplication;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class h_timer extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	public String result="0";
	TextView txttimer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_timer);
        
        txttimer =(TextView) findViewById(R.id.txtTime);
        txttimer.setOnClickListener(this);
        
       Button btnyes =(Button) findViewById(R.id.btnStartTimer);
  	   btnyes.setOnClickListener(this);
	}

    @Override
    public void finish()
    {
    	
    	super.finish();
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btnStartTimer:
			//errornouos : Timer create Thread.Thread can't access UI
			//Error_Start_Timer();
			//OK : Create RunnableOnUI in Timer to Update UI : TextView
			Start_Timer();
	    break;
		
		}
		
	}
			/////////////////////////////////////////////////////////////////////////////////////
				//OK
			/////////////////////////////////////////////////////////////////////////////////////
				private void Start_Timer() 
				{
					 Timer myTimer;
					 myTimer = new Timer();
						myTimer.schedule(new TimerTask() 
						{
							@Override
							public void run() 
							{
								TimerMethod();
							}
			
							
						
						}, 0, 1000);
					
				}
				
				private void TimerMethod() 
				{
					runOnUiThread(new Runnable(){
			
					    @Override
					    public void run() {
					    	Calendar c = Calendar.getInstance(); 
							int seconds = c.get(Calendar.SECOND);
							
							txttimer.setText(Integer.toString(seconds));
					    }});
					  }
				
					/////////////////////////////////////////////////////////////////////////////////////
	
	
		/////////////////////////////////////////////////////////////////////////////////////
			//Error
		/////////////////////////////////////////////////////////////////////////////////////
			private void Error_Start_Timer() 
			{
				 Timer myTimer;
				 myTimer = new Timer();
					myTimer.schedule(new TimerTask() 
					{
						@Override
						public void run() 
						{
							Error_TimerMethod();
						}
					
					}, 0, 1000);
			}
			
			private void Error_TimerMethod() 
			{
				Calendar c = Calendar.getInstance(); 
				int seconds = c.get(Calendar.SECOND);
				
				txttimer.setText(Integer.toString(seconds));
				
			}
		
		/////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////
	
}		

