package com.example.powerj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalendarScheduleRecyclerAdapter extends RecyclerView.Adapter<CalendarScheduleRecyclerAdapter.ViewHolder>{
    private ArrayList<CalendarScheduleRecyclerItem> lists = new ArrayList<>();
    private SQLiteDatabase sqliteDB;

    private int year, month, day;

    CalendarScheduleRecyclerAdapter(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_calendar_schedule_content1;
        private TextView tv_calendar_schedule_content2;
        private TextView tv_calendar_schedule_content3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_calendar_schedule_content1 = (TextView)itemView.findViewById(R.id.tv_calendar_schedule_content1);
            tv_calendar_schedule_content2 = (TextView)itemView.findViewById(R.id.tv_calendar_schedule_content2);
            tv_calendar_schedule_content3 = (TextView)itemView.findViewById(R.id.tv_calendar_schedule_content3);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.recycler_calendar_schedule,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CalendarScheduleRecyclerItem item = lists.get(position);

        holder.tv_calendar_schedule_content1.setText(item.getContent1());
        holder.tv_calendar_schedule_content2.setText(item.getContent2());
        holder.tv_calendar_schedule_content3.setText(item.getContent3());
        selItem(holder, item);

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public void addItem(String content1, String content2, String content3){
        CalendarScheduleRecyclerItem item = new CalendarScheduleRecyclerItem();

        item.setContent1(content1);
        item.setContent2(content2);
        item.setContent3(content3);

        lists.add(item);
    }

    private void selItem(ViewHolder holder, CalendarScheduleRecyclerItem item){
        holder.tv_calendar_schedule_content1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.powerj.CalendarScheduleShowActivity.class);
                intent.putExtra("content1", item.getContent1());
                intent.putExtra("content2", item.getContent2());
                intent.putExtra("content3", item.getContent3());
                intent.putExtra("year", year);
                intent.putExtra("month", month);
                intent.putExtra("day", day);
                ((Activity)v.getContext()).startActivityForResult(intent, 0);
            }
        });

        holder.tv_calendar_schedule_content2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.powerj.CalendarScheduleShowActivity.class);
                intent.putExtra("content1", item.getContent1());
                intent.putExtra("content2", item.getContent2());
                intent.putExtra("content3", item.getContent3());
                intent.putExtra("year", year);
                intent.putExtra("month", month);
                intent.putExtra("day", day);
                ((Activity)v.getContext()).startActivityForResult(intent, 0);
            }
        });

        holder.tv_calendar_schedule_content3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), com.example.powerj.CalendarScheduleShowActivity.class);
                intent.putExtra("content1", item.getContent1());
                intent.putExtra("content2", item.getContent2());
                intent.putExtra("content3", item.getContent3());
                intent.putExtra("year", year);
                intent.putExtra("month", month);
                intent.putExtra("day", day);
                ((Activity)v.getContext()).startActivityForResult(intent, 0);
            }
        });
    }
}