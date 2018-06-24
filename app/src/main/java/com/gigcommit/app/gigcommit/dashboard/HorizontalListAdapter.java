package com.gigcommit.app.gigcommit.dashboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gigcommit.app.gigcommit.R;
import com.gigcommit.app.gigcommit.views.CustomImageView;

import java.util.ArrayList;
import java.util.List;

import models.DashBoardModel;

public class HorizontalListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<DashBoardModel> dashBoardModelList = new ArrayList<>();
    private Context context;

    public HorizontalListAdapter(Context context, List<DashBoardModel> dashBoardModelList) {
        this.context = context;
        this.dashBoardModelList = dashBoardModelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        if (viewType == 1) {
            view = LayoutInflater.from(context).inflate(R.layout.card_dashboard_normal_view, null);
            DetailsItemHolder detailsItemHolder = new DetailsItemHolder(view);
            return detailsItemHolder;
        } else if (viewType == 2) {
            view = LayoutInflater.from(context).inflate(R.layout.card_dashboard_recent_views, null);
            RecentlyViewedHolder recentlyViewedHolder = new RecentlyViewedHolder(view);
            return recentlyViewedHolder;
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.layout_card_tab_single_view, null);
            TabViewHolder tabViewHolder = new TabViewHolder(view);
            return tabViewHolder;
        }
    }

    @Override
    public int getItemViewType(int position) {
        // if(dashBoardModelList.get(position)==null) return 3;
        return dashBoardModelList.get(position).getItemType();
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        DashBoardModel dashBoardModel = dashBoardModelList.get(position);

        if (holder.getItemViewType() == 1) {
            DetailsItemHolder detailsItemHolder = (DetailsItemHolder) holder;
            detailsItemHolder.topicName.setText(dashBoardModel.getTopicName());
            detailsItemHolder.topicDate.setText(dashBoardModel.getDateTime());
            detailsItemHolder.location.setText(dashBoardModel.getLocation());
            detailsItemHolder.rateView.setText(dashBoardModel.getRate());
            detailsItemHolder.scoreView.setText(dashBoardModel.getMuncheScore());
            Glide.with(context)
                    .load(dashBoardModel.getImageUrl())
                    .into(detailsItemHolder.imageView);
        } else if (holder.getItemViewType() == 2) {
            RecentlyViewedHolder recentlyViewedHolder = (RecentlyViewedHolder) holder;
            recentlyViewedHolder.topicName.setText(dashBoardModel.getTopicName());
            if (dashBoardModel.getRate() == null) {
                recentlyViewedHolder.rateView.setText("0.00");
            } else {
                recentlyViewedHolder.rateView.setText(dashBoardModel.getRate());
            }
            //recentlyViewedHolder.rateView.setText(dashBoardModel.getRate());
            recentlyViewedHolder.scoreView.setText(dashBoardModel.getMuncheScore());
            Glide.with(context)
                    .load(dashBoardModel.getImageUrl())
                    .into(recentlyViewedHolder.imageView);

        } else {
            TabViewHolder tabViewHolder = (TabViewHolder) holder;
            ((TabViewHolder) holder).tabName.setText(dashBoardModel.getTopicName());
        }
    }

    @Override
    public int getItemCount() {
        return dashBoardModelList.size();
    }

    public class DetailsItemHolder extends RecyclerView.ViewHolder {
        private TextView topicName;
        private TextView topicDate;
        private TextView location;
        private TextView rateView;
        private TextView scoreView;
        private CustomImageView imageView;

        public DetailsItemHolder(View itemView) {
            super(itemView);
            topicName = (TextView) itemView.findViewById(R.id.topic_name);
            imageView = (CustomImageView) itemView.findViewById(R.id.imageView);
            topicDate = (TextView) itemView.findViewById(R.id.topic_date);
            location = (TextView) itemView.findViewById(R.id.location);
            rateView = (TextView) itemView.findViewById(R.id.rate_text);
            scoreView = (TextView) itemView.findViewById(R.id.gig_score_text);
        }
    }

    public class RecentlyViewedHolder extends RecyclerView.ViewHolder {
        private TextView topicName;
        private TextView rateView;
        private TextView scoreView;
        private CustomImageView imageView;

        public RecentlyViewedHolder(View itemView) {
            super(itemView);
            topicName = (TextView) itemView.findViewById(R.id.topic_name);
            imageView = (CustomImageView) itemView.findViewById(R.id.imageView);
            rateView = (TextView) itemView.findViewById(R.id.rate_text);
            scoreView = (TextView) itemView.findViewById(R.id.gig_score_text);
        }
    }

    public class TabViewHolder extends RecyclerView.ViewHolder {
        private Button tabName;

        public TabViewHolder(View itemView) {
            super(itemView);
            tabName = (Button) itemView.findViewById(R.id.button);
        }
    }

//    public class TabHolder extends RecyclerView.ViewHolder{
//        private TextView topicName;
//        private TextView rateView;
//        private TextView scoreView;
//        private CustomImageView imageView;
//
//        public RecentlyViewedHolder(View itemView) {
//            super(itemView);
//            topicName =(TextView) itemView.findViewById(R.id.topic_name);
//            imageView =(CustomImageView) itemView.findViewById(R.id.imageView);
//
//        }
//    }

}
