package model;

public class FunkoFemaleFactory implements FunkoFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaFemale();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoFemale();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasFemale();
	}

}
