package com.example.diunotessharingportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class UploadNotes extends AppCompatActivity {


    EditText dept,course,topic, des;
    Button btn;
    DatabaseReference reference;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_notes);
        dept = findViewById(R.id.editTextTextPersonName);
        course = findViewById(R.id.editTextTextPersonName2);
        topic = findViewById(R.id.editTextTextPersonName3);
        des = findViewById(R.id.editTextTextPersonName4);
        btn = findViewById(R.id.button);
        textView=findViewById(R.id.textView3);



        reference= FirebaseDatabase.getInstance().getReference();



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deptv = dept.getText().toString();
                String coursev = course.getText().toString();
                String topicv = topic.getText().toString();
                String desv = des.getText().toString();

                Model model = new Model(deptv,coursev,topicv,desv);




                reference.child("Users").push().setValue(model).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        if (task.isSuccessful()){
                            Toast.makeText(UploadNotes.this,"Data stored", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(UploadNotes.this,"Error"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });



            }
        });


        reference.child("Users").get().addOnCompleteListener(new OnCompleteListener<DataSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DataSnapshot> task) {

                if (task.isSuccessful()){
                    DataSnapshot snapshot = task.getResult();
                    textView.setText(snapshot.toString());
                }
                else{
                    Toast.makeText(UploadNotes.this,"Error"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                }
            }
        });




    }
}