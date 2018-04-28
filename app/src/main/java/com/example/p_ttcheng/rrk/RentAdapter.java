package com.example.p_ttcheng.rrk;

import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by p_ttcheng on 2018/4/3.
 */

public class RentAdapter  extends RecyclerView.Adapter<RentAdapter.ViewHolder> {

    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private LoopViewPager mLoopViewPager;
        public ViewHolder(View layout,int type) {
            super(layout);
            switch (type){
                case 0:
                    mLoopViewPager = (LoopViewPager) layout.findViewById(R.id.lvp);
                    mLoopViewPager.setAdapter(new SamplePagerAdapter(3));
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            };
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RentAdapter(String[] myDataset) {
        mDataset = myDataset;
    }
    public RentAdapter() {
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
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 4;
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        switch (viewType){
            case 0:
                // create a new view
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zuyong_autovp, parent, false);
                // set the view's size, margins, paddings and layout parameters
                RentAdapter.ViewHolder vh = new RentAdapter.ViewHolder(v,viewType);
                return vh;
            case 1:
                // create a new view
                View v1 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zuyong_hot, parent, false);
                // set the view's size, margins, paddings and layout parameters
                RentAdapter.ViewHolder vh1 = new RentAdapter.ViewHolder(v1,viewType);
                return vh1;
            case 2:
                // create a new view
                View v2 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zuyong_yt, parent, false);
                // set the view's size, margins, paddings and layout parameters
                RentAdapter.ViewHolder vh2 = new RentAdapter.ViewHolder(v2,viewType);
                return vh2;
            case 3:
                // create a new view
                View v3 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zuyong_notify, parent, false);
                // set the view's size, margins, paddings and layout parameters
                RentAdapter.ViewHolder vh3 = new RentAdapter.ViewHolder(v3,viewType);
                return vh3;
            case 4:
                // create a new view
                View v4 = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_zuyong_item, parent, false);
                // set the view's size, margins, paddings and layout parameters
                RentAdapter.ViewHolder vh4 = new RentAdapter.ViewHolder(v4,viewType);
                return vh4;
        }

        return null;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RentAdapter.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        // holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 10;
    }
}
class SamplePagerAdapter extends PagerAdapter {
    private final Random random = new Random();
    private int mSize;

    public SamplePagerAdapter() {
        mSize = 5;
    }

    public SamplePagerAdapter(int count) {
        mSize = count;
    }

    @Override
    public int getCount() {
        return mSize;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup view, int position, Object object) {
        view.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        TextView textView = new TextView(view.getContext());
        Random random = new Random();
        textView.setText(position + 1 + "");
        textView.setBackgroundColor(0xff000000 | random.nextInt(0x00ffffff));
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(50);
        view.addView(textView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        return textView;
    }

    // 增加item
    public void addItem() {
        mSize++;
        notifyDataSetChanged();
    }

    // 删除item
    public void removeItem() {
        mSize--;
        mSize = mSize < 0 ? 0 : mSize;

        notifyDataSetChanged();
    }
}
