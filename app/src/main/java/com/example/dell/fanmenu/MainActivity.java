package com.example.dell.fanmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dell.fanmenu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_withFab(View view) {
        startActivity(new Intent(this, FanMenuButtons1Activity.class));
    }

    public void onClick_withoutFab(View view) {
        startActivity(new Intent(this, FanMenuButtons2Activity.class));
    }
}
