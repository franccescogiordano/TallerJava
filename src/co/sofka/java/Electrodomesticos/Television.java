package co.sofka.java;

public class Television  extends  Electrodomesticos{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion=20;
        this.sintonizadorTDT=false;
    }

    public Television(int precio_base, int peso) {
        super(precio_base, peso);
        this.resolucion=20;
        this.sintonizadorTDT=false;
    }

    public Television(int precio_base, String color, char consumo_energetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void precioFinal(){
        super.preciofinal();
        int preciofinal=this.getPrecio_base();
        if(this.resolucion>40){
            preciofinal+=(30*preciofinal)/100;
        }
        if (sintonizadorTDT){
            preciofinal+=50;
        }
        this.setPrecio(preciofinal);
    }
}
