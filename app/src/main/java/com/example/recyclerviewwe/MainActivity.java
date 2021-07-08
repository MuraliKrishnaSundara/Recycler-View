package com.example.recyclerviewwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        Student student1 = new Student("Murali", 22, "FA3-085");
        studentList.add(student1);
        for (int i = 0; i < 101; i++) {
            Student student = new Student("XYZ-" + i, 21, "FA3-" + i);
            studentList.add(student);
        }

    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}