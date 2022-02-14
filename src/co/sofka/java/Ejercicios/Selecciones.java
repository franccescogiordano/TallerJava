package co.sofka.java.Ejercicios;

import java.util.Scanner;

public class Selecciones {
    public void ejer15() {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        String menu = ("****** GESTION CINEMATOGRÁFICA ********\n" +
                "   1-NUEVO ACTOR\n" +
                "   2-BUSCAR ACTOR\n" +
                "   3-ELIMINAR ACTOR\n" +
                "   4-MODIFICAR ACTOR\n" +
                "   5-VER TODOS LOS ACTORES\n" +
                "   6- VER PELICULAS DE LOS ACTORES\n" +
                "   7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "   8-SALIR");
        int opcion = 0;
        System.out.println(menu);
        do {

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Usted salio del menu");
                    seguir = false;
                    break;
                default:

                    System.out.println("OPCION INCORRECTO");
                    System.out.println(menu);
                    break;
            }
        } while (seguir);
    }
    public void ejer8() {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("ingrese un dia de la semana para saber si es laborable o no: Lunes, Martes,Miercoles,Jueves, Viernes, Sabado, Domingo");
        dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Es un dia laboral");
                break;
            case "Martes":
                System.out.println("Es un dia laboral");
                break;
            case "Miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "Jueves":
                System.out.println("Es un dia laboral");
                break;
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
                System.out.println("Es un dia no laboral");
                break;
            case "Domingo":
                System.out.println("Es un dia no laboral");
                break;
            default:
                System.out.println("Ingrese un dia de forma correcta.");
        }
    }
}
