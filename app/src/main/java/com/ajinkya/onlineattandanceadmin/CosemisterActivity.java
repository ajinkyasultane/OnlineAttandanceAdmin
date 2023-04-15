package com.ajinkya.onlineattandanceadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ajinkya.onlineattandanceadmin.Co_third_sem_subject.Co_third_sem_subject;
import com.google.android.material.card.MaterialCardView;

public class CosemisterActivity extends AppCompatActivity {

    MaterialCardView semister_mvc_first,semester_mvc_second,semester_mvc_third,semester_mvc_fourth,semester_mvc_fifth,semester_mvc_sixth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_semister);

semister_mvc_first = findViewById(R.id.semister_mvc_first);
semester_mvc_second = findViewById(R.id.semister_mvc_second);
semester_mvc_third = findViewById(R.id.semister_mvc_third);
semester_mvc_fourth = findViewById(R.id.semester_mvc_fourth);
semester_mvc_fourth = findViewById(R.id.semester_mvc_fifth);
semester_mvc_sixth = findViewById(R.id.semester_mvc_sixth);


semister_mvc_first.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(CosemisterActivity.this, co_first_sem_subject.class);
    startActivity(i);
    }
});

semester_mvc_second.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i1 = new Intent(CosemisterActivity.this,Co_second_sem_subject.class);
        startActivity(i1);
    }
});

semester_mvc_third.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i2 = new Intent(CosemisterActivity.this, Co_third_sem_subject.class);
        startActivity(i2);
    }
});


    }
}