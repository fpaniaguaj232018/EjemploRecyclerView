package info.paniaguaip.ejemplorecyclerview;

public class Pelicula {
    private String titulo;
    private int anyo;

    public Pelicula(String titulo, int anyo) {
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
}
