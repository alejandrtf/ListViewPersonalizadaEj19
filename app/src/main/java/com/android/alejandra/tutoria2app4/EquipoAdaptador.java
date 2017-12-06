package com.android.alejandra.tutoria2app4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.alejandra.tutoria2app4.modelo.Equipo;

import java.util.ArrayList;

/**
 * Created by Sandra on 16/11/2016.
 */

public class EquipoAdaptador extends ArrayAdapter<Equipo> {
    private Context context;
    private ArrayList<Equipo> datos;

    public EquipoAdaptador(Context context, ArrayList<Equipo> datos) {
        //al super pasamos el contexto, el layout de cada item de la lista y
        // el array con los datos
        super(context, R.layout.item_lista_equipos, datos);

        //guardamos los parámetros en las variables de la clase
        this.context = context;
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item;
        // En primer lugar "inflamos" una nueva vista
        LayoutInflater inflater = LayoutInflater.from(context);
        item = inflater.inflate(R.layout.item_lista_equipos, null);

        ImageView escudo = (ImageView) item.findViewById(R.id.ivEscudoItem);
        TextView nombreEquipo = (TextView) item.findViewById(R.id.tvNombreEquipoItem);
        TextView puntosEquipo = (TextView) item.findViewById(R.id.tvPuntosEquipoItem);

        //Asignamos los datos correspondientes la equipo de la posición position

        // asignamos el escudo.
        escudo.setImageResource(datos.get(position).getImagenEscudoID());
        // asignamos el nombre
        nombreEquipo.setText(datos.get(position).getNombreEquipo());
        // asignamos los puntos
        puntosEquipo.setText(String.valueOf(datos.get(position).getPuntos()));

        // Devolvemos la vista para que se muestre en el ListView.
        return item;
    }


}
