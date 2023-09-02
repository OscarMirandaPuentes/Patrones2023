package model;

import model.Funkos.FunkoFemaleFactory;
import model.Funkos.FunkoMaleFactory;
import model.Legos.LegoFemaleFactory;
import model.Legos.LegoMaleFactory;

public class Director {
	private static Director director = null;
	private ToysFactory toyFacto;
	private Cabeza cabeza;
	private Cuerpo cuerpo;
	private Piernas piernas;
	private String tipo;
	
	
	public static Director getInstance() {
		if (director == null) {
			director = new Director();
		}
		return director;
	}
	
	public void elegirtipo(String toy) {
		if (toy.equals("Funko")) {
			this.tipo = toy;
		}
		else if(toy.equals("Lego")) {
			this.tipo = toy;
		}
	}
	
	public void producir(String opt) {
		if (this.tipo.equals("Funko")) {
			crearFunko(opt);
		}
		else if (this.tipo.equals("Lego")) {
			crearLego(opt);
		}
	}
	
	public void crearFunko(String genero) {	
		
		if (genero.equals("Masculino")) {
			this.toyFacto = new FunkoMaleFactory();
			this.cabeza = toyFacto.crearCabeza();
			this.cuerpo = toyFacto.crearCuerpo();
			this.piernas = toyFacto.crearPiernas();
		}
		else if(genero.equals("Femenino")) {
			this.toyFacto = new FunkoFemaleFactory();
			this.cabeza = toyFacto.crearCabeza();
			this.cuerpo = toyFacto.crearCuerpo();
			this.piernas = toyFacto.crearPiernas();
		}
	}
	
	public void crearLego(String genero) {	
			
			if (genero.equals("Masculino")) {
				this.toyFacto =  new LegoMaleFactory();
				this.cabeza = toyFacto.crearCabeza();
				this.cuerpo = toyFacto.crearCuerpo();
				this.piernas = toyFacto.crearPiernas();
			}
			else if(genero.equals("Femenino")) {
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
