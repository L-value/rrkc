package com.example.p_ttcheng.rrk.fragements;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.p_ttcheng.rrk.R;
import com.example.p_ttcheng.rrk.adapters.RentAdapter;
import com.example.p_ttcheng.rrk.adapters.ZichanAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ZiChanFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ZiChanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ZiChanFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mSecondAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private SwipeRefreshLayout mRefreshLayout;

    public ZiChanFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_zi_chan, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.m_recycler_view);
        mRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.zichan_sw);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mSecondAdapter = new ZichanAdapter(getActivity());
        mRecyclerView.setAdapter(mSecondAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mRefreshLayout.setRefreshing(false);
        mRefreshLayout.destroyDrawingCache();
        mRefreshLayout.clearAnimation();
    }
}
