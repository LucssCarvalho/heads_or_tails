package com.carvalho.headsortails;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private ImageView resultImage;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnBack = findViewById(R.id.btnBack);
        resultImage = findViewById(R.id.imageView2);

        Bundle data = getIntent().getExtras();
        int num = data.getInt("result");

        if (num == 0) resultImage.setImageResource(R.drawable.moeda_cara);
        else resultImage.setImageResource(R.drawable.moeda_coroa);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}