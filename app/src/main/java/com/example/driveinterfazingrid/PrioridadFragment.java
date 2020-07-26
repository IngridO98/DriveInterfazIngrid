package com.example.driveinterfazingrid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PrioridadFragment extends Fragment {

    ArrayList<Prioridad> listaprioridad;
    private RecyclerView recyclerPrioridad;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_prioridad,container,false);

        listaprioridad =new ArrayList<>();
        recyclerPrioridad =(RecyclerView) view.findViewById(R.id.PrioridadRecycler);
        recyclerPrioridad.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarPrincipal();
        AdaptadorPrioridad adapter= new AdaptadorPrioridad(listaprioridad);
        recyclerPrioridad.setAdapter(adapter);
        return view;
    }

    public void llenarPrincipal(){
        listaprioridad.add(new Prioridad("Herramientas CRM","Lo has subido hoy",R.drawable.gslides,R.drawable.captura_trabajo1, R.drawable.ingrid));
        listaprioridad.add(new Prioridad("Introducción a las redes locales","Lo has abierto hoy",R.drawable.gslides,R.drawable.captura_trabajo2, R.drawable.ingrid));
        listaprioridad.add(new Prioridad("Proyecto Integrador","Lo has abierto hoy",R.drawable.docdrive,R.drawable.captura_trabajo3, R.drawable.ingrid));
        listaprioridad.add(new Prioridad("Analisis Plan Estratégico De Los Sistemas Informáticos ","Lo has subido hoy",R.drawable.docdrive,R.drawable.captura_trabajo4, R.drawable.ingrid));
    }
}
