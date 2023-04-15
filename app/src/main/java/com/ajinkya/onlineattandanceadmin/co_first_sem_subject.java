package com.ajinkya.onlineattandanceadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ajinkya.onlineattandanceadmin.Co_first_sem_subject.Co_first_sem_English;
import com.ajinkya.onlineattandanceadmin.Co_first_sem_subject.Co_first_sem_basic_science;
import com.google.android.material.card.MaterialCardView;

public class co_first_sem_subject extends AppCompatActivity {

    MaterialCardView co_first_sem_mcv_english,co_first_sem_mcv_math,co_first_sem_mcv_basic_science,co_first_mcv_first_sem_mcv_ict;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.co_first_sem_subject);

        co_first_sem_mcv_english = findViewById(R.id.co_first_sem_mcv_english);
        co_first_sem_mcv_math = findViewById(R.id.co_first_sem_mcv_math);
        co_first_sem_mcv_basic_science = findViewById(R.id.co_first_sem_mcv_science);
        co_first_mcv_first_sem_mcv_ict = findViewById(R.id.co_first_sem_mcv_ict);


        co_first_sem_mcv_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i1 = new Intent(co_first_sem_subject.this,Co_first_sem_English.class);
                startActivity(i1);

                Toast.makeText(co_first_sem_subject.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });

        co_first_sem_mcv_basic_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(co_first_sem_subject.this, Co_first_sem_basic_science.class);
                startActivity(i);
            }
        });
    }
}