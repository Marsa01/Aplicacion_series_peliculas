package com.example.aplicacionseriespeliculas;

public class SeriesVO {
    private String titulo2;
    private String puntaje2;
    private String genero2;
    private String director2;
    private String duracion2;
    private String year2;
    private String sinopsis2;
    private int foto2;


    public SeriesVO() {
    }

    public SeriesVO(String titulo2, String puntaje2, String genero2, String director2, String duracion2, String year2, String sinopsis2, int foto2) {
        this.titulo2 = titulo2;
        this.puntaje2 = puntaje2;
        this.genero2 = genero2;
        this.director2 = director2;
        this.duracion2 = duracion2;
        this.year2 = year2;
        this.sinopsis2 = sinopsis2;
        this.foto2 = foto2;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public String getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(String puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public String getDirector2() {
        return director2;
    }

    public void setDirector2(String director2) {
        this.director2 = director2;
    }

    public String getDuracion2() {
        return duracion2;
    }

    public void setDuracion2(String duracion2) {
        this.duracion2 = duracion2;
    }

    public String getYear2() {
        return year2;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getSinopsis2() {
        return sinopsis2;
    }

    public void setSinopsis2(String sinopsis2) {
        this.sinopsis2 = sinopsis2;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {this.foto2 = foto2;}
}
