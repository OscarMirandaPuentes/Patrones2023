package model;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Logica {
    private StarFactory sf = new StarFactory();
    private List<Star> estrellas = new ArrayList<>();

    private List<Starfat> estrellasF = new ArrayList<>();
    Random random = new Random();

    public void addStar(){
        StarType star = sf.crearEstrella(String.valueOf(random.nextInt(3)));
        for (int i = 0; i < 2000; i++) {
            Star estrellita = new Star(star, random.nextInt(1000),random.nextInt(550));
            estrellas.add(estrellita);
        }
    }

    public void addStarFat(){
        for (int i = 0; i < 2000; i++) {
            Starfat star = sf.crearEstrellaFat(new ImageIcon("star4.png"),String.valueOf(i),random.nextInt(1000),random.nextInt(550));
            estrellasF.add(star);
        }
    }

    public void moverD(){
        for (Star star: estrellas) {
            if (star.getX() > 1001){
                star.setX(-20);
            }
            else {
                star.setX(star.getX() + 10);
            }
        }
    }

    public void moverI(){
        for (Star star: estrellas) {
            if (star.getX() < -1){
                star.setX(1001);
            }
            else {
                star.setX(star.getX() - 10);
            }
        }
    }

    public void moverA(){
        for (Star star: estrellas) {
            if (star.getY() < -1){
                star.setY(551);
            }
            else {
                star.setY(star.getY() - 10);
            }
        }
    }

    public void moverAB(){
        for (Star star: estrellas) {
            if (star.getY() > 551){
                star.setY(-1);
            }
            else {
                star.setY(star.getY() + 10);
            }
        }
    }

    public List<Star> getEstrellas() {
        return estrellas;
    }
    public List<Starfat> getEstrellasFat() {
        return estrellasF;
    }
}
