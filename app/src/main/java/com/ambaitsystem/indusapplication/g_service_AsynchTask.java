package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class g_service_AsynchTask extends Activity implements OnClickListener{
	//globle Variable
	
	Button btnAsync;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_service_asynchtask);
        
        
        btnAsync = (Button) findViewById(R.id.btnAsynchTaskStart);
        btnAsync.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) 
	{
		DoBackgroundTask task =new DoBackgroundTask();
		task.execute("Hi");	
		
	}

	 
	

	////////////////////////////////////////////////////////
	//Async Class
	/////////////////////////////////////////////////////////
	private class DoBackgroundTask extends AsyncTask<String, Void, String> {
	    @Override
	   
	    protected void onPostExecute(String result) 
	    {
	    	Log.v("Increment :","Completed");
	    }

		@Override
		protected String doInBackground(String... arg0) 
		{
			Log.v("Value",arg0[0]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(long i=0;i<=5000;i++)
			{
				Log.v("Value of i",":"+i);
				
			}
			return null;
		}
	  }
}