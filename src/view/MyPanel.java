package view;

import model.Star;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class MyPanel extends JPanel{
	private List<Star> estrellas = new ArrayList<>();

	public MyPanel() {
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Star icon : estrellas) {
			icon.getStar().getImagen().paintIcon(this, g, icon.getX(), icon.getY());
		}
	}

	public void agregarEstrella(Star estrella) {
		this.estrellas.add(estrella);
	}

}
