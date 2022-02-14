package co.sofka.java.Ejercicios;

import java.util.Scanner;

public class Ortografia {

    public void ejer9() {
        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        System.out.println(texto);
        String remplazado = texto.replace("a", "e");
        System.out.print("Ingrese una frase para concatenar: ");
        Scanner sc = new Scanner(System.in);
        String textoparaanidar = sc.nextLine();
        System.out.println("Frase final " + remplazado.concat(textoparaanidar));
    }

    public void ejer10() {
        String texto, sinespacios;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un texto");
        texto = sc.nextLine();
        sinespacios = texto.replace(" ", "");
        System.out.println("el texto sin espacios es: " + sinespacios);
    }

    public void ejer11() {
        String texto, sinespacios;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una frase");
        texto = sc.nextLine();
        int largo = texto.length();
        int cantidadVocales = 0;
        for (int x = 0; x < texto.length(); x++) {
            if ((texto.charAt(x) == 'a') || (texto.charAt(x) == 'e') || (texto.charAt(x) == 'i') || (texto.charAt(x) == 'o') || (texto.charAt(x) == 'u')) {
                cantidadVocales++;
            }
        }
        System.out.println("La frase contiene: " + cantidadVocales + " vocales" + " y el largo de la frase es: " + largo);
    }

    public void ejer12() {
        String texto1, texto2;
        Scanner sc = new Scanner(System.in);
        int largoCadena1 = 0;
        int largoCadena2 = 0;
        System.out.println("Porfavor ingrese dos frases, para ver si son iguales o sus diferencias");
        System.out.print("texto 1:");
        texto1 = sc.nextLine();
        System.out.print("texto 2:");
        texto2 = sc.nextLine();
        largoCadena1 = texto1.length();
        largoCadena2 = texto2.length();

        if (largoCadena1 != largoCadena2) {
            System.out.println("las cadenas son distintas, veamos sus diferencias");
            if (largoCadena1 < largoCadena2) {
                int i;
                for (i = 0; i < largoCadena1; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
                System.out.println("el contenido del string 1 termino en la posicion " + largoCadena1);
                System.out.println("por lo que no son iguales");

            } else if (largoCadena1 > largoCadena2) {
                int i;
                for (i = 0; i < largoCadena2; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
                System.out.println("el contenido del string 2 termino en la posicion " + largoCadena2);
                System.out.println("por lo que no son iguales");
            }

        } else {
            boolean soniguales = true;
            for (int i = 0; i < largoCadena1; i++) {
                if (texto1.charAt(i) != texto2.charAt(i)) {
                    soniguales = false;
                }
            }
            if (soniguales) {
                System.out.println("son iguales las frases ingresadas");
            } else {
                System.out.println("son distintas las frases ingresadas:");
                int i;
                for (i = 0; i < largoCadena2; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
            }
        }
    }
}
