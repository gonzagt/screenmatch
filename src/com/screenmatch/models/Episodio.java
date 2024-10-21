package com.screenmatch.models;

import com.screenmatch.calcs.Clasificable;

public class Episodio implements Clasificable {
    private int numero;
    private String nombre;
    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    private Serie serie;

    @Override
    public int getClasificable() {
        if (totalVisualizaciones > 100) {
            return 4;
        } else {
            return 3;
        }
    }
}
