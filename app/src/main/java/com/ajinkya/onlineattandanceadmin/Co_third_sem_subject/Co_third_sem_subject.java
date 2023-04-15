package com.ajinkya.onlineattandanceadmin.Co_third_sem_subject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.ajinkya.onlineattandanceadmin.R;
import com.google.android.material.card.MaterialCardView;

public class Co_third_sem_subject extends AppCompatActivity {

   MaterialCardView co_third_sem_mcv_cpp,co_third_sem_mcv_data_struture,co_third_mcv_computer_graphics,co_third_sem_dbms,co_third_sem_mcv_dtm;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_third_sem_subject);

        co_third_sem_dbms = findViewById(R.id.co_third_sem_mcv_dbms);
        co_third_sem_mcv_cpp = findViewById(R.id.co_third_sem_mcv_Cpp);
        co_third_mcv_computer_graphics = findViewById(R.id.co_third_sem_mcv_computer_graphics);
        co_third_sem_mcv_dtm = findViewById(R.id.co_third_mcv_digital_technique);
        co_third_sem_mcv_data_struture = findViewById(R.id.co_third_sem_mcv_data_structure);



    }
}