package co.sofka.java.Controladores;

import co.sofka.java.Persona;

public class ControladorPersona {
    public int calcularIMC(Persona persona){
        int peso= persona.getPeso();
        double altura=persona.getAlturacm();
        //(peso en kg/(altura^2  en m)),
        double resultado;
        resultado = peso/ (altura*altura);
        //20 25
        if(resultado<20){
            return -1;
        }else if(resultado >=20 && resultado<=25){
            return 0;
        }else if(resultado>25){
            return 1;
        }
        return 2;
    }
    public boolean esMayorDeEdad(Persona persona){
        if(persona.getEdad()>=18)
            return true;
        else return false;
    }


    public  void comprobarPesoYEdad(Persona persona){
        if (calcularIMC(persona)==1)//1 sobre peso 0 normal -1 flaco
            System.out.println(persona.getNombre()+" tiene sobre peso");
        else if(calcularIMC(persona)==0)
            System.out.println(persona.getNombre()+" tiene peso normal");
        else if(calcularIMC(persona)==-1)
            System.out.println(persona.getNombre()+" el peso esta por debajo de lo saludable");
        if(esMayorDeEdad(persona))
            System.out.println(persona.getNombre()+" es mayor de edad");
        else  System.out.println(persona.getNombre()+" es menor de edad");
    }

}
