package view;

import model.Star;
import model.Starfat;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MyPanelF extends JPanel{
	private List<Starfat> estrellas;

	public MyPanelF(List<Starfat> estrellas) {
		setBackground(Color.BLACK);
		this.estrellas = estrellas;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (estrellas != null) {
			for (Starfat star : estrellas) {
				if (star != null) {
					star.getImagen().paintIcon(this, g, star.getX(), star.getY());
				}
			}
		}
	}

	public List<Starfat> getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(List<Starfat> estrellas) {
		this.estrellas = estrellas;
	}
}
