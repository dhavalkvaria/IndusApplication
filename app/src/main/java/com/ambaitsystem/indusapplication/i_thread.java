package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class i_thread extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	public String result="0";
	
	Thread MyThread;
	Runnable runnable;
	
	//Handler : To Post Message on TextView
	private Handler handler;
	TextView txttimer;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_thread);
        
        txttimer =(TextView) findViewById(R.id.txtTime);
        txttimer.setOnClickListener(this);
        
       Button btnstart =(Button) findViewById(R.id.btnStartTimer);
  	   btnstart.setOnClickListener(this);
  	  
  	   //Take New Object of Handler
  	  handler = new Handler();
  	 
  	  txttimer =(TextView) findViewById(R.id.txtTime);
      txttimer.setOnClickListener(this);
	}
    
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
			case R.id.btnStartTimer:
				Start_Thread();
		    break;
		}
		
	}

	

	private void Start_Thread() 
	{
		
		runnable = new Runnable() {
	        public void run() {
	        		        	
	        	final long endTime = System.currentTimeMillis() + 20*1000;
		
	        	while (System.currentTimeMillis() < endTime) 
	        	{
	        		  try 
	        		  {
	        			  Log.v("Time : EndTime",Long.toString(System.currentTimeMillis())+":" +Long.toString(endTime));
	        		  } catch (Exception e) {}	

	        		  ////////////////////////////////////////////////////////////////////////////////////////////////
	        		  ///To Update UI From Thread use : Handler
	        		  handler.post(new Runnable() {
	        			                      @Override
	        			                      public void run() {
	        			                    	  txttimer.setText(Long.toString(System.currentTimeMillis())+":" +Long.toString(endTime));
	        			                      }
	        			                  });
	        		  
	        		 //////////////////////////////////////////////////////////////////////////////////////////////////

	        	}
	       
	    }
      };
      
      MyThread = new Thread(runnable);
      //Start Thread
      Log.v("Thread ","Start");
      MyThread.start();
	}
}
