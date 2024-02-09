package com.ambaitsystem.indusapplication;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class json_using_slim_10 extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.json_using_slim_10);
        fetch_values(this);
    }

    private void fetch_values(final Context context)
    {
        StringRequest strReq = new StringRequest(Request.Method.POST,
               url_cryto.decrypt(EndPoints.LATEST_VALUES_NEW), new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                //UPDATE PROPETIES

                try {
                    Log.v("##Json Response",response);
                        Toast.makeText(getBaseContext(),response,Toast.LENGTH_LONG).show();
                    JSONObject obj = new JSONObject(response);
                    if(obj.getString("subscribe").equalsIgnoreCase("0"))
                    {

                    // check for error flag
                    if (obj.getBoolean("error") == false) {
                        //Get random_users And show it in Top Horizontal View
                        JSONArray random_usersarray = obj.getJSONArray("random_users");
                        int length = random_usersarray.length();
                        List<String> listContents = new ArrayList<String>(length);

                        for (int i = 0; i < random_usersarray.length(); i++) {
                            JSONObject randomuserObj = (JSONObject) random_usersarray.get(i);
                            Toast.makeText(context,url_cryto.decrypt(randomuserObj.getString("name")), Toast.LENGTH_SHORT).show();
                            listContents.add(url_cryto.decrypt(randomuserObj.getString("name")));
                        }
                        ListView listview_name_list = (ListView) findViewById(R.id.listview_name_list);
                        listview_name_list.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, listContents));

                            } else {
                                Toast.makeText(context, "No more data available.", Toast.LENGTH_SHORT).show();

                            }

                            // data_user.add(new Data(R.drawable.user_top, randomuserObj.getString("user_id") + "#" + randomuserObj.getString("name") + "\nLast seen :" +randomuserObj.getString("last_online") + "#" + randomuserObj.getString("institute") + "#" + randomuserObj.getString("batch") + "#" + randomuserObj.getString("branch") + "#" + randomuserObj.getString("likes") +"#"+ randomuserObj.getString("isinterested")));
                        }


                } catch (JSONException e)
                {
                    Toast.makeText(context, "Check Internet Connection.#2" + e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                NetworkResponse networkResponse = error.networkResponse;
                error.printStackTrace();
                Toast.makeText(context, "Check Internet Connection.#3" + error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();

                params.put("myid", "49");
                return params;
            }

            ;
        };
        // disabling retry policy so that it won't make
        // multiple http calls
        int socketTimeout = 0;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeout,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

        strReq.setRetryPolicy(new DefaultRetryPolicy(0, -1, 0));
        //Adding request to request queue
        MyApplication_OnlineTransfer.getInstance().addToRequestQueue(strReq);
    }
}

