package model;

import javax.swing.*;

public class StarType {

    private ImageIcon imagen = new ImageIcon("star4.png");
    private String nombre;

    public StarType( String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

