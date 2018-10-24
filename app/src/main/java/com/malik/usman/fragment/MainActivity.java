package com.malik.usman.fragment;

import android.app.Activity;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button b1;
    ListView List_V1;
String arr[]={"malik usman","saad raza","M .Luqman","Hamza","Luqman Ahmed","Syed Qasim","Ahsan Ayub","M. Ajmal","Mahaaz","M.shoiab","Golden","Umer","Ahmed","Zahid","Husnain"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1= findViewById(R.id.btn_1);
         b1.setOnClickListener(this);
        List_V1= findViewById(R.id.list_v1);

        ArrayAdapter abc;
        abc= new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arr);
        List_V1.setAdapter(abc);

    }

    @Override
    public void onClick(View v) {
        Intent ab= new Intent(MainActivity.this,Second_Activity.class);
        startActivity(ab);
    }
}