package com.example.birdsgridview;

import com.example.birdsgridview.BirdModel;

public interface ItemClickListener {
    void onItemClicked(BirdModel model, int position);
}