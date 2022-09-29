package com.example.aplicacionseriespeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnContinuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //capturar el botón del XML
        btnContinuar=findViewById(R.id.buttonContinuar);

    }

    @Override
    public void onClick(View view) {

        Toast.makeText(getApplicationContext(), "Cambiando de actividad", Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this,OpcionActivity.class);
        startActivity(i);

    }

}
