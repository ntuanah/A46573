package com.example.a46573.tuan22;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.a46573.R;

public class Tuan22SecondActivity extends AppCompatActivity {
    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_second);
        tv1=findViewById(R.id.tuan22Tv1);
        //don du lieu
        Intent i1=getIntent();
        //do hang
        String chuoi1=i1.getExtras().getString("so1");
        String chuoi2=i1.getExtras().getString("so2");
        //---
        float so1=Float.parseFloat(chuoi1);//chuyen sang so
        float so2=Float.parseFloat(chuoi2);
        float tong=so1+so2;
        //hien thi ket qua
        tv1.setText(String.valueOf(tong));
    }
}