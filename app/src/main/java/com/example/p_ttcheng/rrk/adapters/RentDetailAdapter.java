package com.example.p_ttcheng.rrk.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p_ttcheng.rrk.R;

/**
 * Created by p_ttcheng on 2018/4/18.
 */

public class RentDetailAdapter extends RecyclerView.Adapter {
    private Context context;

    public RentDetailAdapter(Context context){
        this.context = context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case 0:
                View v0 = LayoutInflater.from(context).inflate(R.layout.item_detail_title,null);
                RecyclerView.ViewHolder h0 = new ZichanAdapter.ViewHolder(v0);
                return  h0;
            case 1:
                View v1 = LayoutInflater.from(context).inflate(R.layout.item_drawline,null);
                RecyclerView.ViewHolder h1 = new ZichanAdapter.ViewHolder(v1);
                return  h1;
            case 2:
                View v2 = LayoutInflater.from(context).inflate(R.layout.item_detail,null);
                RecyclerView.ViewHolder h2 = new ZichanAdapter.ViewHolder(v2);
                return  h2;
            case 3:
                View v3 = LayoutInflater.from(context).inflate(R.layout.item_detail_title,null);
                RecyclerView.ViewHolder h3 = new ZichanAdapter.ViewHolder(v3);
                return  h3;
            case 4:
                View v4 = LayoutInflater.from(context).inflate(R.layout.item_about,null);
                RecyclerView.ViewHolder h4 = new ZichanAdapter.ViewHolder(v4);
                return  h4;
            default:
                View v5 = LayoutInflater.from(context).inflate(R.layout.item_rent,null);
                RecyclerView.ViewHolder h5 = new ZichanAdapter.ViewHolder(v5);
                return  h5;
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    @Override
    public int getItemViewType(int position) {
        if (position < 5){
            return position;
        }

        return super.getItemViewType(position);
    }

    class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
