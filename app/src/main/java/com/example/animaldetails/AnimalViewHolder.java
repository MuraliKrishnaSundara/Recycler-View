package com.example.animaldetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private TextView mTvSound;
    private ImageView mIvImage;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvSound = itemView.findViewById(R.id.tvSound);
        mIvImage = itemView.findViewById(R.id.ivImage);
    }

    public void setData(Animal animal) {
        mTvName.setText(animal.getName());
        mTvSound.setText(animal.getSound());
        ;
        mIvImage.setImageResource(animal.getImageView());
    }
}