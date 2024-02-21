package com.sapir.namesfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Name> arr =DataManger.getNames();
        String json = new Gson().toJson(arr);
        int x=9;

        MyCallback myCallback = new MyCallback();

        // Create an instance of NameController
        NameController nameController = new NameController(myCallback, myCallback);

        // Call the fetchAllName method to fetch all names
     //   nameController.fetchAllName();

        // Call the fetchByLetter method to fetch names by a specific letter
        String letter = "D"; // Example letter
//        nameController.fetchByLetter(letter);
        String category ="Biblical";
      //  nameController.fetchByCategory(category);
        //nameController.fetchByCategoryAndLetter(category,letter);
        nameController.fetchByRandom();


        int y =10;
    }
}