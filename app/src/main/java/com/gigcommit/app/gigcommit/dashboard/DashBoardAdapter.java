package com.gigcommit.app.gigcommit.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gigcommit.app.gigcommit.R;

import java.util.ArrayList;

import models.RowDataModel;

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.RowDataViewHolder> {

    private Context context;
    private ArrayList<RowDataModel> rowDataModelList = new ArrayList<>();

    public DashBoardAdapter(Context context, ArrayList<RowDataModel> rowDataModelList) {
        this.context = context;
        this.rowDataModelList = rowDataModelList;
    }

    @NonNull
    @Override
    public RowDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_dashboard_list_item, null);
        RowDataViewHolder viewHolder = new RowDataViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull RowDataViewHolder holder, int position) {

        RowDataModel rowDataModel = rowDataModelList.get(position);
        holder.titleName.setText(rowDataModel.getHeaderTitle());

        if (rowDataModel.getDashBoardModelList().size() > 1 && rowDataModel.getDashBoardModelList().get(position).getItemType() != 3) {
            holder.footerLayout.setVisibility(View.VISIBLE);
        } else {
            holder.footerLayout.setVisibility(View.GONE);
        }

        HorizontalListAdapter horizontalListAdapter = new HorizontalListAdapter(context, rowDataModelList.get(position).getDashBoardModelList());
        holder.horizontalList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.horizontalList.setHasFixedSize(true);
        holder.horizontalList.setAdapter(horizontalListAdapter);
    }

    @Override
    public int getItemCount() {
        return rowDataModelList.size();
    }


    public class RowDataViewHolder extends RecyclerView.ViewHolder {
        private TextView titleName;
        private RecyclerView horizontalList;
        private ViewGroup footerLayout;

        public RowDataViewHolder(View itemView) {
            super(itemView);
            titleName = (TextView) itemView.findViewById(R.id.header_title);
            horizontalList = (RecyclerView) itemView.findViewById(R.id.horizontal_list);
            footerLayout = (ViewGroup) itemView.findViewById(R.id.footer_layout);
        }
    }

}
