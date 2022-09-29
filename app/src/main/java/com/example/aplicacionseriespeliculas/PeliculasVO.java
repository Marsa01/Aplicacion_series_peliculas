package com.example.aplicacionseriespeliculas;

public class PeliculasVO {

    private String titulo;
    private String puntaje;
    private String genero;
    private String director;
    private String duracion;
    private String year;
    private String sinopsis;
    private int foto;


    public PeliculasVO() {
    }

    public PeliculasVO(String titulo, String puntaje, String genero, String director, String duracion, String year, String sinopsis, int foto) {
        this.titulo = titulo;
        this.puntaje = puntaje;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.year = year;
        this.sinopsis = sinopsis;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {this.foto = foto;}
}
