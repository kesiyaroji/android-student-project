package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FacultyActivity extends AppCompatActivity {
    EditText s1,s2,s3,s4;
    AppCompatButton t1,t2;
    String getFname,getDept,getDes,getMno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        s1=(EditText) findViewById(R.id.faculty);
        s2=(EditText) findViewById(R.id.dep);
        s3=(EditText) findViewById(R.id.desg);
        s4=(EditText) findViewById(R.id.mob);
        t1=(AppCompatButton) findViewById(R.id.submit);
        t2=(AppCompatButton) findViewById(R.id.back);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFname=s1.getText().toString();
                getDept=s2.getText().toString();
                getDes=s3.getText().toString();
                getMno=s4.getText().toString();
                Toast.makeText(getApplicationContext(), getFname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDept, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getDes, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getMno, Toast.LENGTH_SHORT).show();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(c);
            }
        });
    }
}