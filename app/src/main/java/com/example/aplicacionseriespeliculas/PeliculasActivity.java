package com.example.aplicacionseriespeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PeliculasActivity extends AppCompatActivity {

    ArrayList<PeliculasVO> listaPeliculas;
    RecyclerView recyclerViewPeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);

        listaPeliculas=new ArrayList<>();
        recyclerViewPeliculas= findViewById(R.id.recyclerPeliculas);
        recyclerViewPeliculas.setLayoutManager(new LinearLayoutManager(this));

        llenarPeliculas();
        AdaptadorPeliculas adapter= new AdaptadorPeliculas(listaPeliculas);
        recyclerViewPeliculas.setAdapter(adapter);
    }

    private void llenarPeliculas() {
        listaPeliculas.add(new PeliculasVO("Volver al Futuro", "Puntaje: 8.5/10","Genero: Ciencia ficcion, aventura", "Director: Robert Zemeckis", "Duracion: 1h 56m", "Publicado en: 1985", "Marty McFly es amigo de Doc, un científico que ha construido una máquina del tiempo. Cuando los dos prueban el artefacto, un error hace  que Marty llegue a 1955, año en el que sus padres todavia no se conocian. Marty deberá conseguir que se conozcan, o si no su existencia no sería posible.", R.drawable.volver_al_futuro));
        listaPeliculas.add(new PeliculasVO("2001: Odisea del Espacio", "Puntaje: 8.3/10","Genero: Ciencia ficcion, thriller, misterio", "Director: Stanley Kubrick", "Duracion: 2h 19m", "Publicado en: 1968", "Hace millones de años, unos primates descubren un monolito que los conduce a un estadio de inteligencia superior.  Millones de años despues, se encuentra un monolito en la luna que despierta el interés de los científicos, asi que la NASA realiza una mision en una nave espacial dirigida por una inteligencia artificial llamada HAL 9000", R.drawable.odisea_en_el_espacio));
        listaPeliculas.add(new PeliculasVO("Parasitos", "Puntaje: 8.5/10","Genero: Thriller, drama, comedia negra", "Director: Bong Joon-ho", "Duracion: 2h 12m", "Publicado en: 2019", "Tanto Gi Taek como su familia están sin trabajo. Cuando su hijo mayor, Gi Woo, empieza a impartir clases particulares en la adinerada casa de los Park, las dos familias, que tienen mucho en común pese a pertenecer a dos mundos totalmente distintos, entablan una relación de resultados imprevisibles.", R.drawable.parasitos));

    }

}