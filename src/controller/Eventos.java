package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Logica;
import view.Ventana;

public class Eventos implements ActionListener {
	private Logica l;
	private Ventana v;
	
	public Eventos(Logica l) {
		this.l=l;
		this.l.addStar();
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


	public Ventana getV() {
		return v;
	}


	public void setV(Ventana v) {
		this.v = v;
	}
	
	public void cargar(){
		v.mp.setEstrellas(l.getEstrellas());
	}
	
}
