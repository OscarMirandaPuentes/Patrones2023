package marvel;

import model.products.Comic;
import model.products.Fabrica;
import model.products.Hero;
import model.products.Villano;

public class Marvel implements Fabrica{

	@Override
	public Comic getComic() {
		// TODO Auto-generated method stub
		return new Cap1();
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return new IronMan();
	}

	@Override
	public Villano getVillano() {
		// TODO Auto-generated method stub
		return new Thanos();
	}

}
