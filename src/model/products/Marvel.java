package model.products;

public class Marvel implements Fabrica{

	@Override
	public Comic getComic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hero getHero() {
		// TODO Auto-generated method stub
		return new IronMan();
	}

}
