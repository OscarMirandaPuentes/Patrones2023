package dc;

import model.products.Comic;
import model.products.Fabrica;
import model.products.Hero;
import model.products.Villano;

public class Dc implements Fabrica{

	@Override
	public Comic getComic() {
		// TODO Auto-generated method stub
		return new Tomo1();
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return new Batman();
	}

	@Override
	public Villano getVillano() {
		// TODO Auto-generated method stub
		return new LexLutor();
	}

}
