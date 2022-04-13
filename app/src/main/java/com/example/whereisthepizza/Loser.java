package com.example.whereisthepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Loser extends AppCompatActivity implements View.OnClickListener {

    ImageView btnback2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loser);

        btnback2 = (ImageView) findViewById(R.id.btn2);
        btnback2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn2:
                Intent intent = new Intent(this,startGame.class);
                startActivity(intent);
                break;
        }
    }
}