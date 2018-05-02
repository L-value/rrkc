package com.example.p_ttcheng.rrk.activities;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.p_ttcheng.rrk.R;
import com.example.p_ttcheng.rrk.fragements.RentFragment;
import com.example.p_ttcheng.rrk.fragements.ZiChanFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private FrameLayout mContent;
    private RentFragment mRentFragment;
    private ZiChanFragment mZiChanFragment;

    private FragmentManager mFragmentManager;

    private Button mRent,mZichan,mWallet,mMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContent = (FrameLayout) findViewById(R.id.content);
        mRent = (Button) findViewById(R.id.btn_rent);
        mZichan = (Button) findViewById(R.id.btn_zichan);
        mWallet = (Button) findViewById(R.id.btn_wallet);
        mMe = (Button) findViewById(R.id.btn_me);
        mRent.setOnClickListener(this);
        mZichan.setOnClickListener(this);

        mFragmentManager = getSupportFragmentManager();
        mRentFragment = new RentFragment();
        mZiChanFragment = new ZiChanFragment();
        mFragmentManager.beginTransaction().add(R.id.content,mRentFragment).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_rent:
                mFragmentManager.beginTransaction().replace(R.id.content,mRentFragment).commit();
                break;
            case R.id.btn_zichan:
                mFragmentManager.beginTransaction().replace(R.id.content,mZiChanFragment).commit();
                break;
            case R.id.btn_wallet:
                break;
            case R.id.btn_me:
                break;

        }
    }
}
