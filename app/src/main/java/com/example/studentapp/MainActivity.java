package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getUsername,getPassword,share;
SharedPreferences mypreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreference=getSharedPreferences("login",MODE_PRIVATE);
        share=mypreference.getString("username","");
                if(!share.isEmpty())
                {
                     Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                     startActivity(i);

                    }


        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pwd);
        b1=(AppCompatButton)findViewById(R.id.loginbtn);
        b2=(AppCompatButton)findViewById(R.id.registerbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(j);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getUsername=ed1.getText().toString();
                getPassword=ed2.getText().toString();

                if (getUsername.equals("admin") && getPassword.equals("1234"))
                {
                    SharedPreferences.Editor Myedit= mypreference.edit();
                    Myedit.putString("username","admin");
                    Myedit.commit();
                    Intent k=new Intent(getApplicationContext(),DashboardActivity.class);
                    startActivity(k);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Invalid username and password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}