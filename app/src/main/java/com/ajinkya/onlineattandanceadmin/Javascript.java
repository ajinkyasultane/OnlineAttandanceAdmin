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

public class Javascript extends AppCompatActivity {

    private ProgressBar javascript_progressbar;
    SearchView mysearchview;
    RecyclerView javascript_recyleview;

    DatabaseReference database;
    myadapter myadapter1;
    ArrayList<Allsubject> list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);

        //progressbar
        javascript_progressbar = findViewById(R.id.javascript_progressbar);
        javascript_recyleview = findViewById(R.id.javascript_recycleview);
        database = FirebaseDatabase.getInstance().getReference("PHP");
        javascript_recyleview.setHasFixedSize(true);
        javascript_recyleview.setLayoutManager(new LinearLayoutManager(this));


//SearchView





        list = new ArrayList<>();

        myadapter1 = new myadapter(this,list);
        javascript_recyleview.setAdapter(myadapter1);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                javascript_progressbar.setVisibility(View.VISIBLE);
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    Allsubject allsubject = dataSnapshot.getValue(Allsubject.class);
                    list.add(allsubject);


                }
                javascript_progressbar.setVisibility(View.GONE);
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
