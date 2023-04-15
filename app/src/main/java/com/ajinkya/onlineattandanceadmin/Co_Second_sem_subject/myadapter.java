package com.ajinkya.onlineattandanceadmin.Co_Second_sem_subject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajinkya.onlineattandanceadmin.Allsubject;
import com.ajinkya.onlineattandanceadmin.R;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.MyViewHolder> {

    Context context;
    ArrayList<com.ajinkya.onlineattandanceadmin.Allsubject>list;
  // ArrayList<Allsubject>searchviewarraylist;
    public myadapter(Context context, ArrayList<com.ajinkya.onlineattandanceadmin.Allsubject> list) {
        this.context = context;
        this.list = list;
        //this.searchviewarraylist = new ArrayList<>(searchviewarraylist);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.c_card_holder,parent,false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Allsubject allsubject = list.get(position);
        holder.branch.setText(allsubject.getBranch());
        holder.date.setText(allsubject.getDate());
        holder.name.setText(allsubject.getName());
        holder.roll_no.setText(allsubject.getRoll_no());
        holder.time.setText(allsubject.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

//    @Override
//    public Filter getFilter() {
//        return null;
//    }

//    private final Filter newsFilter = new Filter() {
//        @Override
//        protected FilterResults performFiltering(CharSequence constraint) {
//            ArrayList<Allsubject> filteredNewsList = new ArrayList<>();
//
//            if (constraint == null || constraint.length()== 0)
//            {
//                filteredNewsList.addAll(searchviewarraylist);
//            }
//            else {
//                String filterpattern = constraint.toString().toLowerCase().trim();
//
//                for (Allsubject allsubject : searchviewarraylist)
//                {
//                    if (allsubject.name.toLowerCase().contains(filterpattern))
//                        filteredNewsList.add(allsubject);
//
//                }
//            }
//            FilterResults results = new FilterResults();
//            results.values = filteredNewsList;
//            results.count =filteredNewsList.size();
//            return results;
//        }
//
//        @Override
//        protected void publishResults(CharSequence constraint, FilterResults results) {
//
//
//            list.clear();
//        //    list.addAll((ArrayList).results.values);
//          list.addAll((ArrayList)results.values);
//          notifyDataSetChanged();
//
//
//        }
//    };
    public static class MyViewHolder extends RecyclerView.ViewHolder{
  TextView branch,date,name,roll_no,time;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            branch = itemView.findViewById(R.id.tv_branch);
            date = itemView.findViewById(R.id.tv_date);
            name = itemView.findViewById(R.id.tv_name);
            roll_no = itemView.findViewById(R.id.tv_roll_no);
            time = itemView.findViewById(R.id.tv_time);


        }
    }


    }

