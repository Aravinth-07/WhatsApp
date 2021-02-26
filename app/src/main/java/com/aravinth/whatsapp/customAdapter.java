package com.aravinth.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class customAdapter extends RecyclerView.Adapter<customAdapter.myviewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public customAdapter(Context ct, String s1[], String s2[], int img[])
    {
       context = ct;
       data1 = s1;
       data2 = s2;
       images = img;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_model,parent,false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.name.setText(data1[position]);
        holder.desc.setText(data2[position]);
        holder.dp.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class myviewHolder extends RecyclerView.ViewHolder {

        TextView name,desc;
        ImageView dp;
        public myviewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.myname);
            desc = itemView.findViewById(R.id.mydesc);
            dp = itemView.findViewById(R.id.mydp);
        }
    }
}