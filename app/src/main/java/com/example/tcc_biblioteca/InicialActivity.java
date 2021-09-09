package com.example.tcc_biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        AppCompatImageView btnDidatico = findViewById(R.id.btn_didatico_inicial);
        btnDidatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), DidaticoActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btNDidatico = findViewById(R.id.btn_naodidatico_inicial);
        btNDidatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), NaoDidaticoActivity.class);
                startActivity(it);
            }
        });
    }
}