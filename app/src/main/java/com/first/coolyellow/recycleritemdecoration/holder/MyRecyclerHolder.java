package com.first.coolyellow.recycleritemdecoration.holder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by coolyellow on 1/2/17.
 */

public class MyRecyclerHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private T binding;

    public MyRecyclerHolder(T binding) {

        super(binding.getRoot());
        this.binding = binding;
    }
    public T getBinding(){
        return binding;
    }
}
