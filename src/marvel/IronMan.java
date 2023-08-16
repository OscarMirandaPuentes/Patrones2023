package marvel;

import model.products.Hero;

public class IronMan implements Hero{

	@Override
	public String Saludar() {
		// TODO Auto-generated method stub
		return "Yo soy Iroman";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "IronMan";
	}

}
