package com.example.aplicacionseriespeliculas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

    public class AdaptadorSeries extends RecyclerView.Adapter<com.example.aplicacionseriespeliculas.AdaptadorSeries.ViewHolderSeries> {
        //crear lista, crear constructor e implementar metodos
        ArrayList<SeriesVO> listaSeries;
        public AdaptadorSeries(ArrayList<SeriesVO> listaSeries) {
            this.listaSeries = listaSeries;
        }

        @NonNull
        @Override
        public com.example.aplicacionseriespeliculas.AdaptadorSeries.ViewHolderSeries onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_series,null,false);
            return new com.example.aplicacionseriespeliculas.AdaptadorSeries.ViewHolderSeries(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.aplicacionseriespeliculas.AdaptadorSeries.ViewHolderSeries holder, int position) {

            holder.itemTitulo2.setText(listaSeries.get(position).getTitulo2());
            holder.itemPuntaje2.setText(listaSeries.get(position).getPuntaje2());
            holder.itemGenero2.setText(listaSeries.get(position).getGenero2());
            holder.itemDirector2.setText(listaSeries.get(position).getDirector2());
            holder.itemDuracion2.setText(listaSeries.get(position).getDuracion2());
            holder.itemYear2.setText(listaSeries.get(position).getYear2());
            holder.itemSinopsis2.setText(listaSeries.get(position).getSinopsis2());
            holder.itemFoto2.setImageResource(listaSeries.get(position).getFoto2());

        }

        @Override
        public int getItemCount() {
            return listaSeries.size();
        }

        public class ViewHolderSeries extends RecyclerView.ViewHolder{
            //crear atributos
            TextView itemTitulo2,itemPuntaje2, itemGenero2, itemDirector2, itemDuracion2, itemYear2, itemSinopsis2;
            ImageView itemFoto2;

            public ViewHolderSeries(@NonNull View itemView) {
                super(itemView);
                //asignar los atributos
                itemTitulo2 = (TextView) itemView.findViewById(R.id.textTitulo2);
                itemPuntaje2 = (TextView) itemView.findViewById(R.id.textPuntaje2);
                itemGenero2 = (TextView) itemView.findViewById(R.id.textGenero2);
                itemDirector2 = (TextView) itemView.findViewById(R.id.textDirector2);
                itemDuracion2 = (TextView) itemView.findViewById(R.id.textDuracion2);
                itemYear2 = (TextView) itemView.findViewById(R.id.textYear2);
                itemSinopsis2 = (TextView) itemView.findViewById(R.id.textSinopsis2);
                itemFoto2 = (ImageView) itemView.findViewById(R.id.imageView2);
            }
        }
    }

