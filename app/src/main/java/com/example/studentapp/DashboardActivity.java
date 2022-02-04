package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        b1=(AppCompatButton) findViewById(R.id.course);
        b2=(AppCompatButton) findViewById(R.id.faculty);
        b3=(AppCompatButton) findViewById(R.id.exam);
        b4=(AppCompatButton) findViewById(R.id.web);
        b5=(AppCompatButton) findViewById(R.id.logout);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit= mypreferences.edit();
                myedit.clear();
                myedit.commit();

                Toast.makeText(getApplicationContext(), "Logout Successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(getApplicationContext(),ViewwebActivity.class);
                startActivity(g);


            }
        });
    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(getApplicationContext(),CourseActivity.class);
                startActivity(d);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(getApplicationContext(),FacultyActivity.class);
                startActivity(c);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e=new Intent(getApplicationContext(),AddexamActivity.class);
                startActivity(e);
            }
        });


    }
}