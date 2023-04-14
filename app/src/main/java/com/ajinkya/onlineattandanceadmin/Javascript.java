package com.ajinkya.onlineattandanceadmin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Javascript extends AppCompatActivity {

    EditText javascript_name, javascript_roll_no, javascript_branch;
    Button javascript_upload_attandancebtn;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);


    }
//    public void process(View view)
//    {
//        javascript_name = findViewById(R.id.javascript_name);
//        javascript_branch = findViewById(R.id.javascript_branch);
//        javascript_roll_no = findViewById(R.id.javascript_roll_number);
//
//
//        String name=javascript_name.getText().toString().trim();
//String branch=javascript_branch.getText().toString().trim();
//        String roll_no=javascript_roll_no.getText().toString().trim();
//
//Javascript_Student_data javascript_student_data = new Javascript_Student_data(branch,roll_no);
//
//
//        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//        DatabaseReference databaseReference = firebaseDatabase.getReference("Javascript");
//
//        databaseReference.child(name).setValue(javascript_student_data);
//
//        javascript_name.setText(" ");
//        javascript_branch.setText(" ");
//        javascript_roll_no.setText(" ");
//
//        Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
//        Intent i1 = new Intent(Javascript.this,MainActivity.class);
//        startActivity(i1);
//    }

}