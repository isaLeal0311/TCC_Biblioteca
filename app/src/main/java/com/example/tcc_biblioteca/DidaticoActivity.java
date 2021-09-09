package com.example.tcc_biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

public class DidaticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_didatico);
        AppCompatImageView btn_fisica = findViewById(R.id.btn_fisica_didatico);
        btn_fisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), FisicaActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_portugues = findViewById(R.id.btn_portugues_didatico);
        btn_portugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), PortuguesActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_geografia = findViewById(R.id.btn_geografia_didatico);
        btn_geografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), GeografiaActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_humanas = findViewById(R.id.btn_humanas_didatico);
        btn_humanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), HumanasActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_quimica = findViewById(R.id.btn_quimica_didatico);
        btn_quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), QuimicaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_biologia = findViewById(R.id.btn_biologia_didatico);
        btn_biologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), BiologiaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_historia = findViewById(R.id.btn_historia_didatico);
        btn_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), HistoriaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_mat = findViewById(R.id.btn_mat_didatico);
        btn_mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), MatematicaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_outros_didatico = findViewById(R.id.btn_outros_didatico);
        btn_outros_didatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), OutrosDActivity.class);
                startActivity(it);
            }
        });
    }
}