package com.example.healthtracker;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class DiaryLayoutAdapter extends RecyclerView.Adapter<DiaryLayoutAdapter.DiaryHolder> {

    public static class DiaryHolder extends RecyclerView.ViewHolder {
        public TextView textTitle;
        public TextView textQuantity;
        public TextView textDescription;
        public TextView textTimestamp;

        public DiaryHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
