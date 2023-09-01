package view;

import javax.swing.*;

import model.CabezaMale;
import model.Cuerpo;

import java.awt.*;

public class MyCanvaCuerpo extends JComponent {
	Cuerpo body;
	
 public MyCanvaCuerpo(Cuerpo cuerpo) {
		// TODO Auto-generated constructor stub
	 this.body = cuerpo;
	}
 
@Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Cambiar el grosor de la línea a 3
        g2d.setColor((Color)this.body.mostrar("ColorH"));
        g2d.fillRect((Integer)this.body.mostrar("x"), (Integer)this.body.mostrar("y")
        			  ,(Integer)this.body.mostrar("h"), (Integer)this.body.mostrar("w")); // Cuerpo
       
        g2d.fillPolygon((int[])this.body.mostrar("brazo1x"), (int[])this.body.mostrar("brazo1y"), 4);
        g2d.fillPolygon((int[])this.body.mostrar("brazo2x"), (int[])this.body.mostrar("brazo2y"), 4);

    }
 	
	public void refresh() {
		repaint();
	}
}
