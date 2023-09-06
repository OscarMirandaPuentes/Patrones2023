package model;

import model.Funkos.FunkoFemaleFactory;
import model.Funkos.FunkoMaleFactory;
import model.Legos.LegoFemaleFactory;
import model.Legos.LegoMaleFactory;

public class BuilderF implements Builder{

	private ToysFactory toyFacto;
	private Cabeza cabeza;
	private Cuerpo cuerpo;
	private Piernas piernas;
	
	
	public void producir(String opt) {
		if (opt.equals("Masculino")) {
			this.toyFacto = new FunkoMaleFactory();
			this.cabeza = toyFacto.crearCabeza();
			this.cuerpo = toyFacto.crearCuerpo();
			this.piernas = toyFacto.crearPiernas();
		}
		else if(opt.equals("Femenino")) {
			this.toyFacto = new FunkoFemaleFactory();
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
