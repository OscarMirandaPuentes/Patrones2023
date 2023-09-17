package view;

import controller.Eventos;
import controller.EventosF;
import model.Star;
import model.Starfat;

import javax.swing.*;
import java.util.List;

public class VentanaF extends JFrame{

	private EventosF ev;
	public MyPanelF mp ;

	public JButton buttonD;
	public JButton buttonI;
	public JButton buttonA;
	public JButton buttonAB;




	public VentanaF(EventosF e) {
		super("Mi ventana");
		this.ev=e;
		initComponents();
	}
	
	public void initComponents() {
		this.setSize(1000,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		addButtons();
		crearCanva(ev.getL().getEstrellasFat());
		this.setVisible(true);
	}
	
	public void addButtons() {
		this.buttonD =new JButton("→");
		this.buttonD.setBounds(525,600,100,50);
		this.buttonD.addActionListener(ev);
		
		this.buttonAB =new JButton("↓");
		this.buttonAB.setBounds(400,600,100,50);
		this.buttonAB.addActionListener(ev);

		
		this.buttonI =new JButton("←");
		this.buttonI.setBounds(100,600,100,50);
		this.buttonI.addActionListener(ev);
		
		this.buttonA =new JButton("↑");
		this.buttonA.setBounds(300,600,100,50);
		this.buttonA.addActionListener(ev);

		this.add(buttonD);
		this.add(buttonAB);
		this.add(buttonI);
		this.add(buttonA);

	}

	
	public void crearCanva(List<Starfat> estrellas) {
		this.mp = new MyPanelF(estrellas);
		this.mp.setBounds(0, 0, 1000, 550);
		this.add(mp);
	
	}
}
