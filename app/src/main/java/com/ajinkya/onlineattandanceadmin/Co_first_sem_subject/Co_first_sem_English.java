package com.ajinkya.onlineattandanceadmin.Co_first_sem_subject;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ajinkya.onlineattandanceadmin.Allsubject;
import com.ajinkya.onlineattandanceadmin.R;
import com.ajinkya.onlineattandanceadmin.myadapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class Co_first_sem_English  extends AppCompatActivity {

    private ProgressBar Co_first_sem_english_progressbar;
    SearchView mysearchview;
    RecyclerView Co_first_sem_english_recyleview;

    DatabaseReference database;
    myadapter myadapter1;
    ArrayList<Allsubject>list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_first_sem_english);

        //progressbar
        Co_first_sem_english_progressbar = findViewById(R.id.co_first_sem_english_progressbar);
        Co_first_sem_english_recyleview = findViewById(R.id.co_first_sem_english_recycleview);
        database = FirebaseDatabase.getInstance().getReference("Cpp");
        Co_first_sem_english_recyleview.setHasFixedSize(true);
        Co_first_sem_english_recyleview.setLayoutManager(new LinearLayoutManager(this));


//SearchView





        list = new ArrayList<>();

        myadapter1 = new myadapter(this,list);
        Co_first_sem_english_recyleview.setAdapter(myadapter1);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Co_first_sem_english_progressbar.setVisibility(View.VISIBLE);
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    Allsubject allsubject = dataSnapshot.getValue(Allsubject.class);
                    list.add(allsubject);


                }
                Co_first_sem_english_progressbar.setVisibility(View.GONE);
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
