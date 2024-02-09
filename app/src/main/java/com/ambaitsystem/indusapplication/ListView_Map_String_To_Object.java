package com.ambaitsystem.indusapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListView_Map_String_To_Object extends Activity {
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_listlayout_base);
        //1
        ListView listview = (ListView) findViewById(R.id.os_list);
        
        //2
        
        HashMap<String, String> data =  prepareData();
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        aList.add(data);
        
        SimpleAdapter Adapter= new SimpleAdapter(this, aList, R.layout.b_listview_map_string_to_object_content, new String[]{"OSName","Icon"}, new int[]{R.id.OsName_1,R.id.extra_1});
		
        //4
		listview.setAdapter(Adapter);
    }

	private HashMap<String, String> prepareData() 
	{
		HashMap<String, String> item = new HashMap<String,String>();
		
		item.put("OSName", "Android");
		item.put("Icon",Integer.toString(R.drawable.icon));

		
		return item;
	}
}
