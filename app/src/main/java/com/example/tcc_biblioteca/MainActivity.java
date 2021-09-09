package com.example.tcc_biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //vincular o obj. visual com o java
        AppCompatButton bntLogar = findViewById(R.id.btn_entrar_login);
        bntLogar.setOnClickListener(new View.OnClickListener()
        //Executa o click listener
        {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getBaseContext(), InicialActivity.class);
                startActivity(it);
            }
        });
    }
}