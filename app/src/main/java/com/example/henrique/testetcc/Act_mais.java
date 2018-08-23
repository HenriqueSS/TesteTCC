package com.example.henrique.testetcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Act_mais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_mais);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }

    public void rendas(View view){
        Intent it = new Intent(Act_mais.this, Act_rendas.class);
        startActivity(it);
    }

    public void despesas(View view){
        Intent it = new Intent(Act_mais.this, Act_despesas.class);
        startActivity(it);
    }

    public void orcamento(View view){
        Intent it = new Intent(Act_mais.this, Act_Orcamento.class);
        startActivity(it);
    }

    public void relatorio(View view){
        Intent it = new Intent(Act_mais.this, Act_relatorio.class);
        startActivity(it);
    }




}
