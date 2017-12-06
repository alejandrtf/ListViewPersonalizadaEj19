package com.android.alejandra.tutoria2app4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.alejandra.tutoria2app4.modelo.Equipo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Equipo> arrayEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializamos el array de equipos y cargamos los valores en el arrayList
        arrayEquipos=new ArrayList<Equipo>();
        rellenarArrayList();

        //obtengo referencia a la Listview
        ListView lvEquipos=(ListView) findViewById(R.id.listaEquipos);

        //declaro en instancio una variable de tipo adaptador
        EquipoAdaptador adaptador=new EquipoAdaptador(this,arrayEquipos);

        //asigno adaptador
        lvEquipos.setAdapter(adaptador);

        //asigno listener que estará pendiente de si se pulsa un item
        lvEquipos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View view, int position, long id) {
                Intent i=new Intent(MainActivity.this,Activity_PantallaResultado.class);
                i.putExtra("NOMBRE_EQUIPO",((Equipo)lista.getAdapter().getItem(position)).getNombreEquipo());
                i.putExtra("PUESTO",position+1);
                startActivity(i);
            }
        });
    }


    /**Método que carga los datos en el arrayList de equipos
     *
     */
    private void rellenarArrayList() {
        arrayEquipos.add(new Equipo("Barcelona",R.drawable.barcelona,33));
        arrayEquipos.add(new Equipo("Real Madrid",R.drawable.madrid,28));
        arrayEquipos.add(new Equipo("Atlético",R.drawable.atletico_madrid,26));
        arrayEquipos.add(new Equipo("Valencia",R.drawable.valencia,24));
        arrayEquipos.add(new Equipo("Sevilla",R.drawable.sevilla,23));
        arrayEquipos.add(new Equipo("Málaga",R.drawable.malaga,21));
        arrayEquipos.add(new Equipo("Celta",R.drawable.celta,20));
        arrayEquipos.add(new Equipo("Villa Real",R.drawable.villa_real,18));
        arrayEquipos.add(new Equipo("Athetic",R.drawable.athetic,15));
        arrayEquipos.add(new Equipo("Getafe",R.drawable.getafe,14));
        arrayEquipos.add(new Equipo("Rayo Vallecano",R.drawable.rayo_vallecano,14));
        arrayEquipos.add(new Equipo("Eibar",R.drawable.eibar,13));
        arrayEquipos.add(new Equipo("Levante",R.drawable.levante,12));
        arrayEquipos.add(new Equipo("Espanyol",R.drawable.espanyol,11));
        arrayEquipos.add(new Equipo("Granada",R.drawable.granada,11));
        arrayEquipos.add(new Equipo("Real Sociedad",R.drawable.real_sociedad,10));
        arrayEquipos.add(new Equipo("Almeria",R.drawable.almeria,10));
        arrayEquipos.add(new Equipo("Deportivo",R.drawable.deportivo,10));
        arrayEquipos.add(new Equipo("Elche",R.drawable.elche,10));
        arrayEquipos.add(new Equipo("Córdoba",R.drawable.cordoba,7));

    }

    }
