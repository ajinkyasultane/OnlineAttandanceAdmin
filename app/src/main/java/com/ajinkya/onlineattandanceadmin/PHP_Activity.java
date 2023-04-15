package com.ajinkya.onlineattandanceadmin;

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

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class PHP_Activity extends AppCompatActivity {

    private ProgressBar php_progressbar;
    SearchView mysearchview;
    RecyclerView php_recyleview;

    DatabaseReference database;
    myadapter myadapter1;
    ArrayList<Allsubject>list;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);

        //progressbar
        php_progressbar = findViewById(R.id.php_progressbar);
        php_recyleview = findViewById(R.id.php_recycleview);
        database = FirebaseDatabase.getInstance().getReference("Javascript");
        php_recyleview.setHasFixedSize(true);
        php_recyleview.setLayoutManager(new LinearLayoutManager(this));


//SearchView





        list = new ArrayList<>();

        myadapter1 = new myadapter(this,list);
        php_recyleview.setAdapter(myadapter1);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                php_progressbar.setVisibility(View.VISIBLE);
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    Allsubject allsubject = dataSnapshot.getValue(Allsubject.class);
                    list.add(allsubject);


                }
                php_progressbar.setVisibility(View.GONE);
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
