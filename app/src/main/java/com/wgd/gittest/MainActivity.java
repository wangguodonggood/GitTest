package com.wgd.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("adadad", "onCreate: 修改Log");
        Log.i("adadad", "onCreate: liuyi 添加Log");
        Log.i("adadad", "onCreate: liuyi 修改xml");
        Log.i("adadad", "onCreate: liuyi 删除了一行log");
        Log.i("adadad", "onCreate: liuyi再次添加了一行Log");
    }
}