package com.aravinth.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class customAdapter extends RecyclerView.Adapter<customAdapter.myviewHolder> {

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class myviewHolder extends RecyclerView.ViewHolder {
        public myviewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}