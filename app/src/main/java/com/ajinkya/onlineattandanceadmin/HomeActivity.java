package com.ajinkya.onlineattandanceadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        MaterialCardView home_mcv_computer_science,home_mcv_information_technology,home_mcv_civil_engineering,home_mcv_mechanical_engineering,home_mcv_electrical_engineering,home_mcv_electronic_engineering;

        home_mcv_computer_science = findViewById(R.id.home_mcv_computer_science);
        home_mcv_information_technology = findViewById(R.id.home_mcv_information_engineering);
        home_mcv_civil_engineering = findViewById(R.id.home_mcv_civil);
        home_mcv_mechanical_engineering = findViewById(R.id.home_mcv_mechanical);
        home_mcv_electrical_engineering = findViewById(R.id.home_mcv_eletrical);
        home_mcv_electronic_engineering = findViewById(R.id.home_mcv_electronic);


        home_mcv_computer_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(HomeActivity.this,SemisterActivity.class);
             startActivity(i1);
}
    });



        home_mcv_information_technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(HomeActivity.this,SemisterActivity.class);
                startActivity(i2);
            }
        });

        home_mcv_mechanical_engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(HomeActivity.this,SemisterActivity.class);
                startActivity(i3);
            }
        });

        home_mcv_civil_engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(HomeActivity.this,SemisterActivity.class);
                startActivity(i4);
            }
        });

        home_mcv_electrical_engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(HomeActivity.this,SemisterActivity.class);
                startActivity(i5);
            }
        });

        home_mcv_electronic_engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(HomeActivity.this,SemisterActivity.class);
                startActivity(i6);
            }
        });













    }
}
