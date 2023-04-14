package com.ajinkya.onlineattandanceadmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Cpp_Programming extends AppCompatActivity {

     EditText cpp_name,cpp_branch,cpp_roll_number;
     Button uploadAttendancebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_programming);


    }

//        public void process(View view)
//        {
//            cpp_name = findViewById(R.id.Cpp_name);
//            cpp_branch = findViewById(R.id.Cpp_branch);
//            cpp_roll_number = findViewById(R.id.Cpp_roll_number);
//
//
//            String name=cpp_name.getText().toString().trim();
//            String branch=cpp_branch.getText().toString().trim();
//            String roll_no=cpp_roll_number.getText().toString().trim();
//
//            Javascript_Student_data javascript_student_data = new Javascript_Student_data(branch,roll_no);
//
//
//            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//            DatabaseReference databaseReference = firebaseDatabase.getReference("Cpp");
//
//            databaseReference.child(name).setValue(javascript_student_data);
//
//            cpp_name.setText(" ");
//            cpp_branch.setText(" ");
//            cpp_roll_number.setText(" ");
//
//            Toast.makeText(this, "Data Inserted Successfully", Toast.LENGTH_LONG).show();
// Intent i = new Intent(Cpp_Programming.this,MainActivity.class);
// startActivity(i);
//        }

    }