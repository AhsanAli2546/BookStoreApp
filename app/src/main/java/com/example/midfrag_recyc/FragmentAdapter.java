package com.example.midfrag_recyc;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.ViewHolder>{
    public static List<Model> list;
    Context context;
public FragmentAdapter(Context context,List<Model> list){
    this.context=context;
    this.list=list;
}

    @NonNull
    @Override
    public FragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_row,parent,false);
    ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentAdapter.ViewHolder holder, int position) {
    holder.img.setImageResource(list.get(position).getImg());
    holder.title.setText(list.get(position).title);
    holder.des.setText(list.get(position).description);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView title,des;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.txt);
            des = itemView.findViewById(R.id.des);

        }
    }
}
