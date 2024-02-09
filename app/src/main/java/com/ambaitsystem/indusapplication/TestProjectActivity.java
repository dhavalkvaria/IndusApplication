package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//What to do?

//Step 1: get Object of EditText
//Step 2: get Object of Button
//Step 3:  Set Text of EditText to String

//Step 4 : write implements OnClickListener after Activity
/*Step 5 : Add Unimplemented Method by just clicking wavy line under ActivityName : TestProjectActivity
	  @Override
		public void onClick(View v) {
						
		}*/

//Step 6: Set OnclickListner of Button

//Step 7: Notify User called Toast
 
public class TestProjectActivity extends Activity implements OnClickListener{
	//globle Variable
	EditText txtname;
	Button btnName;
	String Name=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttonclick_and_textdisplay);
        txtname = (EditText) findViewById(R.id.edittxtName);
        
        btnName = (Button) findViewById(R.id.btnDisplay);
        btnName.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) 
	{
		//Switch()
		Name = txtname.getText().toString();
		 Toast.makeText(this,"Entered is Name: " + Name, Toast.LENGTH_LONG).show();
		
	}
}