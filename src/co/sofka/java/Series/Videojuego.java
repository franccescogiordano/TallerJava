package co.sofka.java.Series;

public class Videojuego implements Entregable {
    private String titulo;
    private int horasestimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = "League Of Legends";
        this.horasestimadas = 10;
        this.entregado = false;
        this.genero = "MMORPG";
        this.compania = "Riot Games";
    }

    public Videojuego(String titulo, int horasestimadas) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        this.genero = "MMORPG";
        this.compania = "Riot Games";
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasestimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(int horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                        ", horasestimadas=" + horasestimadas +
                        ", genero='" + genero + '\'' +
                        ", compania='" + compania + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Object compareTo(Object a) {
        return this.getHorasestimadas() < ((Videojuego) a).getHorasestimadas() ? a : this;
    }
}