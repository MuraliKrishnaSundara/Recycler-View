package com.example.identitycardproblemcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IdentityViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvCompany;
    private ImageView mIvImage;
    private TextView mTvAge;
    private TextView mTvProfession;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public IdentityViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProfession);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }

    public void setData(Identity identity) {
        mTvCompany.setText(identity.getCompany());
        mIvImage.setImageResource(identity.getImageView());
        mTvAge.setText(identity.getAge());
        mTvProfession.setText(identity.getProfession());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(identity, getAdapterPosition());
            }
        });
    }
}