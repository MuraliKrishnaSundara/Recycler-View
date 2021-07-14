package com.example.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdViewHolder> {

    private ArrayList<BirdModel> birdList;
    private ItemClickListener itemClickListener;

    public BirdAdapter(ArrayList<BirdModel> birdList, ItemClickListener itemClickListener) {
        this.birdList = birdList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public BirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new BirdViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
        BirdModel birdModel = birdList.get(position);
        holder.setData(birdModel);
    }

    @Override
    public int getItemCount() {
        return birdList.size();
    }
}