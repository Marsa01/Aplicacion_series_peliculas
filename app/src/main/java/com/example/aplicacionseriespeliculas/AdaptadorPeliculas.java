package com.example.aplicacionseriespeliculas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorPeliculas extends RecyclerView.Adapter<AdaptadorPeliculas.ViewHolderPeliculas> {
    //crear lista, crear constructor e implementar metodos
    ArrayList<PeliculasVO> listaPeliculas;
    public AdaptadorPeliculas(ArrayList<PeliculasVO> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    @NonNull
    @Override
    public AdaptadorPeliculas.ViewHolderPeliculas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_peliculas,null,false);
        return new ViewHolderPeliculas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPeliculas.ViewHolderPeliculas holder, int position) {

        holder.itemTitulo.setText(listaPeliculas.get(position).getTitulo());
        holder.itemPuntaje.setText(listaPeliculas.get(position).getPuntaje());
        holder.itemGenero.setText(listaPeliculas.get(position).getGenero());
        holder.itemDirector.setText(listaPeliculas.get(position).getDirector());
        holder.itemDuracion.setText(listaPeliculas.get(position).getDuracion());
        holder.itemYear.setText(listaPeliculas.get(position).getYear());
        holder.itemSinopsis.setText(listaPeliculas.get(position).getSinopsis());
        holder.itemFoto.setImageResource(listaPeliculas.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public class ViewHolderPeliculas extends RecyclerView.ViewHolder{
        //crear atributos
        TextView itemTitulo,itemPuntaje, itemGenero, itemDirector, itemDuracion, itemYear, itemSinopsis;
        ImageView itemFoto;

        public ViewHolderPeliculas(@NonNull View itemView) {
            super(itemView);
            //asignar los atributos
            itemTitulo= (TextView)  itemView.findViewById(R.id.textTitulo);
            itemPuntaje = (TextView)  itemView.findViewById(R.id.textPuntaje);
            itemGenero = (TextView)  itemView.findViewById(R.id.textGenero);
            itemDirector = (TextView)  itemView.findViewById(R.id.textDirector);
            itemDuracion = (TextView)  itemView.findViewById(R.id.textDuracion);
            itemYear = (TextView)  itemView.findViewById(R.id.textYear);
            itemSinopsis = (TextView)  itemView.findViewById(R.id.textSinopsis);
            itemFoto = (ImageView) itemView.findViewById(R.id.imageView);


        }
    }
}
