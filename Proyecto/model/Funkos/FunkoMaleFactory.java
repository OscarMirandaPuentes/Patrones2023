package model.Funkos;

import model.Cabeza;
import model.Cuerpo;
import model.ToysFactory;
import model.Piernas;

public class FunkoMaleFactory implements ToysFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaMaleF();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoMaleF();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasMaleF();
	}

}
