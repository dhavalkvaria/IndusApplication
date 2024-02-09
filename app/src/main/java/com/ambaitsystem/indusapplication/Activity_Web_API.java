package com.ambaitsystem.indusapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Activity_Web_API extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webapi);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest strReq = new StringRequest(Request.Method.POST,
                        "http://192.168.24.129/project/v1/index.php/user/login", new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject obj = new JSONObject(response);
                            // check for error flag
                            if (obj.getBoolean("error") == false) {
                                Toast.makeText(getBaseContext(), "Information Saved.Press NEXT to continue.", Toast.LENGTH_SHORT).show();
                            } else {
                                // error in fetching chat rooms
                                Toast.makeText(getBaseContext(), "Check Internet Connection #1", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            // Log.v("Error","#$"+e.toString());
                            Toast.makeText(getBaseContext(), "Check Internet Connection #2", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        NetworkResponse networkResponse = error.networkResponse;
                        error.printStackTrace();
                        Toast.makeText(getBaseContext(), "Check Internet Connection #3", Toast.LENGTH_SHORT).show();
                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<String, String>();
                          params.put("name","abc");
                        params.put("email", "abc@gmail.com");
                        params.put("validationcode", "123");
                        return params;
                    }

                    ;
                };

                //Adding request to request queue
                MyApplication_OnlineTransfer.getInstance().addToRequestQueue(strReq);
            }
        });

    }


}
