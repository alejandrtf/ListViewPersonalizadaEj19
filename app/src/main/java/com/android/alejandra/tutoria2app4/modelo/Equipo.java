package com.android.alejandra.tutoria2app4.modelo;

/**
 * Created by Sandra on 16/11/2016.
 */

public class Equipo {
    private String nombreEquipo;
    private int imagenEscudoID;
    private int puntos;

    //CONSTRUCTOR
    public Equipo(String nombreEquipo, int imagenEscudoID, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.imagenEscudoID = imagenEscudoID;
        this.puntos = puntos;
    }

    //GETTERS AND SETTERS
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagenEscudoID() {
        return imagenEscudoID;
    }

    public void setImagenEscudoID(int imagenEscudoID) {
        this.imagenEscudoID = imagenEscudoID;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
