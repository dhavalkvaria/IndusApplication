package com.ambaitsystem.indusapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//Step 1 : Get Object of ListView 
//Step 2 : Define Array of String : To display in List
//Step 3 : Create ArrayAdapter & String Array to it
//Step 4 : Set ArrayAdapter to ListView

public class ListviewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_listlayout_base);
        //1
        final ListView listview = (ListView) findViewById(R.id.os_list);
        //2
        String[] values =  { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };

        //3
        /*
         * ArrayAdapter(
						Context,
						Layout of Conteiner : Here TextBox,
						id of ListView,
						What to Set : Here String Array)
         */
        ArrayAdapter ListOfOS =new ArrayAdapter(this,R.layout.a_listview_content, R.id.OsName, values);

        //4
		listview.setAdapter(ListOfOS);

		listview.setOnItemClickListener(new OnItemClickListener() {
			   @Override
			   public void onItemClick(AdapterView<?> arg0, View arg1,int arg2,long arg3) {

			      String s = (String) listview.getItemAtPosition(arg2);
			      Toast.makeText(getBaseContext(), "Clicked item is"+s, Toast.LENGTH_LONG).show();
			   }  });
    }
}
