package com.carr.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.carr.mylibrary.Tools;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void OnTest(View view){
        Toast.makeText(this,"click me! "+ Tools.test(),Toast.LENGTH_SHORT).show();
    }


}
