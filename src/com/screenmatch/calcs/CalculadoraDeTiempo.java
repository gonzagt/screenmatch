package com.screenmatch.calcs;

import com.screenmatch.models.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal = 0;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public void incluye (Titulo titulo) {
        this.tiempoTotal+=titulo.getDuracionEnMinutos();
    }
}
