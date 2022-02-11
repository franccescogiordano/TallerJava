package co.sofka.java;

public class Persona {

private String nombre="";
private int edad=0;
private int dni;
private char genero=' '; //M O F
private int peso=0;
private double alturacm=0;


    public Persona() {
        this.dni=this.generaDNI();
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = comprobarSexo(genero);
        this.dni=this.generaDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAlturacm() {
        return alturacm;
    }

    public void setAlturacm(double alturacm) {
        this.alturacm = alturacm;
    }

    public Persona(String nombre, int edad, char genero, int peso, double alturacm) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.genero = comprobarSexo(genero);
        this.peso = peso;
        this.alturacm = alturacm;
    }

    public String toString(){
        String todo="";
       String nombre= this.getNombre();
        int edad=this.getEdad();
        int dni=this.dni;
       char genero =this.getGenero();
        int peso = this.getPeso();
        double alturacm= this.getAlturacm();
        return   todo.concat(nombre+" Edad:"+String.valueOf(edad)+
                " años \n Dni "+String.valueOf(dni)+"" +
                " \n Genero"+genero+"" +
                "\n Peso "+String.valueOf(peso)+"kg " +
                "\n Altura"+alturacm+"m");


    }
    private int generaDNI(){
        double dni = 10000000 + Math.random() * 90000000;
        return (int) dni;
    }

    private char comprobarSexo(char sexo){
        if(sexo=='H' || sexo=='M'){
            if(sexo=='M')
                return  'M';
            else  return  'H';
        }else{
           return 'H';

        }
    }
}
