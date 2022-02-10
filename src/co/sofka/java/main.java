package co.sofka.java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String seguir;
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Ingresar ejercicio: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1(2, 3);
                    break;
                case 2:
                    ejer2(sc);
                    break;
                case 3:
                    ejer3(sc);
                    break;
                case 4:
                    ejer4(sc);
                    break;
                case 5:
                    ejer5();
                    break;
                case 6:
                    ejer6();
                    break;
                default:
                    opcion = 1;
            }
        } while (opcion != 0);
    }

    public static void ejercicio1(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println("el " + valor1 + " es mayor que " + valor2);
        } else if (valor1 < valor2) {
            System.out.println("el " + valor2 + " es mayor que " + valor1);
        } else if (valor1 == valor2) {
            System.out.println("el " + valor1 + " y " + valor2 + " son iguales");
        }


    }

    public static void ejer2(Scanner sc) {
        System.out.println("ingrese valor 1: ");
        int valor1 = sc.nextInt();
        System.out.println("ingrese valor 2: ");
        int valor2 = sc.nextInt();
        ejercicio1(valor1, valor2);
    }

    public static void ejer3(Scanner sc) {
        System.out.println("ingrese el Radio de un circulo: ");
        double valor = sc.nextDouble();
        double areaDelCirculo = Math.PI * Math.pow(valor, 2);
        System.out.println("El area del circulo es:" + areaDelCirculo + " cm cuadrados");
    }

    public static void ejer4(Scanner sc) {
        System.out.println("ingrese el precio de un producto: ");
        final float IVA = 21;
        float precio = sc.nextFloat();
        float preciofinal = ((21 * precio) / 100) + precio;
        System.out.println("El precio final del producto es $" + preciofinal);
    }

    public static void ejer5() {
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

    public static void ejer6() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }

        }
    }

}