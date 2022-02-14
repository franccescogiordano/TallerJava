package co.sofka.java.Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Matematicos {
    public void ejercicio1(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println("el " + valor1 + " es mayor que " + valor2);
        } else if (valor1 < valor2) {
            System.out.println("el " + valor2 + " es mayor que " + valor1);
        } else {
            System.out.println("el " + valor1 + " y " + valor2 + " son iguales");
        }

    }
    public void ejer13() {
        Date fecha = Calendar.getInstance().getTime();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("fecha actual: " + dateformat.format(fecha));
    }

    public void ejer2(Scanner sc) {
        System.out.println("ingrese valor 1: ");
        int valor1 = sc.nextInt();
        System.out.println("ingrese valor 2: ");
        int valor2 = sc.nextInt();
        ejercicio1(valor1, valor2);
    }

    public void ejer3(Scanner sc) {
        System.out.println("ingrese el Radio de un circulo: ");
        double valor = sc.nextDouble();
        double areaDelCirculo = Math.PI * Math.pow(valor, 2);
        System.out.println("El area del circulo es:" + areaDelCirculo + " cm cuadrados");
    }

    public void ejer4(Scanner sc) {
        System.out.println("ingrese el precio de un producto: ");
        final float IVA = 21;
        float precio = sc.nextFloat();
        float preciofinal = ((21 * precio) / 100) + precio;
        System.out.println("El precio final del producto es $" + preciofinal);
    }

    public void ejer5() {
        int valor = 1;
        while (valor < 101) {
            if (valor % 2 == 0) {
                System.out.println(valor + " es par");
            } else {
                System.out.println(valor + " es impar");
            }
            valor++;
        }

    }

    public void ejer6() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }

        }
    }

    public void ejer7() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        do {
            System.out.println("Porfavor, ingrese un numero mayor o igual a 0");
            numero = sc.nextInt();
        } while (numero < 0);
        System.out.println("numero ingresado: " + numero);
    }
    public void ejer14() {
        Scanner sc = new Scanner(System.in);
        int numeroingresado;
        System.out.println("ingrese un numero para contar hasta el 1000:");
        numeroingresado = sc.nextInt();
        for (int i = numeroingresado; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }
}
