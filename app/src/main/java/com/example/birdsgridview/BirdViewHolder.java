package com.example.birdsgridview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvStudentImg;
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvDob;
    private TextView mTvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public BirdViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvName = itemView.findViewById(R.id.tvName);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }

    public void setData(BirdModel birdModel) {
        mIvStudentImg.setImageResource(birdModel.getImageId());
        mTvName.setText(birdModel.getName());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(birdModel, getAdapterPosition());
            }
        });
    }
}