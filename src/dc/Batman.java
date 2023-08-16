package dc;

import model.products.Hero;

public class Batman implements Hero{

	@Override
	public String Saludar() {
		// TODO Auto-generated method stub
		return "Yo soy la justicia de Gotham";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Batman";
	}

}
