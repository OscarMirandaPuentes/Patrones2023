package model;

public class FunkoMaleFactory implements FunkoFactory{

	@Override
	public Cabeza crearCabeza() {
		// TODO Auto-generated method stub
		return new CabezaMale();
	}

	@Override
	public Cuerpo crearCuerpo() {
		// TODO Auto-generated method stub
		return new CuerpoMale();
	}

	@Override
	public Piernas crearPiernas() {
		// TODO Auto-generated method stub
		return new PiernasMale();
	}

}
