package com.ambaitsystem.indusapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class m_sqlite_database extends AppCompatActivity implements View.OnClickListener {
	//globle Variable
	EditText txtname;
	
	String Name;
	public SQLiteDatabase db=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_sqlite_database);
        
        txtname = (EditText) findViewById(R.id.edittxtName_db);
		Button btnsqlite = (Button)findViewById(R.id.btnsqlite);
		btnsqlite.setOnClickListener(this);

    }


	@Override
	public void onClick(View view) {
		switch (view.getId())
		{
			case R.id.btnsqlite:

				//Create table
				db =(new DbBasic(this)).getWritableDatabase();
				db.execSQL("CREATE TABLE IF NOT EXISTS test (_id INTEGER PRIMARY KEY,StudentName TEXT);");
				db.close();

				//Insert Value in Table
				String name = txtname.getText().toString();
				db =(new DbBasic(this)).getWritableDatabase();
				db.execSQL("INSERT INTO test (StudentName) VALUES('" + name + "');");
				db.close();

				//Show Value from Table
				db =(new DbBasic(this)).getReadableDatabase();
				Cursor CurstudentDetail =  db.rawQuery("Select * from test",null);
				startManagingCursor(CurstudentDetail);
				CurstudentDetail.moveToFirst();

				if (CurstudentDetail.moveToFirst()){
					do {
						// Passing values
						String column1 = CurstudentDetail.getString(0);
						String column2 = CurstudentDetail.getString(1);
						Log.v("#Value","Column 1: " + column1 + "  Column 2: " + column2);
						// Do something Here with values
					} while(CurstudentDetail.moveToNext());
				}
				break;
		}
	}
}
