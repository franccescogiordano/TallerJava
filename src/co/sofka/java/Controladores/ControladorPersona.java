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
}
