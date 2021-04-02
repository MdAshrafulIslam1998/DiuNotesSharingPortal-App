package com.example.diunotessharingportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UploadNotes extends AppCompatActivity {


    EditText dept,course,topic, des;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_notes);
        dept = findViewById(R.id.editTextTextPersonName);
        course = findViewById(R.id.editTextTextPersonName2);
        topic = findViewById(R.id.editTextTextPersonName3);
        des = findViewById(R.id.editTextTextPersonName4);
        btn = findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deptv = dept.getText().toString();
                String coursev = course.getText().toString();
                String topicv = topic.getText().toString();
                String desv = des.getText().toString();


            }
        });




    }
}