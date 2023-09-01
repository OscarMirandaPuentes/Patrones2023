package view;

import javax.swing.*;
import model.Piernas;
import java.awt.*;

public class MyCanvaPiernas extends JComponent {
	Piernas legs;
 public MyCanvaPiernas(Piernas piernas) {
		// TODO Auto-generated constructor stub
	 this.legs = piernas;
	}
 
@Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor((Color)this.legs.mostrar("ColorH"));
        g2d.fillRect((Integer)this.legs.mostrar("x1"), (Integer)this.legs.mostrar("y1")
  			  ,(Integer)this.legs.mostrar("h1"), (Integer)this.legs.mostrar("w1"));
        
        g2d.fillRect((Integer)this.legs.mostrar("x2"), (Integer)this.legs.mostrar("y2")
    			  ,(Integer)this.legs.mostrar("h2"), (Integer)this.legs.mostrar("w2"));
    }
 	
	public void refresh() {
		repaint();
	}
}
