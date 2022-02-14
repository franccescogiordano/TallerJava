package co.sofka.java.Ejercicios;

import co.sofka.java.Controladores.ControladorPersona;
import co.sofka.java.Electrodomesticos.Electrodomesticos;
import co.sofka.java.Electrodomesticos.Lavadora;
import co.sofka.java.Electrodomesticos.Television;
import co.sofka.java.Persona;
import co.sofka.java.Series.Series;
import co.sofka.java.Series.Videojuego;

import java.util.Scanner;

public class ClasesEjs {
    SeriesyJuegosFunciones seriesYJuegosFunciones= new SeriesyJuegosFunciones();
    public void ejer16() {
        ControladorPersona ctrlPer = new ControladorPersona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sexo: M o H");
        char generochar = sc.next().charAt(0);
        System.out.println("Ingrese edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el peso");
        int peso = sc.nextInt();
        System.out.println("Ingrese altura en metros");
        double altura = sc.nextDouble();
        Persona persona = new Persona(nombre, edad, generochar, peso, altura);
        Persona persona2 = new Persona(nombre, edad, generochar);
        Persona persona3 = new Persona();
        persona3.setNombre("Antonio Banderas");
        persona3.setEdad(94);
        persona3.setAlturacm(4.98);
        persona3.setPeso(400);
        persona3.setGenero('H');

        ctrlPer.comprobarPesoYEdad(persona);
        ctrlPer.comprobarPesoYEdad(persona2);
        ctrlPer.comprobarPesoYEdad(persona3);

        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public void ejer17() {
        //int precio_base, String color, char consumo_energetico, int peso, int carga
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
        electrodomesticos[0] = new Lavadora(100, "azul", 'A', 19, 5000);
        electrodomesticos[1] = new Lavadora(100, "blanco", 'F', 2000, 5000);
        electrodomesticos[2] = new Lavadora(100, "GRIS", 'C', 2000, 5000);
        electrodomesticos[3] = new Lavadora(100, "ROJO", 'E', 2000, 5000);
        electrodomesticos[4] = new Electrodomesticos(10000, "rojo", 'F', 2000);
        electrodomesticos[5] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[6] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[7] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[8] = new Television(100, "rojo", 'B', 2000, 5000, true);
        electrodomesticos[9] = new Television(100, "morado", 'B', 2000, 5000, true);


        for (Electrodomesticos x : electrodomesticos) {
            x.preciofinal();
        }
        int preciotvs = 0;
        int preciolavas = 0;
        int preciototal = 0;
        for (Electrodomesticos x : electrodomesticos) {
            if (x instanceof Television) {
                preciotvs += x.getPrecio_base();
            } else if (x instanceof Lavadora) {
                preciolavas += x.getPrecio_base();
            }

            preciototal += x.getPrecio_base();

        }

        System.out.println("el precio de los televisores es $"
                + preciotvs
                + "\n el precio de los lavaropa es $"
                + preciolavas +
                "\n el precio total es$" + preciototal);

    }

    public void ejer18() {
        Series series[] = new Series[5];
        Videojuego juegos[] = new Videojuego[5];

        series[0] = new Series();
        series[1] = new Series();
        series[2] = new Series("Arrow", "DC");
        series[3] = new Series("Hawkeye", "Marvel");
        //String titulo, int numero_de_temporadas, String genero, String creador
        series[4] = new Series("Loki", 1, "Ciencia Ficcion", "Marvel");

        juegos[0] = new Videojuego("CS GO", 1000);
        juegos[1] = new Videojuego("Minecraft", 60);
        juegos[2] = new Videojuego();
        juegos[3] = new Videojuego();
        juegos[4] = new Videojuego("God Of War", 60000, "Accion", "Sony");

        juegos[2].entregar();
        juegos[3].entregar();
        series[4].entregar();
        series[0].entregar();
        System.out.println("Series entregadas:" + seriesYJuegosFunciones.contarEntregasSeries(series));
        System.out.println("Juegos entregados:" + seriesYJuegosFunciones.contarEntregasJuegos(juegos));
        seriesYJuegosFunciones.videojuegoConMasHoras(juegos);
        seriesYJuegosFunciones.serieMasLarga(series);

    }


}
