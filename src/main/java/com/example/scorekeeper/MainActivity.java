package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView number1 = findViewById(R.id.value1);
    TextView number2 = findViewById(R.id.value2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton decrease1 = (ImageButton) findViewById(R.id.decreaseTeam1);
        ImageButton increase1 = (ImageButton) findViewById(R.id.increaseTeam1);
        ImageButton decrease2 = (ImageButton) findViewById(R.id.decreaseTeam2);
        ImageButton increase2 = (ImageButton) findViewById(R.id.increaseTeam2);

        decrease1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseScore(1);
            }
        });

        decrease2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseScore(2);
            }
        });

        increase1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseScore(1);
            }
        });

        increase2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseScore(2);
            }
        });
    }

    public void decreaseScore(int team){
        if(team==1){
            number1.setText(String.valueOf(Integer.parseInt((String)number1.getText()) - 1));
        }else if (team==2){
            number2.setText(String.valueOf(Integer.parseInt((String)number2.getText()) + 1));
        }
    }

    public void increaseScore(int team){
        if(team==1){
            number1.setText(String.valueOf(Integer.parseInt((String)number1.getText()) + 1));
        }else if (team==2){
            number2.setText(String.valueOf(Integer.parseInt((String)number2.getText()) + 1));
        }
    }
}