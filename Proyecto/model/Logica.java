package model;

public class Logica {
	private FunkoFactory funkoFacto;
	private Cabeza cabeza;
	private Cuerpo cuerpo;
	private Piernas piernas;

	public void crearFunko(String genero) {
		if (genero.equals("Masculino")) {
			this.funkoFacto = new FunkoMaleFactory();
			this.cabeza = funkoFacto.crearCabeza();
			this.cuerpo = funkoFacto.crearCuerpo();
			this.piernas = funkoFacto.crearPiernas();
		}
		else if(genero.equals("Femenino")) {
			this.funkoFacto = new FunkoFemaleFactory();
			this.cabeza = funkoFacto.crearCabeza();
			this.cuerpo = funkoFacto.crearCuerpo();
			this.piernas = funkoFacto.crearPiernas();
		}
	}

	public Cabeza getCabeza() {
		return this.cabeza;
	}

	public Cuerpo getCuerpo() {
		return this.cuerpo;
	}

	public Piernas getPiernas() {
		return this.piernas;
	}
	
}
