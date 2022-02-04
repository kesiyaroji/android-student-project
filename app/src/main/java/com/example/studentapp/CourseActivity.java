package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.EditText;

public class CourseActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    AppCompatButton bt1,bt2;
    String getCourse,getDescription,getDuration,getRemark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        e1=(EditText) findViewById(R.id.course);
        e2=(EditText) findViewById(R.id.des);
        e3=(EditText) findViewById(R.id.duration);
        e4=(EditText) findViewById(R.id.remark);
        bt1=(AppCompatButton) findViewById(R.id.sub);
        bt2=(AppCompatButton) findViewById(R.id.log);

    }
}