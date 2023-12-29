package com.example.a46573.tuan23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.a46573.R;

public class tuan23MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan23_main);
        lv=findViewById(R.id.tuan23Listview);
        //nguon du lieu
        String[] arr=new String[]{"Tuan 1","Tuan 2","Tuan 3","Tuan 4","Tuan 5","Tuan 6","Tuan 7","Tuan 8"};
        //adapter
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        //hien thi len listview
        lv.setAdapter(adapter);
    }
}