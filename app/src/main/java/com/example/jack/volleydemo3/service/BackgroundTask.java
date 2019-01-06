package com.example.jack.volleydemo3.service;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.jack.volleydemo3.model.Model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class BackgroundTask {
    Context context;
    ArrayList<Model> arrayList = new ArrayList<>();
    String json_url = "https://simplifiedcoding.net/demos/marvel/";

    public BackgroundTask(Context context)
    {
        this.context = context;
    }

    public ArrayList<Model> getList()
    {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, json_url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response)
            {

                int count=0;
                while (count<response.length())
                {
                    try {
                        JSONObject jsonObject = response.getJSONObject(count);
                        Model model= new Model(jsonObject.getString("name"),jsonObject.getString("realname"),jsonObject.getString("team"),jsonObject.getString("publisher"));
                        arrayList.add(model);
                        count++;

                    } catch (JSONException e)
                    {
                        e.printStackTrace();
                    }
                }

            }


        }, new Response.ErrorListener()
        {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(context.getApplicationContext(),"Something is wrong",Toast.LENGTH_SHORT).show();
                error.printStackTrace();


            }


        });
        MySingleton.getInstance(context).addToRequestque(jsonArrayRequest);

        return arrayList;
    }
}
