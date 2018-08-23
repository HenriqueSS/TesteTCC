package com.example.henrique.testetcc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Act_Orcamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__orcamento);
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

        ListView lista = (ListView) findViewById(R.id.lvOrcamento);

        ArrayList<String> despesas = preencher();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, despesas);
        lista.setAdapter(arrayAdapter);
    }

    private ArrayList<String> preencher() {
        ArrayList<String> dados = new ArrayList<>();
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");
        dados.add("Teste scroll");

        return dados;
    }

}
