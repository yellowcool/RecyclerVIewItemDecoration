package com.first.coolyellow.recycleritemdecoration;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.first.coolyellow.recycleritemdecoration.adapter.MyRyclerViewAdapter;
import com.first.coolyellow.recycleritemdecoration.databinding.ActivityMainBinding;
import com.first.coolyellow.recycleritemdecoration.view.MyItemDecoration;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));

        binding.recyclerview.setAdapter(new MyRyclerViewAdapter());
        binding.recyclerview.addItemDecoration(new MyItemDecoration());
    }
}
