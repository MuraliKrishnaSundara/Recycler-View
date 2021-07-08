package com.example.animaldetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        animalList = new ArrayList<>();
        Animal animal1 = new Animal("Tiger", "Roar", R.drawable.tiger);
        animalList.add(animal1);
        Animal animal2 = new Animal("Bear", "Growl", R.drawable.bears);
        animalList.add(animal2);
        Animal animal3 = new Animal("Lion", "Roar", R.drawable.lion);
        animalList.add(animal3);
        Animal animal4 = new Animal("Cat", "Meow", R.drawable.cat);
        animalList.add(animal4);
        Animal animal5 = new Animal("Deer", "Bellow", R.drawable.deer);
        animalList.add(animal5);
        Animal animal6 = new Animal("Dog", "Bark", R.drawable.dog);
        animalList.add(animal6);
        Animal animal7 = new Animal("Donkey", "Bray", R.drawable.donkey);
        animalList.add(animal7);
        Animal animal8 = new Animal("Elephant", "Trumpet", R.drawable.elephant);
        animalList.add(animal8);
        Animal animal9 = new Animal("Zebra", "Whinny", R.drawable.zebra);
        animalList.add(animal9);
        Animal animal10 = new Animal("Giraffe", "Hum", R.drawable.giraffe);
        animalList.add(animal10);
        Animal animal11 = new Animal("Goat", "Maa", R.drawable.goat);
        animalList.add(animal11);
        Animal animal12 = new Animal("Hare", "Squeak", R.drawable.hare);
        animalList.add(animal12);
        Animal animal13 = new Animal("Hippopotamus", "Growl", R.drawable.hippopotamus);
        animalList.add(animal13);
        Animal animal14 = new Animal("Horse", "Neigh", R.drawable.horse);
        animalList.add(animal14);
        Animal animal15 = new Animal("Kangaroo", "Chortle", R.drawable.kangaroo);
        animalList.add(animal15);
        Animal animal16 = new Animal("Koala", "Shriek", R.drawable.koala);
        animalList.add(animal16);
        Animal animal17 = new Animal("Monkey", "Scream", R.drawable.monkey);
        animalList.add(animal17);
        Animal animal18 = new Animal("Mouse", "Squeak", R.drawable.mouse);
        animalList.add(animal18);
        Animal animal19 = new Animal("Rhinoceros", "Bellow", R.drawable.rhino);
        animalList.add(animal19);
        Animal animal20 = new Animal("Snake", "Hiss", R.drawable.snake);
        animalList.add(animal20);
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}