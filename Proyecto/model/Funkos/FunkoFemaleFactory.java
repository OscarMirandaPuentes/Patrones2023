package model.Funkos;

import model.Cabeza;
import model.Cuerpo;
import model.ToysFactory;
import model.Piernas;

public class FunkoFemaleFactory implements ToysFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaFemaleF();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoFemaleF();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasFemaleF();
	}

}
