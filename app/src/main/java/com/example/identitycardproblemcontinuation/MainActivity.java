package com.example.identitycardproblemcontinuation;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<Identity> identityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildIdentityList();
        setRecyclerView();
    }

    private void buildIdentityList() {
        identityList = new ArrayList<>();
        Identity identity1 = new Identity("Microsoft", R.drawable.bill_gates, "Age : 65", "Profession : Buisness");
        identityList.add(identity1);
        Identity identity2 = new Identity("Amazon", R.drawable.jeff_bezos, "Age : 57", "Profession : Buisness");
        identityList.add(identity2);
        Identity identity3 = new Identity("Masai School", R.drawable.prateek_sukla, "Age : 31", "Profession : Buisness");
        identityList.add(identity3);
        Identity identity4 = new Identity("Tesla", R.drawable.elon_musk, "Age : 50", "Profession : Buisness");
        identityList.add(identity4);
        Identity identity5 = new Identity("Facebook", R.drawable.mark_zuckerberg, "Age : 37", "Profession : Buisness");
        identityList.add(identity5);
        Identity identity6 = new Identity("Twitter", R.drawable.jack_dorsey, "Age : 44", "Profession : Buisness");
        identityList.add(identity6);
        Identity identity7 = new Identity("Google", R.drawable.sundar_pichai, "Age : 49", "Profession : Buisness");
        identityList.add(identity7);
        Identity identity8 = new Identity("Reliance", R.drawable.mukesh_ambani, "Age : 64", "Profession : Buisness");
        identityList.add(identity8);
        Identity identity9 = new Identity("Paytm", R.drawable.vijay_shekhar_sharma, "Age : 43", "Profession : Buisness");
        identityList.add(identity9);
        Identity identity10 = new Identity("Alibaba", R.drawable.jack_ma, "Age : 56", "Profession : Buisness");
        identityList.add(identity10);
        Identity identity11 = new Identity("Microsoft", R.drawable.bill_gates, "Age : 65", "Profession : Buisness");
        identityList.add(identity11);
        Identity identity12 = new Identity("Amazon", R.drawable.jeff_bezos, "Age : 57", "Profession : Buisness");
        identityList.add(identity12);
        Identity identity13 = new Identity("Masai School", R.drawable.prateek_sukla, "Age : 31", "Profession : Buisness");
        identityList.add(identity13);
        Identity identity14 = new Identity("Tesla", R.drawable.elon_musk, "Age : 50", "Profession : Buisness");
        identityList.add(identity14);
        Identity identity15 = new Identity("Facebook", R.drawable.mark_zuckerberg, "Age : 37", "Profession : Buisness");
        identityList.add(identity15);
        Identity identity16 = new Identity("Twitter", R.drawable.jack_dorsey, "Age : 44", "Profession : Buisness");
        identityList.add(identity16);
        Identity identity17 = new Identity("Google", R.drawable.sundar_pichai, "Age : 49", "Profession : Buisness");
        identityList.add(identity17);
        Identity identity18 = new Identity("Reliance", R.drawable.mukesh_ambani, "Age : 64", "Profession : Buisness");
        identityList.add(identity18);
        Identity identity19 = new Identity("Paytm", R.drawable.vijay_shekhar_sharma, "Age : 43", "Profession : Buisness");
        identityList.add(identity19);
        Identity identity20 = new Identity("Alibaba", R.drawable.jack_ma, "Age : 56", "Profession : Buisness");
        identityList.add(identity20);
    }

    private void setRecyclerView() {
        IdentityAdapter identityAdapter = new IdentityAdapter(identityList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(identityAdapter);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    @Override
    public void onItemClicked(Identity identity, int position) {
        new AlertDialog.Builder(this).setTitle("Details").setMessage(identity.getCompany() + "\n" + identity.getAge()).
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
    }
}