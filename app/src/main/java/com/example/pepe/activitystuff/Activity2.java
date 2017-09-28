package com.example.pepe.activitystuff;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }
    public void searchHandler(View view) {
        String country = getIntent().getExtras().getString("country");
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.ca/search?q=" + Uri.encode(country)));
        startActivity(intent);

    }
    public void mapHandler (View view) {
        String country = getIntent().getExtras().getString("country");
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=" + Uri.encode(country)));
        startActivity(intent);
    }
}
