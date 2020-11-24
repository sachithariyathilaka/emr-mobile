package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class changePasswordDoctorActivity extends AppCompatActivity {
    String id,HOST,NewPswd;
    EditText newPswd,rePswd;
    Button changePswd;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_doctor);
        getSupportActionBar().setTitle("Change Password");
        id = getIntent().getStringExtra("id");
        newPswd = findViewById(R.id.newPswd);
        rePswd = findViewById(R.id.rePswd);
        changePswd = findViewById(R.id.changePswd);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Password Changing...");
        changePswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePassword();
            }
        });
    }

    private void changePassword() {
        progressDialog.show();
        NewPswd= newPswd.getText().toString().trim();
        HOST = "http://18.216.245.34/EMRapp/Doctor/changePswd.php?id="+id+"&password="+NewPswd;
        String RePswd = rePswd.getText().toString().trim();

        if(NewPswd.equals(RePswd))
        {
            sendNewPassword();
        }
        else
        {
            progressDialog.dismiss();
            Toast.makeText(changePasswordDoctorActivity.this,"Two Passwords are not Matching...",Toast.LENGTH_LONG).show();
        }
    }

    private void sendNewPassword() {
        StringRequest stringRequest=new StringRequest(Request.Method.GET, HOST,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try
                        {
                            JSONObject jsonObject=new JSONObject(response);
                            String Output=jsonObject.getString("Output");


                            if(Output.equals("true"))
                            {
                                progressDialog.dismiss();
                                Toast.makeText(changePasswordDoctorActivity.this,"Change Password Succusfully!!",Toast.LENGTH_LONG).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            progressDialog.dismiss();
                            Toast.makeText(changePasswordDoctorActivity.this, "Error Occured due to "+ e.toString(), Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error)
            {
                progressDialog.dismiss();
                Toast.makeText(changePasswordDoctorActivity.this, "Error Occured "+ error.toString(), Toast.LENGTH_SHORT).show();

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
