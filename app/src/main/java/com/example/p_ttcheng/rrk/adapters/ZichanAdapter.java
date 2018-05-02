package com.example.p_ttcheng.rrk.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p_ttcheng.rrk.R;
import com.example.p_ttcheng.rrk.activities.RecycleActivity;

/**
 * Created by p_ttcheng on 2018/4/3.
 */

public class ZichanAdapter extends RecyclerView.Adapter<ZichanAdapter.ViewHolder> {
    private String[] mDataset;
    private Context context;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public ViewHolder(View layout) {
            super(layout);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ZichanAdapter(String[] myDataset) {
        mDataset = myDataset;
    }
    public ZichanAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position){
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
        }
        return super.getItemViewType(position);
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ZichanAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        switch (viewType){
            case 0:
                // create a new view
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zichan_shuzi, parent, false);
                // set the view's size, margins, paddings and layout parameters
                v.findViewById(R.id.recycle).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        context.startActivity(new Intent(context, RecycleActivity.class));
                    }
                });
                ViewHolder vh = new ViewHolder(v);
                return vh;
            case 1:
                // create a new view
                View v1 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zichan_bizhong, parent, false);
                // set the view's size, margins, paddings and layout parameters
                ViewHolder vh1 = new ViewHolder(v1);
                return vh1;
            case 2:
                // create a new view
                View v2 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zichan_wakuang, parent, false);
                // set the view's size, margins, paddings and layout parameters
                ViewHolder vh2 = new ViewHolder(v2);
                return vh2;
        }

         return null;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
       // holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 3;
    }
}