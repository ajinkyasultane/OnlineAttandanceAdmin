package com.ajinkya.onlineattandanceadmin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Advance_java_Programming extends AppCompatActivity {

    private ProgressBar advance_java_progressbar;
    SearchView mysearchview;
    RecyclerView advance_java_recyleview;

    DatabaseReference database;
    myadapter myadapter1;
    ArrayList<Allsubject> list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_java_programming);

        //progressbar
        advance_java_progressbar = findViewById(R.id.advance_java_progressbar);
        advance_java_recyleview = findViewById(R.id.advance_java_recycleview);
        database = FirebaseDatabase.getInstance().getReference("Advance Java");
        advance_java_recyleview.setHasFixedSize(true);
        advance_java_recyleview.setLayoutManager(new LinearLayoutManager(this));


//SearchView





        list = new ArrayList<>();

        myadapter1 = new myadapter(this,list);
        advance_java_recyleview.setAdapter(myadapter1);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                advance_java_progressbar.setVisibility(View.VISIBLE);
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    Allsubject allsubject = dataSnapshot.getValue(Allsubject.class);
                    list.add(allsubject);


                }
                advance_java_progressbar.setVisibility(View.GONE);
                myadapter1.notifyDataSetChanged();

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }


//public boolean onCreateOptionsMenu(Menu menu)
//{
//    getMenuInflater().inflate(R.menu.searchmenu,menu);
//    MenuItem menuItem = menu.findItem(R.id.search);
//    SearchView searchView = (SearchView) menu
//}
//




}
