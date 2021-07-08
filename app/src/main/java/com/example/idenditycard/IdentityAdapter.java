package com.example.idenditycard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdentityAdapter extends RecyclerView.Adapter<IdentityViewHolder> {

    private ArrayList<Identity> identitieList;

    public IdentityAdapter(ArrayList<Identity> animalList) {
        this.identitieList = animalList;
    }

    @NonNull
    @Override
    public IdentityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new IdentityViewHolder(view);
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