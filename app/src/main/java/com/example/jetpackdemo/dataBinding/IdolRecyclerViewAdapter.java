package com.example.jetpackdemo.dataBinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db05ItemBinding;

import java.util.List;

/**
 * @TODO:
 * @Date: 2021/11/29 10:32
 * @User: lay
 */
public class IdolRecyclerViewAdapter extends RecyclerView.Adapter<IdolRecyclerViewAdapter.MyViewHolder> {

    List<Idol> idols;

    public IdolRecyclerViewAdapter(List<Idol> idols) {
        this.idols = idols;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Db05ItemBinding itemBinding =  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.db05_item,
                parent,
                false);
        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Idol idol = idols.get(position);
        holder.itemBinding.setIdol(idol);
    }

    @Override
    public int getItemCount() {
        return idols.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        private Db05ItemBinding itemBinding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public MyViewHolder(Db05ItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }
    }
}
