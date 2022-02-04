package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddexamActivity extends AppCompatActivity {
EditText s1,s2,s3,s4;
AppCompatButton t1,t2;
String getSem,getEname,getEdate,getRemarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addexam);
        s1=(EditText) findViewById(R.id.sem);
        s2=(EditText) findViewById(R.id.ename);
        s3=(EditText) findViewById(R.id.edate);
        s4=(EditText) findViewById(R.id.remarks);
        t1=(AppCompatButton) findViewById(R.id.sub);
        t2=(AppCompatButton) findViewById(R.id.dash);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(a);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSem=s1.getText().toString();
                getEname=s2.getText().toString();
                getEdate=s3.getText().toString();
                getRemarks=s4.getText().toString();
                Toast.makeText(getApplicationContext(), getSem, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getEdate, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getRemarks, Toast.LENGTH_SHORT).show();

            }
        });
    }
}