package com.example.identitycardproblemcontinuation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdentityAdapter extends RecyclerView.Adapter<IdentityViewHolder> {

    private ArrayList<Identity> identitieList;
    private ItemClickListener itemClickListener;

    public IdentityAdapter(ArrayList<Identity> animalList, ItemClickListener itemClickListener) {
        this.identitieList = animalList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public IdentityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new IdentityViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull IdentityViewHolder holder, int position) {
        Identity identity = identitieList.get(position);
        holder.setData(identity);
    }

    @Override
    public int getItemCount() {
        return identitieList.size();
    }
}