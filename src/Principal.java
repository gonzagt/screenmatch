import com.screenmatch.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        Pelicula otraPeli = new Pelicula();

        miPeli.setNombre("300");
        miPeli.setFechaDeLanzamiento(2010);
        miPeli.setDuracionEnMinutos(120);
        miPeli.setIncluidoEnElPlan(true);
        miPeli.evalua(8.9);
        miPeli.evalua(9);
        miPeli.evalua(8.7);
        int miPeli_eval = miPeli.getCantidadEvaluaciones();
        double miPeli_media = miPeli.calculaMedia();

        otraPeli.setNombre("El Señor de los Anillos");
        otraPeli.setFechaDeLanzamiento(2003);
        otraPeli.setDuracionEnMinutos(180);
        otraPeli.setIncluidoEnElPlan(true);
        otraPeli.evalua(8.1);
        otraPeli.evalua(9);
        otraPeli.evalua(6.7);
        int otraPeli_eval = otraPeli.getCantidadEvaluaciones();
        double otraPeli_media = otraPeli.calculaMedia();

        miPeli.fichaTecnica();
        String resultado1 = String.format("La puntuación media, basada en %d evaluaciones, es de %.2f", miPeli_eval,miPeli_media);
        System.out.println(resultado1);

        otraPeli.fichaTecnica();
        String resultado2 = String.format("La puntuación media, basada en %d evaluaciones, es de %.2f", otraPeli_eval,otraPeli_media);

        System.out.println(resultado2);
    }
}
