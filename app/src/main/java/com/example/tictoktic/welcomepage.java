package com.example.tictoktic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class welcomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcomepage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent ihome=new Intent(welcomepage.this, MainActivity.class);
                startActivity(ihome);
                finish();
            }
        },4000);




    }
}