package controller;

import model.Logica;
import view.Ventana;
import view.VentanaF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosF implements ActionListener {
	private Logica l;
	private VentanaF v;

	public EventosF(Logica l) {
		this.l=l;
		this.l.addStarFat();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == v.buttonD) {
			l.moverD();
			v.mp.repaint();
		}
		if (e.getSource() == v.buttonI) {
			l.moverI();
			v.mp.repaint();
		}
		if (e.getSource() == v.buttonA) {
			l.moverA();
			v.mp.repaint();
		}
		if (e.getSource() == v.buttonAB) {
			l.moverAB();
			v.mp.repaint();
		}


	}

	public Logica getL() {
		return l;
	}


	public void setL(Logica l) {
		this.l = l;
	}


	public VentanaF getV() {
		return v;
	}


	public void setV(VentanaF v) {
		this.v = v;
	}
	
	public void cargar(){
		v.mp.setEstrellas(l.getEstrellasFat());
	}
	
}
