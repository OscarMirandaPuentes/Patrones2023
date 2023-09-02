package model.Legos;

import model.Cabeza;
import model.Cuerpo;
import model.Piernas;
import model.ToysFactory;

public class LegoMaleFactory implements ToysFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaMaleL();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoMaleL();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasMaleL();
	}

}
