package com.ajinkya.onlineattandanceadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class Co_second_sem_subject extends AppCompatActivity {

    MaterialCardView co_second_sem_mcv_html,co_second_sem_mcv_c,co_second_sem_mcv_computer_peripheral,co_second_sem_mcv_basic_electronic,co_second_sem_mcv_elemet_of_electrical;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_second_sem_subject);

        co_second_sem_mcv_c = findViewById(R.id.co_second_sem_mcv_C);
        co_second_sem_mcv_html = findViewById(R.id.co_second_sem_mcv_html);
        co_second_sem_mcv_basic_electronic = findViewById(R.id.co_first_second_mcv_basic_electronic);
        co_second_sem_mcv_computer_peripheral = findViewById(R.id.co_second_sem_mcv_computer_periperal);
        co_second_sem_mcv_elemet_of_electrical = findViewById(R.id.co_second_sem_mcv_element_electronics);



        co_second_sem_mcv_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Co_second_sem_subject.this, Cpp_Programming.class);
                startActivity(i);
            }
        });

    }
}