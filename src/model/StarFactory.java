package model;

public class StarFactory {
    public static StarType crearEstrella(String nombre) {
        return new StarType(nombre);
    }
}
