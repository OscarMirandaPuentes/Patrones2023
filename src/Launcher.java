import java.util.Random;

import dc.*;
import marvel.*;
import model.products.*;

public class Launcher {
	public static void main(String[] args) {
		Fabrica fab = null;
		
		Random r =  new Random();
		int i =  r.nextInt(10);
		
		if(i<5) {
			fab = new Marvel();
		}else {
			fab =  new Dc();
		}
		
		Comic p = fab.getComic();
		Hero h = fab.getHero();
		Villano v = fab.getVillano();
		
		System.out.println("Titulo: " + p.titulo());
		System.out.println("Heroe: " + h.getNombre());
		System.out.println(h.Saludar()+". ");
		System.out.println("Villano: " + v.getNombre());
		System.out.println(v.Burla()+". ");
		
	}
}
