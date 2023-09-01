package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Cabeza;
import model.Logica;
import view.Ventana;

public class Eventos implements ActionListener {

	
	private Logica l;
	private Ventana v;
	
	public Eventos(Logica l) {
		this.l=l;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == v.button1) {
			v.button1.setVisible(false);			
			v.botoneGen();
		}
		if(e.getSource() == v.buttonF || e.getSource() == v.buttonM) {
			l.crearFunko(e.getActionCommand());
			v.crearCanva(l.getCabeza(), l.getCuerpo(), l.getPiernas());
			v.buttonF.setVisible(false);
			v.buttonM.setVisible(false);
			v.buttonG.setVisible(true);
			v.buttonGG.setVisible(true);
			v.UIGen();
		}
		if(e.getSource() == v.buttonG) {	
			l.getCabeza().personalizar(v.color_ojos.getActionCommand(), (String)v.color_ojos.getSelectedItem());
			l.getCabeza().personalizar(v.color_piel.getActionCommand(), (String)v.color_piel.getSelectedItem());
			l.getCabeza().personalizar(v.color_pelo.getActionCommand(), (String)v.color_pelo.getSelectedItem());
			l.getCuerpo().personalizar(v.color_cuerpo.getActionCommand(), (String)v.color_cuerpo.getSelectedItem());
			l.getPiernas().personalizar(v.color_piernas.getActionCommand(), (String)v.color_piernas.getSelectedItem());
			v.mp.refresh();		
		}
		if(e.getSource() == v.buttonGG) {	
			v.guardar();		
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
	
	
	
}
