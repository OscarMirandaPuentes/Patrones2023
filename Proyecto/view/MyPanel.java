package view;

import java.awt.Dimension;

import javax.swing.JPanel;

import model.Cabeza;
import model.Cuerpo;
import model.Piernas;

public class MyPanel extends JPanel{
	private MyCanvaCabeza mc;
	private MyCanvaCuerpo mcc;
	private MyCanvaPiernas mp;

	public MyPanel(Cabeza cabeza, Cuerpo cuerpo, Piernas piernas) {
		// TODO Auto-generated constructor stub
		this.mc = new MyCanvaCabeza(cabeza);
		this.mcc = new MyCanvaCuerpo(cuerpo);
		this.mp = new MyCanvaPiernas(piernas);

		this.mc.setPreferredSize(new Dimension(600,152));
		this.mcc.setPreferredSize(new Dimension(600,80));
		this.mp.setPreferredSize(new Dimension(600,100));
		add(this.mc);
		add(this.mcc);
		add(this.mp);
	}
	
	
	public void refresh() {
		if (mc != null) {
			this.mc.refresh();
			this.mcc.refresh();
			this.mp.refresh();
		}
	}
}
