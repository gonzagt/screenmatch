import com.screenmatch.calcs.CalculadoraDeTiempo;
import com.screenmatch.calcs.FiltroRecomendacion;
import com.screenmatch.models.Episodio;
import com.screenmatch.models.Pelicula;
import com.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula();
        Pelicula otraPeli = new Pelicula();
        Serie houseDragon = new Serie();

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

        houseDragon.setNombre("House of the Dragon");
        houseDragon.setTemporadas(2);
        houseDragon.setEpisodiosPorTemporada(10);
        houseDragon.setMinutosPorEpisodio(50);
        houseDragon.setFechaDeLanzamiento(2021);

        miPeli.fichaTecnica();
        String resultado1 = String.format("La puntuación media, basada en %d evaluaciones, es de %.2f", miPeli_eval,miPeli_media);
        System.out.println(resultado1);

        otraPeli.fichaTecnica();
        String resultado2 = String.format("La puntuación media, basada en %d evaluaciones, es de %.2f", otraPeli_eval,otraPeli_media);
        System.out.println(resultado2);

        houseDragon.fichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPeli);
        calculadora.incluye(otraPeli);
//      calculadora.incluye(houseDragon);

//        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPeli);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(houseDragon);
        episodio.setTotalVisualizaciones(100);
        filtroRecomendacion.filtra(episodio);
    }
}
