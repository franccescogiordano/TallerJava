package co.sofka.java;

public class Lavadora extends Electrodomesticos{
    private final int carga;

    public Lavadora() {
        this.carga=5;
    }

    public Lavadora(int precio_base, int peso) {
        super(precio_base, peso);
        this.carga = 5;

    }

    public Lavadora(int precio_base, String color, char consumo_energetico, int peso, int carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }


    public void precioFinal(){
        super.preciofinal();
        int preciofinal=this.getPrecio_base();
        if(this.carga>30){
            preciofinal+=50;
            this.setPrecio(preciofinal);
        }
    }

}
