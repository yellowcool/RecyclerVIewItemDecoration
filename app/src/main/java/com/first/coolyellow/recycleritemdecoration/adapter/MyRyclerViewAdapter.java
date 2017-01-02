package com.first.coolyellow.recycleritemdecoration.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.first.coolyellow.recycleritemdecoration.R;
import com.first.coolyellow.recycleritemdecoration.holder.MyRecyclerHolder;

/**
 * Created by coolyellow on 1/2/17.
 */

public class MyRyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerHolder> {
    @Override
    public MyRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item, parent, false);
        return new MyRecyclerHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyRecyclerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 50;
    }
}
