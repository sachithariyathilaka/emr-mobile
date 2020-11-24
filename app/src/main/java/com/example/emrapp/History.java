package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.widget.Toast.LENGTH_LONG;

public class History extends AppCompatActivity {
    String id;
    ListView prescriptionList;
    String HOST;
    String ID[];
    String Drug1[];
    String Quantity1[];
    String Drug2[];
    String Quantity2[];
    String Drug3[];
    String Quantity3[];
    String Drug4[];
    String Quantity4[];
    String Drug5[];
    String Quantity5[];
    String Desease[];
    String Report[];
    String Date[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().setTitle("Medical History");
        id = getIntent().getStringExtra("id");
        prescriptionList = findViewById(R.id.list);
        HOST = "http://18.216.245.34/EMRapp/Records/fetchRecords.php";
        DisplayAllPrescription();
    }

    private void DisplayAllPrescription() {


        StringRequest stringRequest=new StringRequest(Request.Method.POST, HOST,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try
                        {
                            JSONArray jsonArray = new JSONArray(response);
                            JSONObject jsonObject = null;
                            ID = new String[jsonArray.length()];
                            Drug1 = new String[jsonArray.length()];
                            Quantity1 = new String[jsonArray.length()];
                            Drug2 = new String[jsonArray.length()];
                            Quantity2 = new String[jsonArray.length()];
                            Drug3 = new String[jsonArray.length()];
                            Quantity3 = new String[jsonArray.length()];
                            Drug4 = new String[jsonArray.length()];
                            Quantity4 = new String[jsonArray.length()];
                            Drug5 = new String[jsonArray.length()];
                            Quantity5 = new String[jsonArray.length()];
                            Date = new String[jsonArray.length()];
                            Report = new String[jsonArray.length()];
                            Desease = new String[jsonArray.length()];
                                for (int i=0;i<jsonArray.length();i++){
                                    jsonObject = jsonArray.getJSONObject(i);
                                    ID[i] = jsonObject.getString("ID");
                                    Drug1[i] =jsonObject.getString("Drug1");
                                    Quantity1[i] = jsonObject.getString("Quantity1");
                                    Drug2[i] =jsonObject.getString("Drug2");
                                    Quantity2[i] = jsonObject.getString("Quantity2");
                                    Drug3[i] =jsonObject.getString("Drug3");
                                    Quantity3[i] = jsonObject.getString("Quantity3");
                                    Drug4[i] =jsonObject.getString("Drug4");
                                    Quantity4[i] = jsonObject.getString("Quantity4");
                                    Drug5[i] =jsonObject.getString("Drug5");
                                    Quantity5[i] = jsonObject.getString("Quantity5");
                                    Date[i] = jsonObject.getString("Date");
                                    Report[i] = jsonObject.getString("Report");
                                    Desease[i] = jsonObject.getString("Desease");
                                }
                                viewHolder viewHolder = new viewHolder(History.this,ID,Drug1,Quantity1,Drug2,Quantity2,Drug3,Quantity3,Drug4,Quantity4,Drug5,Quantity5,Date,Report,Desease);
                                prescriptionList.setAdapter(viewHolder);


                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(History.this, "Error Occured due to "+ e.toString(), Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                Toast.makeText(History.this, "Error Occured "+ error.toString(), Toast.LENGTH_SHORT).show();

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params=new HashMap<>();
                params.put("id", id);
                return params;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}
