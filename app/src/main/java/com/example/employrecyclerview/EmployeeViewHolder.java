package com.example.employrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvAddress;
    private ImageView mIvEdit;
    private ItemClickListener itemClickListener;

    public EmployeeViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        initData(itemView);
        this.itemClickListener = itemClickListener;
    }

    private void initData(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mIvEdit = itemView.findViewById(R.id.ivEdit);
    }

    public void setData(Employee employee) {
        mTvName.setText(employee.getName());
        mTvAge.setText(employee.getAge() + "");
        mTvAddress.setText(employee.getAddress());
        mIvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(), employee);
            }
        });
    }
}