package com.ambaitsystem.indusapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class Spinner_1 extends AppCompatActivity {
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_spiner_base_layout);
        //1
        Spinner SpinnerView = (Spinner) findViewById(R.id.SpinnerList);
        
        //2
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        
        HashMap<String, String> data =  prepareData("Android");
        aList.add(data);
        
        data =  prepareData("Windows");
        aList.add(data);
        
        data =  prepareData("IOS");
        aList.add(data);
        
        SimpleAdapter Adapter= new SimpleAdapter(this, aList, R.layout.c_spinner_content, new String[]{"OSName","Icon"}, new int[]{R.id.OsName_1,R.id.extra_1});
		
        //4
        SpinnerView.setAdapter(Adapter);
    }

	private HashMap<String, String> prepareData(String OSName) 
	{
		HashMap<String, String> item = new HashMap<String,String>();
		item.put("OSName", OSName);
		item.put("Icon",Integer.toString(R.drawable.icon));
		return item;
	}
}
