package com.example.tcc_biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

public class NaoDidaticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nao_didatico);

        AppCompatImageView btn_fantasia = findViewById(R.id.btn_fantasia_nao_didatico);
        btn_fantasia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), FantasiaActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_hq = findViewById(R.id.btn_hq_nao_didatico);
        btn_hq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), HQActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_romance = findViewById(R.id.btn_romance_nao_didatico);
        btn_romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), RomanceActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_comedia = findViewById(R.id.btn_comedia_nao_didatico);
        btn_comedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), ComediaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_contos = findViewById(R.id.btn_conto_nao_didatico);
        btn_contos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), ContosActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_poesia = findViewById(R.id.btn_poesia_nao_didatico);
        btn_poesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), PoesiaActivity.class);
                startActivity(it);
            }
        });
        AppCompatImageView btn_cronicas = findViewById(R.id.btn_cronicas_nao_didatico);
        btn_cronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), CronicasActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_sci_fi = findViewById(R.id.btn_fic_cientifica_nao_didatico);
        btn_sci_fi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), SciFiActivity.class);
                startActivity(it);
            }
        });

        AppCompatImageView btn_outros_nd = findViewById(R.id.btn_outros_nao_didatico);
        btn_outros_nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), OutrosNDActivity.class);
                startActivity(it);
            }
        });
    }
}