package com.ambaitsystem.indusapplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class j_broadcast_receiver extends BroadcastReceiver 
{

	@Override
	public void onReceive(Context arg0, Intent arg1) 
	{
		//Write Text File
			//Step 1 : Mention Permission to write SDCARD in AndroidMenifest.xml
			//Step 2 : Mention Permission For Boot Complete in AndroidMenifest.xml
			//Step 2 : Function to Write in text file. 
			Write_SD_CARD("Boot Completed");
		
	}
   
	//appendLog to text file
	public void Write_SD_CARD(String text)
	{       
		File logFile;
		
			logFile = new File("sdcard/SMLflow.txt");
		
	   if (!logFile.exists())
	   {
	      try
	      {
	         logFile.createNewFile();
	      } 
	      catch (IOException e)
	      {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	   }
	   try
	   {
	      //BufferedWriter for performance, true to set append to file flag
	      BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true)); 
	      buf.append(text);
	      buf.newLine();
	      buf.close();
	   }
	   catch (IOException e)
	   {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	   }
	}
}
    

