package com.example.pepe.activitystuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void imgBtnHandler(View view) {
        Intent i = new Intent(this, Activity2.class);
        String str = getResources().getString(R.string.country);
        i.putExtra("country", str);
        startActivity(i);
    }
}
