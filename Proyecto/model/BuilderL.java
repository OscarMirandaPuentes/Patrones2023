package model;

import model.Legos.LegoFemaleFactory;
import model.Legos.LegoMaleFactory;

public class BuilderL implements Builder{
	
	private ToysFactory toyFacto;
	private Cabeza cabeza;
	private Cuerpo cuerpo;
	private Piernas piernas;
	
	
	public void producir(String opt) {
		if (opt.equals("Masculino")) {
			this.toyFacto =  new LegoMaleFactory();
			this.cabeza = toyFacto.crearCabeza();
			this.cuerpo = toyFacto.crearCuerpo();
			this.piernas = toyFacto.crearPiernas();
		}
		else if(opt.equals("Femenino")) {
			this.toyFacto = new LegoFemaleFactory();
			this.cabeza = toyFacto.crearCabeza();
			this.cuerpo = toyFacto.crearCuerpo();
			this.piernas = toyFacto.crearPiernas();
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
