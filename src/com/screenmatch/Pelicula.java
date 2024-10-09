package com.screenmatch;

public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private int cantidadEvaluaciones;
    private double sumaDeEvaluaciones;

    int getCantidadEvaluaciones(){
        return cantidadEvaluaciones;
    }

    public void fichaTecnica() {
        System.out.printf("""
                La película "%s", fue estrenada en %d y tiene una duración de %d minutos.
                """,nombre,fechaDeLanzamiento,duracionEnMinutos);
    }

    public void evalua(double nota){
        sumaDeEvaluaciones+=nota;
        cantidadEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones/cantidadEvaluaciones;
    }
}
