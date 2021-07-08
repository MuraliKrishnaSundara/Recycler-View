package com.example.idenditycard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IdentityViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvCompany;
    private ImageView mIvImage;
    private TextView mTvAge;
    private TextView mTvProfession;

    public IdentityViewHolder(@NonNull View itemView) {
        super(itemView);
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mTvCompany = itemView.findViewById(R.id.tvCompany);
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProfession);

    }

    public void setData(Identity identity) {
        mTvCompany.setText(identity.getCompany());
        mIvImage.setImageResource(identity.getImageView());
        mTvAge.setText(identity.getAge());
        mTvProfession.setText(identity.getProfession());
    }
}