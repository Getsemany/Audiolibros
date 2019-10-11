package com.example.audiolibros;

import android.app.Application;

import com.example.audiolibros.AdaptadorLibros;
import com.example.audiolibros.Libro;

import java.util.Vector;

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibrosFiltro adaptador;
    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibrosFiltro(this, vectorLibros);
    }
    public AdaptadorLibrosFiltro getAdaptador() {
        return adaptador;
    }
    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}