package com.gigcommit.app.gigcommit.dashboard.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.gigcommit.app.gigcommit.R;
import com.gigcommit.app.gigcommit.dashboard.DashBoardAdapter;

import models.ListData;


public class HomeFragment extends Fragment {


    private RecyclerView recyclerView;
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(getContext(), ListData.getDashBoardData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(dashBoardAdapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();


    }

}
