package com.example.week3daily3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BigIntArray extends AppCompatActivity implements Async.AsyncCallBack {

    TextView tvBIGTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_int_array);
        tvBIGTextview = findViewById(R.id.tvBigTextview);


    }

    @Override
    public void returnString(String string) {

    }
}
