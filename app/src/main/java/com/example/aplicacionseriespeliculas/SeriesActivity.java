package com.example.aplicacionseriespeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SeriesActivity extends AppCompatActivity {

    ArrayList<SeriesVO> listaSeries;
    RecyclerView recyclerViewSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        listaSeries=new ArrayList<>();
        recyclerViewSeries= findViewById(R.id.recyclerSeries);
        recyclerViewSeries.setLayoutManager(new LinearLayoutManager(this));

        llenarSeries();
        AdaptadorSeries adapter= new AdaptadorSeries(listaSeries);
        recyclerViewSeries.setAdapter(adapter);
    }

    private void llenarSeries() {
        listaSeries.add(new SeriesVO("The Walking Dead", "Puntaje: 8.1/10","Genero: Apocalipsis zombie, drama, suspenso", "Director: Gregory Nicotero, Mike Satrazemis, Ernest Dickerson", "Temporadas: 11", "Años: 2010 - 2022", "La historia de The Walking Dead nos traslada a un escenario post-pandémico en el que un virus ha acabado con la práctica totalidad de la población mundial convirtiéndolos en zombis. Seremos testigo de la lucha de un grupo de supervivientes por mantenerse a salvo en este entorno infestado de zombis.", R.drawable.the_waking_dead));
        listaSeries.add(new SeriesVO("Game of Thrones", "Puntaje: 9.2/10","Genero: Fantasía medieval, tragedia, drama", "Director: Alan Taylor, Alex Graves, Mark Mylod, Jeremy Podeswa", "Temporadas: 8", "Años: 2011 - 2019", "En un mundo fantástico y en un contexto medieval varias familias, se disputan el poder para dominar los Siete Reinos. Simultáneamente, más allá de los territorios de los Reinos limitados por un muro de hielo que es vigilado por la Guardia de la Noche otra amenaza se cierne sobre los siete reinos ante la llegada de criaturas sobrenaturales.", R.drawable.game_of_thrones));
        listaSeries.add(new SeriesVO("Friends", "Puntaje: 8.9/10","Genero: Comedia de situación", "Director: David Crane, Marta Kauffman", "Temporadas: 10", "Años: 1994 - 2004", "Monica, Rachel, Phoebe, Chandler, Ross y Joey son seis amigos treintañeros que viven en Nueva York. Juntos afrontan con humor las dificultades propias de su edad: líos amorosos, trabajo, familia y su propia convivencia.", R.drawable.friends));

    }
}