package com.util.diegus.recycleview;

/**
 * Created by HP on 28/07/2015.
 */
public class Movie {
    private int imagen;
    private String nombre;
    private int visitas;

    public Movie(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public int getImagen() {
        return imagen;
    }
}