package com.ambaitsystem.indusapplication;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class d_dialog extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	public String result="0";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.d_dialog);
        
        
        this.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        
       Button btnyes =(Button) findViewById(R.id.btnretry);
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
		case R.id.btnretry:
		
			finish();
	    break;
		
		}
		
	}
}