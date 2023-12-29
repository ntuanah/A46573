package com.example.a46573.tuan22;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.a46573.R;

public class Tuan22MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        txt1=findViewById(R.id.tuan22txt1);
        txt2=findViewById(R.id.tuan22txt2);
        btn1=findViewById(R.id.tuan22Btn1);
        //su kien khi click button
        btn1.setOnClickListener(v->{
            //dinh huong di chuyen
            Intent i=new Intent(Tuan22MainActivity.this,Tuan22SecondActivity.class);
            //dua du lieu vao
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}