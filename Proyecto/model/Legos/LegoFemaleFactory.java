package model.Legos;

import model.Cabeza;
import model.Cuerpo;
import model.Piernas;
import model.ToysFactory;

public class LegoFemaleFactory implements ToysFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaFemaleL();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoFemaleL();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasFemaleL();
	}

}
