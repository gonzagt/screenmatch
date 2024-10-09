import com.screenmatch.Pelicula;

// push test

public class Principal {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        Pelicula otraPeli = new Pelicula();

        miPeli.nombre = "300";
        miPeli.fechaDeLanzamiento = 2010;
        miPeli.duracionEnMinutos = 120;
        miPeli.incluidoEnElPlan = true;
        miPeli.evalua(8.9);
        miPeli.evalua(9);
        miPeli.evalua(8.7);

        otraPeli.nombre = "El Señor de los Anillos";
        otraPeli.fechaDeLanzamiento = 2003;
        otraPeli.duracionEnMinutos = 180;
        otraPeli.incluidoEnElPlan = true;
        otraPeli.evalua(8.1);
        otraPeli.evalua(9);
        otraPeli.evalua(6.7);

        miPeli.fichaTecnica();
        System.out.println("La puntuación media de esta película es: "+miPeli.calculaMedia());

        otraPeli.fichaTecnica();
        System.out.println("La puntuación media de esta película es: "+otraPeli.calculaMedia());


    }
}
