package co.sofka.java;

import co.sofka.java.Ejercicios.ClasesEjs;
import co.sofka.java.Ejercicios.Matematicos;
import co.sofka.java.Ejercicios.Ortografia;
import co.sofka.java.Ejercicios.Selecciones;
import co.sofka.java.Menus.Menues;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Menues menu = new Menues();
        Ortografia ortografia = new Ortografia();
        Matematicos math = new Matematicos();
        ClasesEjs clasesejercicios=new ClasesEjs();
        Selecciones selecs= new Selecciones();
        String seguir;
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("----Ingresar el ejercicio-----: ");
            menu.menu();
            System.out.println("Para salir digite 0");
            System.out.print("Digite...:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    math.ejercicio1(2, 3);
                    break;
                case 2:
                    math.ejer2(sc);
                    break;
                case 3:
                    math.ejer3(sc);
                    break;
                case 4:
                    math.ejer4(sc);
                    break;
                case 5:
                    math.ejer5();
                    break;
                case 6:
                    math.ejer6();
                    break;
                case 7:
                    math.ejer7();
                    break;
                case 8:
                    selecs.ejer8();
                    break;
                case 9:
                    ortografia.ejer9();
                    break;
                case 10:
                    ortografia.ejer10();
                    break;
                case 11:
                    ortografia.ejer11();
                    break;
                case 12:
                    ortografia.ejer12();
                    break;
                case 13:
                    math.ejer13();
                    break;
                case 14:
                    math.ejer14();
                    break;
                case 15:
                    selecs.ejer15();
                    break;
                case 16:
                    clasesejercicios.ejer16();
                    break;
                case 17:
                    clasesejercicios.ejer17();
                    break;
                case 18:
                    clasesejercicios.ejer18();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }








}