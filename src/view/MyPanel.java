package view;

import model.Star;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class MyPanel extends JPanel{
	private List<Star> estrellas;

	public MyPanel(List<Star> estrellas) {
		setBackground(Color.BLACK);
		this.estrellas = estrellas;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (estrellas != null) {
			for (Star star : estrellas) {
				if (star != null) {
					star.getStar().getImagen().paintIcon(this, g, star.getX(), star.getY());
				}
			}
		}
	}

	public List<Star> getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(List<Star> estrellas) {
		this.estrellas = estrellas;
	}
}
