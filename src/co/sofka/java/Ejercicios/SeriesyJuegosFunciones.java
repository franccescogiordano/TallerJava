package co.sofka.java.Ejercicios;

import co.sofka.java.Series.Series;
import co.sofka.java.Series.Videojuego;

public class SeriesyJuegosFunciones {
    public int contarEntregasJuegos(Videojuego juegos[]) {
        int total = 0;
        for (Videojuego juego : juegos) {
            if (juego.isEntregado()) {
                total++;
                System.out.println(juego.getTitulo() + " Juego Entregado");
            }
        }
        return total;
    }

    public int contarEntregasSeries(Series series[]) {
        int total = 0;
        for (Series serie : series) {
            if (serie.isEntregado()) {
                total++;
                System.out.println(serie.getTitulo() + " Serie Entregada");
            }
        }
        return total;
    }

    public void videojuegoConMasHoras(Videojuego juegos[]) {
        Videojuego juegomayor = new Videojuego();
        juegomayor.setHorasestimadas(0);
        for (Videojuego juego : juegos) {
            juegomayor = (Videojuego) juegomayor.compareTo(juego);
        }
        System.out.println("el juego mas largo es " + juegomayor.toString());
    }

    public void serieMasLarga(Series series[]) {
        Series serielarga = new Series();
        serielarga.setNumero_de_temporadas(0);
        for (Series serie : series) {
            serielarga = (Series) serielarga.compareTo(serie);
        }
        System.out.println("la serie mas larga es " + serielarga.toString());
    }
}
