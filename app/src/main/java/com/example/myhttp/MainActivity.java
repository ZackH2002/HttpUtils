package com.example.myhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String con = "username=hdh25490&password=Hdh4568520";
        new Thread(new Runnable() {
            @Override
            public void run() {
                String result = HttpUtils.HttpPOST("https://www.wanandroid.com/user/login",con);
                Log.d("MyTAG",result);


                }




            }).start();

    }
}