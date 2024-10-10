package com.screenmatch;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private int cantidadEvaluaciones;
    private double sumaDeEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setCantidadEvaluaciones(int cantidadEvaluaciones) {
        this.cantidadEvaluaciones = cantidadEvaluaciones;
    }

    public void setSumaDeEvaluaciones(double sumaDeEvaluaciones) {
        this.sumaDeEvaluaciones = sumaDeEvaluaciones;
    }

    public int getCantidadEvaluaciones(){
        return cantidadEvaluaciones;
    }

    public int getDuracionEnMinutos(){
        return duracionEnMinutos;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public double getSumaDeEvaluaciones() {
        return sumaDeEvaluaciones;
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
