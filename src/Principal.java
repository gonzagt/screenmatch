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

        otraPeli.setNombre("El Señor de los Anillos");
        otraPeli.setFechaDeLanzamiento(2003);
        otraPeli.setDuracionEnMinutos(180);
        otraPeli.setIncluidoEnElPlan(true);
        otraPeli.evalua(8.1);
        otraPeli.evalua(9);
        otraPeli.evalua(6.7);

        miPeli.fichaTecnica();
        System.out.println("La puntuación media de esta película es: "+miPeli.calculaMedia());

        otraPeli.fichaTecnica();
        System.out.println("La puntuación media de esta película es: "+otraPeli.calculaMedia());


    }
}
