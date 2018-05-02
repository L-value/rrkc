package com.example.p_ttcheng.rrk.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.p_ttcheng.rrk.R;
import com.example.p_ttcheng.rrk.adapters.RentAdapter;
import com.example.p_ttcheng.rrk.adapters.RentDetailAdapter;

public class RentActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentt);
        mRecyclerView = (RecyclerView) findViewById(R.id.reView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new RentDetailAdapter(RentActivity.this));

    }
}
