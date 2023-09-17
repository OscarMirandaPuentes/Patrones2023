package model;

import javax.swing.*;

public class Starfat {

    private ImageIcon imagen = new ImageIcon("star4.png");
    private String nombre;
    private int x;
    private int y;

    public Starfat(ImageIcon imagen, String nombre, int x, int y) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
