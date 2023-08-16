import model.products.Fabrica;
import model.products.Hero;
import model.products.Marvel;

public class Launcher {
	public static void main(String[] args) {
		Fabrica fab = null;
		Hero myHero = null;
		
		if(true) {
			fab = new Marvel();
			myHero = fab.getHero();
		}
		
		System.out.println(myHero.Saludar());
	}
}
