package co.sofka.java;

import java.util.Locale;

public class Electrodomesticos {
    private int precio_base;
    private String color;
    private char consumo_energetico;
    private int peso;

//Por defecto, el color será blanco,
// el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
// Usa constantes para ello.

    //Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.


    public Electrodomesticos() {
        this.precio_base = 100;
        this.color = "blanco";
        this.peso = 5;
        this.consumo_energetico = 'F';
    }

    public Electrodomesticos(int precio_base, int peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomesticos(int precio_base, String color, char consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char Letras[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < Letras.length; i++) {
            if (Letras[i] == letra)
                return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < colores.length; i++) {
            if (colores.equals(color.toLowerCase(Locale.ROOT)))
                return color;
        }
        return "blanco";
    }

    public void preciofinal() {
        char consumo = this.consumo_energetico;
        int preciofinal = 0;
        int p = this.peso;
        int preciobase = this.precio_base;
        switch (consumo) {
            case 'A':
                preciofinal = preciobase + 100;
                break;
            case 'B':
                preciofinal = preciobase + 80;
                break;
            case 'C':
                preciofinal = preciobase + 60;
                break;
            case 'D':
                preciofinal = preciobase + 50;
                break;
            case 'E':
                preciofinal = preciobase + 30;
                break;
            case 'F':
                preciofinal = preciobase + 10;
                break;
        }

        if (p >= 0 && p <= 19) ;
        preciofinal += 10;
        if (p >= 20 && p <= 49) ;
        preciofinal += 50;
        if (p >= 50 && p <= 79) ;
        preciofinal += 80;
        if (p >= 80) ;
        preciofinal += 100;

        this.precio_base = preciofinal;
    }
}