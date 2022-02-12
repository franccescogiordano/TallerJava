package co.sofka.java.Series;

public class Series implements Entregable{
    private String titulo;
    private int numero_de_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Series() {
        /*Por defecto, el número
        de temporadas es de 3 temporadas y entregado false.
        El resto de atributos serán valores
        por defecto según el tipo del atributo.*/
        this.numero_de_temporadas=3;
        this.entregado=false;
        this.titulo="Daredevil";
        this.genero="Ciencia Ficción";
        this.creador="Stan Lee";

    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero="Ciencia Ficción";
        this.entregado=false;
        this.numero_de_temporadas=3;
    }

    public Series(String titulo, int numero_de_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numero_de_temporadas = numero_de_temporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_de_temporadas() {
        return numero_de_temporadas;
    }

    public void setNumero_de_temporadas(int numero_de_temporadas) {
        this.numero_de_temporadas = numero_de_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                ", numero_de_temporadas=" + numero_de_temporadas +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' ;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
       return this.entregado;
    }

    @Override
    public Object compareTo(Object a) {
    if(this.getNumero_de_temporadas()< ((Series) a).getNumero_de_temporadas()){
           return a;
        }
    return this;
    }
}
