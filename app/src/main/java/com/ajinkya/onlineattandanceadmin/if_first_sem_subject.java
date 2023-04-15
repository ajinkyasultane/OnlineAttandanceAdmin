package com.ajinkya.onlineattandanceadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.card.MaterialCardView;

public class if_first_sem_subject extends AppCompatActivity {

    MaterialCardView main_mcv_c, main_mcv_cpp,main_mcv_java,main_mcv_advance_java,main_mcv_javascript,main_mcv_php;

    ProgressBar c_progressbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_first_sem_subject2);

//progressbar

        c_progressbar = findViewById(R.id.C_progressbar);

        main_mcv_c = findViewById(R.id.main_mcv_c);
        main_mcv_cpp = findViewById(R.id.main_mcv_cpp);
        main_mcv_java = findViewById(R.id.main_mcv_java);
        main_mcv_advance_java = findViewById(R.id.main_mcv_advance_java);
        main_mcv_javascript = findViewById(R.id.main_mcv_javascript);
        main_mcv_php = findViewById(R.id.main_mcv_php);



        main_mcv_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, C_programming.class);
                startActivity(i);
            }
        });

        main_mcv_cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, Cpp_Programming.class);
                startActivity(i);
            }
        });


        main_mcv_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, Java_Programming.class);
                startActivity(i);
            }
        });

        main_mcv_advance_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, Advance_java_Programming.class);
                startActivity(i);
            }
        });

        main_mcv_javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, Javascript.class);
                startActivity(i);
            }
        });

        main_mcv_php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(if_first_sem_subject.this, PHP_Activity.class);
                startActivity(i);
            }
        });

//        main_mcv_c.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent i = new Intent(if_first_sem_subject.this, C_Programming.class);
//                startActivity(i);
//
//                //  c_progressbar.setVisibility(View.GONE);
//            }
        //  });


    }
}