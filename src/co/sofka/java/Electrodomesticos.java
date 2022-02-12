package co.sofka.java;


import org.w3c.dom.ranges.Range;

import java.awt.font.NumericShaper;
import java.time.temporal.ValueRange;
import java.util.*;

import static java.util.Map.entry;


public class Electrodomesticos {
    private final String colorblanco = "blanco";
    private int precio_base;
    private String color;
    private char consumo_energetico;
    private int peso;

//Por defecto, el color será blanco,
// el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg.
// Usa constantes para ello.
// Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.


    public Electrodomesticos() {
        this.precio_base = 100;
        this.color = colorblanco;
        this.peso = 5;
        this.consumo_energetico = 'F';
    }

    public Electrodomesticos(int precio_base, int peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomesticos(int precio_base, String color, char consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
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

    public void setPrecio(int precio) {
        this.precio_base = precio;
    }

    private char comprobarConsumoEnergetico(char letra) {
        final List<Character> letras = List.of('A', 'B', 'C', 'D', 'E', 'F');
        return letras.contains(letra) ? letra : 'F'; //ternario
    }

    private String comprobarColor(String color) {
        final List<String> colores = List.of(colorblanco, "negro", "rojo", "azul", "gris");
        return colores.contains(color) ? color : colorblanco; //ternario
    }

    public void preciofinal() {
        char consumo = this.consumo_energetico;
        int preciofinal = 0;
        int p = this.peso;
        int preciobase = this.precio_base;
        final Map<Character, Integer> mapa = Map.ofEntries(
                entry('A', 100),
                entry('B', 80),
                entry('C', 60), entry('D', 50),
                entry('E', 30), entry('F', 10));
        preciofinal = preciobase + mapa.get(consumo);
        if (ValueRange.of(0, 19).isValidIntValue(p)) {
            preciofinal += 10;
        } else if (ValueRange.of(20, 49).isValidIntValue(p)) {
            preciofinal += 50;
        } else if (ValueRange.of(50, 79).isValidIntValue(p)) {
            preciofinal += 80;
        } else {
            preciofinal += 100;
        }
        this.precio_base = preciofinal;
    }
}