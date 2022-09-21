package com.example.aplicacionseriespeliculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OpcionActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion);

        //capturar el botón del XML
        btnPeliculas=findViewById(R.id.buttonPeliculas);
    }

    @Override
    public void onClick(View view) {

        Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG).show();
        Intent i = new Intent(OpcionActivity.this,PeliculasActivity.class);
        startActivity(i);
    }
    public void onClickSeries(View view) {

        Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG).show();
        Intent i = new Intent(OpcionActivity.this,SeriesActivity.class);
        startActivity(i);
    }
}