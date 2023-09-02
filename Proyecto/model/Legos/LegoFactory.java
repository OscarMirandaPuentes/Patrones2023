package model.Legos;

import model.Cabeza;
import model.Cuerpo;
import model.Piernas;

public interface LegoFactory {
	public Cabeza crearCabeza();
	public Cuerpo crearCuerpo();
	public Piernas crearPiernas();
}
