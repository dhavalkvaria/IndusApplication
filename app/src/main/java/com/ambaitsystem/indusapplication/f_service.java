package com.ambaitsystem.indusapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class f_service extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		// We want this service to continue running until it is explicitly
		// stopped, so return sticky.
		Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
		//Show :  GUI is Getting Hang
		DoBackgroundTask();
		return START_STICKY;
	}

	private void DoBackgroundTask() 
	{
		for(long i=0;i<=500000;i++)
		{
			Log.v("#Value of i",":"+i);
			//Toast.makeText(this, "i:"+i, Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public void onDestroy() 
	{
		super.onDestroy();
		Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
	}

	
}
