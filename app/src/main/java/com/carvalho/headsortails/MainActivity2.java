package com.carvalho.headsortails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textName;
    private  TextView textAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textName = findViewById(R.id.textName);
        textAge = findViewById(R.id.textAge);

        Bundle data = getIntent().getExtras();

        textName.setText(data.getString("name"));
        textAge.setText(String.valueOf(data.getInt("age")));
    }
}