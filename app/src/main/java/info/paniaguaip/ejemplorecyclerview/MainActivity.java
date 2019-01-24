package info.paniaguaip.ejemplorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager llm;
    RecyclerView rwListaPeliculas;
    RecyclerView.Adapter adaptador;
    ArrayList<Pelicula> alPelis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alPelis = GestorPeliculas.getPelis();
        rwListaPeliculas = (RecyclerView)findViewById(R.id.rwPeliculas);
        llm = new LinearLayoutManager(this);
        rwListaPeliculas.setLayoutManager(llm);
        adaptador = new PeliculasRecyclerAdapter(alPelis);
        rwListaPeliculas.setAdapter(adaptador);
    }
    public void agregar(View v){
        alPelis.add(2,alPelis.get(4));
        adaptador.notifyItemInserted(2);
    }

    public void borrar(View v){
        alPelis.remove(2);
        adaptador.notifyItemRemoved(2);
    }
}
