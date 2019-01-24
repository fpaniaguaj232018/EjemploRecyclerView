package info.paniaguaip.ejemplorecyclerview;

import java.util.ArrayList;

public class GestorPeliculas {
    public static ArrayList<Pelicula> getPelis(){
        ArrayList<Pelicula> pelis = new ArrayList();
        for(int i=0;i<1000;i++){
            pelis.add(new Pelicula("Star Wars IV",1977));
            pelis.add(new Pelicula("Dead Pool",2016));
            pelis.add(new Pelicula("Amanece que no es poco",1989));
            pelis.add(new Pelicula("La momia",1932));
            pelis.add(new Pelicula("La sombra del vampiro", 2000));
            pelis.add(new Pelicula("Nosferatu, a Symphony of Horror",1922));
            pelis.add(new Pelicula("Miedo y asco en Las Vegas", 1999));

        }
        return pelis;
    }
}

