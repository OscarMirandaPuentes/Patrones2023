package model;

import javax.swing.*;

public class StarFactory {
    public StarType crearEstrella(String nombre) {
        return new StarType(nombre);
    }

    public Starfat crearEstrellaFat(ImageIcon imagen, String nombre, int x, int y) {
        return new Starfat(imagen, nombre,x, y);
    }
}
