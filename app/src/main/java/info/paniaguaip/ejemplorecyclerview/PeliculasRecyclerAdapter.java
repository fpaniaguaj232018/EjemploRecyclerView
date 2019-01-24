package info.paniaguaip.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PeliculasRecyclerAdapter
        extends RecyclerView.Adapter<PeliculasRecyclerAdapter.ViewHolder>{
    ArrayList<Pelicula> alPelis;

    public PeliculasRecyclerAdapter(ArrayList<Pelicula> _alPelis){
        this.alPelis = _alPelis;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout ll = (LinearLayout)LayoutInflater.from(
                parent.getContext()).inflate(R.layout.fila,parent,false);
        ViewHolder vh = new ViewHolder(ll);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvTitulo.setText(alPelis.get(position).getTitulo());
        holder.tvAnyo.setText(""+ alPelis.get(position).getAnyo());
    }

    @Override
    public int getItemCount() {
        return alPelis.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTitulo;
        public TextView tvAnyo;
        public ViewHolder(LinearLayout ll) {
            super(ll);
            tvTitulo = ll.findViewById(R.id.tvTitulo);
            tvAnyo = ll.findViewById(R.id.tvAnyo);
        }
    }
}
