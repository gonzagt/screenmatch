package com.screenmatch.calcs;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable) {
        if (clasificable.getClasificable() >= 4) {
            System.out.println("Muy popular en el momento.");
        } else if (clasificable.getClasificable() >=2) {
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("Colocalo en tu lista para verlo después.");
        }
    };
}
