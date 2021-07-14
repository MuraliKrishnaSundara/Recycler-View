package com.example.birdsgridview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<BirdModel> birdList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        BirdAdapter birdAdapter = new BirdAdapter(birdList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(birdAdapter);
    }

    private void buildList() {
        for (int i = 0; i < 25; i++) {
            BirdModel birdModel = new BirdModel("Black Drongo", R.drawable.black_drongo);
            birdList.add(birdModel);
            BirdModel birdModel1 = new BirdModel("Greater Coucal", R.drawable.greater_coucal);
            birdList.add(birdModel1);
            BirdModel birdModel2 = new BirdModel("Green Bee", R.drawable.green_bee);
            birdList.add(birdModel2);
            BirdModel birdModel3 = new BirdModel("Indian Roller", R.drawable.indian_roller);
            birdList.add(birdModel3);
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(BirdModel model, int position) {
        new AlertDialog.Builder(this).setTitle("Bird Name").setMessage(model.getName()).
                setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).
                setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).
                show();
        //Toast.makeText(this, model.getName() + " pos = " + position, Toast.LENGTH_SHORT).show();
    }
}