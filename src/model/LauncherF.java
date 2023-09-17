package model;

import controller.Eventos;
import controller.EventosF;
import view.Ventana;
import view.VentanaF;

public class LauncherF {

	public static void main(String[] args) {
		
		Logica l=new Logica();
		
		EventosF e=new EventosF(l);
		
		VentanaF v=new VentanaF(e);
		e.setV(v);
		e.cargar();
		

	}

}
