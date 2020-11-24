package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class patientLoginActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    ProgressDialog progressDialog;
    String HOST;
    String Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_login);
        getSupportActionBar().hide();
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Logging User...");
        HOST = "http://18.216.245.34/EMRapp/Patients/login.php";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPatient();
            }
        });
    }
    private void loginPatient() {
        progressDialog.show();
        final String Username = username.getText().toString().trim();
        final String Password = password.getText().toString().trim();

        StringRequest stringRequest=new StringRequest(Request.Method.POST, HOST,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try
                        {
                            JSONObject jsonObject=new JSONObject(response);
                            String Output=jsonObject.getString("Output");
                            Id = jsonObject.getString("id");

                            if(Output.equals("1"))
                            {
                                Toast.makeText(patientLoginActivity.this, "Login Succusfull", Toast.LENGTH_SHORT).show();
                                progressDialog.dismiss();
                                sendUserToMain();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            progressDialog.dismiss();
                            Toast.makeText(patientLoginActivity.this, "Login Error "+ e.toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                progressDialog.dismiss();
                Toast.makeText(patientLoginActivity.this, "Error Occured "+ error.toString(), Toast.LENGTH_SHORT).show();

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params=new HashMap<>();
                params.put("Username", Username);
                params.put("Password", Password);
                return params;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
    private void sendUserToMain() {
        Intent mainIntent=new Intent(patientLoginActivity.this, HomeActivity.class);
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        mainIntent.putExtra("id",Id);
        startActivity(mainIntent);
        finish();
    }
}
