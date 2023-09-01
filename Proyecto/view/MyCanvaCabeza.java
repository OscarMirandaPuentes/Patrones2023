package view;

import javax.swing.*;

import model.Cabeza;

import java.awt.*;

public class MyCanvaCabeza extends JComponent {
	Cabeza head;
	
 public MyCanvaCabeza(Cabeza cabeza) {
		// TODO Auto-generated constructor stub
	 this.head = cabeza;
	}

@Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Cambiar el grosor de la línea a 3
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor((Color) head.mostrar("ColorP"));
        
        g2d.fillRoundRect((Integer) head.mostrar("xp"), (Integer) head.mostrar("yp"), 
				  (Integer) head.mostrar("hp"),(Integer) head.mostrar("wp"), 10, 10);
        
        g2d.setColor(Color.black);
        
        g2d.drawRoundRect((Integer) head.mostrar("x"), (Integer) head.mostrar("y"), 
        				  (Integer) head.mostrar("h"),(Integer) head.mostrar("w"), 10, 10);
        g2d.setColor((Color) head.mostrar("ColorH"));
        g2d.fillRoundRect((Integer) head.mostrar("x"), (Integer) head.mostrar("y"), 
        				  (Integer) head.mostrar("h"),(Integer) head.mostrar("w"), 10, 10);
        g2d.setColor((Color) head.mostrar("ColorO"));
        g2d.fillOval((Integer) head.mostrar("xo1"), (Integer) head.mostrar("yo1"), 
        			 (Integer) head.mostrar("d1"), (Integer) head.mostrar("d2"));
        g2d.fillOval((Integer) head.mostrar("xo2"), (Integer) head.mostrar("yo2"), 
   			 (Integer) head.mostrar("d1"), (Integer) head.mostrar("d2"));
    }
	public void refresh() {
		repaint();
	}
}
