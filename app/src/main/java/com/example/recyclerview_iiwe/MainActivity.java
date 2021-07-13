package com.example.recyclerview_iiwe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<StudentModel> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void buildList() {
        for (int i = 0; i < 100; i++) {
            StudentModel studentModel = new StudentModel("Murali Krishna", 23, "Raipur , Chhattisgarh", "29/03/1999", R.drawable.jeff_bezos);
            studentList.add(studentModel);
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(StudentModel model, int position) {
        new AlertDialog.Builder(this).setTitle("Hey this is the Date").setMessage(model.getName() + "\n" + model.getAge() + "\n" + model.getDob() + "\n" + model.getAddress()).
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