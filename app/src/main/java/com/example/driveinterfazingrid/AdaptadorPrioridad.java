package com.example.driveinterfazingrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPrioridad extends RecyclerView.Adapter<AdaptadorPrioridad.ViewHolderPrioridad> {

    ArrayList<Prioridad> listaPrioridad;

    public AdaptadorPrioridad(ArrayList<Prioridad> listaPrioridad) {
        this.listaPrioridad = listaPrioridad;
    }


    @Override
    public ViewHolderPrioridad onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.filaejemplo,null,false);
        return new ViewHolderPrioridad(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPrioridad holder, int position) {
        holder.txtTitulo.setText(listaPrioridad.get(position).getTitulo());
        holder.txtMensaje.setText(listaPrioridad.get(position).getMensaje());
        holder.fotoIcon.setImageResource(listaPrioridad.get(position).getFotoIcon());
        holder.fotoRectan.setImageResource(listaPrioridad.get(position).getFotoRegtangular());
        holder.fotoPerfil.setImageResource(listaPrioridad.get(position).getFotoperfil());
    }

    @Override
    public int getItemCount() {
        return listaPrioridad.size();
    }

    public class ViewHolderPrioridad extends RecyclerView.ViewHolder {
        TextView  txtTitulo, txtMensaje ;
        ImageView fotoIcon, fotoRectan, fotoPerfil;
        public ViewHolderPrioridad(View itemView) {
            super(itemView);

            txtTitulo=(TextView)itemView.findViewById(R.id.PrioridadTitulo);
            txtMensaje=(TextView)itemView.findViewById(R.id.Prioridadmensaje);
            fotoIcon=(ImageView) itemView.findViewById(R.id.PrioridadIcon);
            fotoRectan=(ImageView) itemView.findViewById(R.id.PrioridadimgRectang);
            fotoPerfil=(ImageView) itemView.findViewById(R.id.Prioridadperfil);
        }
    }
}
