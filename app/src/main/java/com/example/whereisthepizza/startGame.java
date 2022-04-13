package com.example.whereisthepizza;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import java.util.Random;

public class startGame extends AppCompatActivity implements View.OnClickListener{


    private TextView tvpizza, tvempty;
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9,ex;
    private View lastview = null;
    private TextView countpizza;
    private TextView countempty;
    private int count1 = 0;
    private int count2 = 0;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countpizza = (TextView) findViewById(R.id.numsum);
        countempty = (TextView) findViewById(R.id.numempty);

        img1 = (ImageView) findViewById(R.id.img1);
        img1.setOnClickListener(this);
        img2 = (ImageView) findViewById(R.id.img2);
        img2.setOnClickListener(this);
        img3 = (ImageView) findViewById(R.id.img3);
        img3.setOnClickListener(this);
        img4 = (ImageView) findViewById(R.id.img4);
        img4.setOnClickListener(this);
        img5 = (ImageView) findViewById(R.id.img5);
        img5.setOnClickListener(this);
        img6 = (ImageView) findViewById(R.id.img6);
        img6.setOnClickListener(this);
        img7 = (ImageView) findViewById(R.id.img7);
        img7.setOnClickListener(this);
        img8 = (ImageView) findViewById(R.id.img8);
        img8.setOnClickListener(this);
        img9 = (ImageView) findViewById(R.id.img9);
        img9.setOnClickListener(this);

        ex = (ImageView) findViewById(R.id.exit);
        ex.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num;


        int randomNumber = random.nextInt(10);
        if (count1 == 10) {
            Intent intent = new Intent(this, Winner.class);
            startActivity(intent);
        }
        if (count2 == 70) {
            Intent intent = new Intent(this, Loser.class);
            startActivity(intent);
        }


        switch (v.getId()) {
            case R.id.img1:
                num = 1;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv = (ImageView) img1;
                    tv.setImageResource(R.drawable.pizza);
                    lastview = img1;
                    count1++;
                    countpizza.setText(count1 + "/10");

                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img2:
                num = 2;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv = (ImageView) img2;
                    tv.setImageResource(R.drawable.pizza);
                    lastview = img2;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img3:
                num = 3;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv2 = (ImageView) img3;
                    tv2.setImageResource(R.drawable.pizza);
                    lastview = img3;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img4:
                num = 4;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv3 = (ImageView) img4;
                    tv3.setImageResource(R.drawable.pizza);
                    lastview = img4;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img5:
                num = 5;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv4 = (ImageView) img5;
                    tv4.setImageResource(R.drawable.pizza);
                    lastview = img5;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img6:
                num = 6;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv5 = (ImageView) img6;
                    tv5.setImageResource(R.drawable.pizza);
                    lastview = img6;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img7:
                num = 7;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv6 = (ImageView) img7;
                    tv6.setImageResource(R.drawable.pizza);
                    lastview = img7;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img8:
                num = 8;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv7 = (ImageView) img8;
                    tv7.setImageResource(R.drawable.pizza);
                    lastview = img8;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.img9:
                num = 9;
                if (num == randomNumber) {
                    if (lastview != null) {
                        ((ImageView) lastview).setImageResource(R.drawable.food);
                    }
                    ImageView tv9 = (ImageView) img9;
                    tv9.setImageResource(R.drawable.pizza);
                    lastview = img9;
                    count1++;
                    countpizza.setText(count1 + "/10");
                } else if (num != randomNumber) {
                    count2++;
                    countempty.setText(count2 + "/70");
                }
                break;

            case R.id.exit:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;


        }

    }
}