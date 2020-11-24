package com.example.emrapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.volley.Response;

public class viewHolder extends ArrayAdapter<String> {

    private String[] ID;
    private String[] Drug1;
    private String[] Quantity1;
    private String[] Drug2;
    private String[] Quantity2;
    private String[] Drug3;
    private String[] Quantity3;
    private String[] Drug4;
    private String[] Quantity4;
    private String[] Drug5;
    private String[] Quantity5;
    private String[] Date;
    private String[] Report;
    private String[] Desease;
    private Activity context;
    public viewHolder(Activity context, String[] ID, String[] Drug1, String[] Quantity1, String[] Drug2, String[] Quantity2, String[] Drug3, String[] Quantity3, String[] Drug4, String[] Quantity4, String[] Drug5, String[] Quantity5, String[] Date, String[] Report, String[] Desease) {
        super(context, R.layout.prescription, ID);
        this.context = context;
        this.ID = ID;
        this.Drug1 = Drug1;
        this.Quantity1 = Quantity1;
        this.Drug2 = Drug2;
        this.Quantity2 = Quantity2;
        this.Drug3 = Drug3;
        this.Quantity3 = Quantity3;
        this.Drug4 = Drug4;
        this.Quantity4 = Quantity4;
        this.Drug5 = Drug5;
        this.Quantity5 = Quantity5;
        this.Date = Date;
        this.Report = Report;
        this.Desease = Desease;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View r=convertView;
        ViewHolder viewHolder = null;
        if(r==null){
            LayoutInflater layoutInflater= context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.prescription, null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)r.getTag();
        }
        viewHolder.ID.setText("ID: "+ID[position]);
        viewHolder.Drug1.setText("Drug: "+Drug1[position]);
        viewHolder.Quantity1.setText("Quantity :"+Quantity1[position]);
        viewHolder.Drug2.setText("Drug: "+Drug2[position]);
        viewHolder.Quantity2.setText("Quantity :"+Quantity2[position]);
        viewHolder.Drug3.setText("Drug: "+Drug3[position]);
        viewHolder.Quantity3.setText("Quantity :"+Quantity3[position]);
        viewHolder.Drug4.setText("Drug: "+Drug4[position]);
        viewHolder.Quantity4.setText("Quantity :"+Quantity4[position]);
        viewHolder.Drug5.setText("Drug: "+Drug5[position]);
        viewHolder.Quantity5.setText("Quantity :"+Quantity5[position]);
        viewHolder.Date.setText("Date :"+Date[position]);
        viewHolder.Report.setText("Report: "+Report[position]);
        viewHolder.Desease.setText("Desease: "+Desease[position]);
        return r;
    }
    class ViewHolder{
        TextView ID,Drug1,Quantity1,Drug2,Quantity2,Drug3,Quantity3,Drug4,Quantity4,Drug5,Quantity5,Date,Report,Desease;

        ViewHolder(View v){
            ID = v.findViewById(R.id.id);
            Drug1 = v.findViewById(R.id.drug1);
            Quantity1 = v.findViewById(R.id.quantity1);
            Drug2 = v.findViewById(R.id.drug2);
            Quantity2 = v.findViewById(R.id.qnt2);
            Drug3 = v.findViewById(R.id.drug3);
            Quantity3 = v.findViewById(R.id.qnt3);
            Drug4 = v.findViewById(R.id.drug4);
            Quantity4 = v.findViewById(R.id.qnt4);
            Drug5 = v.findViewById(R.id.drug5);
            Quantity5 = v.findViewById(R.id.qnt5);
            Date = v.findViewById(R.id.date);
            Report = v.findViewById(R.id.report);
            Desease = v.findViewById(R.id.decease);
        }
    }

}
