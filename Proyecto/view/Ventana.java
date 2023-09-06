package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Eventos;
import model.Cabeza;
import model.Cuerpo;
import model.Piernas;

public class Ventana extends JFrame{
	
	private Eventos ev;
	public JComboBox color_ojos;
	public JComboBox color_piel;
	public JComboBox color_pelo;
	public JComboBox color_cuerpo;
	public JComboBox color_piernas;
	public MyPanel mp ;
	public JLabel label;
	public JLabel labelP;
	public JLabel labelH;
	public JLabel labelC;
	public JLabel labelL;
	public JButton button1;
	public JButton buttonO;
	public JButton buttonO2;
	public JButton buttonM;
	public JButton buttonF;
	public JButton buttonG;
	public JButton buttonGG;
	public JButton buttonR;
	
	private String colors[]
	        = { "blue", "red", "yellow", "pink", "white", "magenta", "black" };

	
	public Ventana(Eventos e) {
		super("Mi ventana");
		this.ev=e;
		initComponents();
	}
	
	public void initComponents() {
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		addButtons();
		addFields();
		this.setVisible(true);
	}
	
	public void addButtons() {
		this.button1=new JButton("Iniciar");
		this.button1.setBounds(225,450,100,50);
		this.button1.addActionListener(ev);
		
		this.buttonM=new JButton("Masculino");
		this.buttonM.setBounds(100,450,100,50);
		this.buttonM.addActionListener(ev);
		this.buttonM.setVisible(false);
		
		this.buttonF=new JButton("Femenino");
		this.buttonF.setBounds(400,450,100,50);
		this.buttonF.addActionListener(ev);
		this.buttonF.setVisible(false);
		
		this.buttonO=new JButton("Funko");
		this.buttonO.setBounds(100,450,100,50);
		this.buttonO.addActionListener(ev);
		this.buttonO.setVisible(false);
		
		this.buttonO2=new JButton("Lego");
		this.buttonO2.setBounds(400,450,100,50);
		this.buttonO2.addActionListener(ev);
		this.buttonO2.setVisible(false);
		
		this.buttonG=new JButton("Generar");
		this.buttonG.setBounds(400,410,100,50);
		this.buttonG.addActionListener(ev);
		this.buttonG.setVisible(false);
		
		this.buttonGG=new JButton("Guardar");
		this.buttonGG.setBounds(400,460,100,50);
		this.buttonGG.addActionListener(ev);
		this.buttonGG.setVisible(false);
		
		this.buttonR=new JButton("Reiniciar");
		this.buttonR.setBounds(400,510,100,50);
		this.buttonR.addActionListener(ev);
		this.buttonR.setVisible(false);
		
		this.add(button1);
		this.add(buttonM);
		this.add(buttonF);
		this.add(buttonO);
		this.add(buttonO2);
		this.add(buttonG);
		this.add(buttonGG);
		this.add(buttonR);
	}
	
	public void botoneGen() {
		this.buttonF.setVisible(true);
		this.buttonM.setVisible(true);
	}
	
	public void botoneOpt() {
		this.buttonO.setVisible(true);
		this.buttonO2.setVisible(true);
	}
	
	public void UIGen() {
		this.label.setVisible(true);
		this.color_ojos.setVisible(true);
		this.labelP.setVisible(true);
		this.color_piel.setVisible(true);
		this.labelH.setVisible(true);
		this.color_pelo.setVisible(true);
		this.labelC.setVisible(true);
		this.color_cuerpo.setVisible(true);
		this.labelL.setVisible(true);
		this.color_piernas.setVisible(true);
	}
	
	public void UIOff() {
		this.label.setVisible(false);
		this.color_ojos.setVisible(false);
		this.labelP.setVisible(false);
		this.color_piel.setVisible(false);
		this.labelH.setVisible(false);
		this.color_pelo.setVisible(false);
		this.labelC.setVisible(false);
		this.color_cuerpo.setVisible(false);
		this.labelL.setVisible(false);
		this.color_piernas.setVisible(false);
	}
	
	public void addFields() {
		this.label = new JLabel("Ojos:");
        this.label.setFont(new Font("Arial", Font.PLAIN, 15));
        this.label.setBounds(50,435,100,50);
        this.label.setVisible(false);
        this.add(label);
	 
        this.color_ojos = new JComboBox(colors);
        this.color_ojos.setActionCommand("Ojos");
        this.color_ojos.setFont(new Font("Arial", Font.PLAIN, 15));
        this.color_ojos.setBounds(100,450,100,25);
        this.color_ojos.setVisible(false);
        this.add(this.color_ojos);
        
        this.labelP = new JLabel("Piel:");
        this.labelP.setFont(new Font("Arial", Font.PLAIN, 15));
        this.labelP.setBounds(215,435,100,50);
        this.labelP.setVisible(false);
        this.add(labelP);
        
        this.color_piel = new JComboBox(colors);
        this.color_piel.setActionCommand("piel");
        this.color_piel.setFont(new Font("Arial", Font.PLAIN, 15));
        this.color_piel.setBounds(250,450,100,25);
        this.color_piel.setVisible(false);
        this.add(this.color_piel);
        
        this.labelH = new JLabel("Pelo:");
        this.labelH.setFont(new Font("Arial", Font.PLAIN, 15));
        this.labelH.setBounds(50,475,100,50);
        this.labelH.setVisible(false);
        this.add(labelH);
        
        this.color_pelo = new JComboBox(colors);
        this.color_pelo.setActionCommand("pelo");
        this.color_pelo.setFont(new Font("Arial", Font.PLAIN, 15));
        this.color_pelo.setBounds(100,485,100,25);
        this.color_pelo.setVisible(false);
        this.add(this.color_pelo);
        
        this.labelC = new JLabel("Cuerpo:");
        this.labelC.setFont(new Font("Arial", Font.PLAIN, 15));
        this.labelC.setBounds(215,475,100,50);
        this.labelC.setVisible(false);
        this.add(labelC);
        
        this.color_cuerpo = new JComboBox(colors);
        this.color_cuerpo.setActionCommand("Cuerpo");
        this.color_cuerpo.setFont(new Font("Arial", Font.PLAIN, 15));
        this.color_cuerpo.setBounds(275,485,100,25);
        this.color_cuerpo.setVisible(false);
        this.add(this.color_cuerpo);
        
        this.labelL = new JLabel("Piernas:");
        this.labelL.setFont(new Font("Arial", Font.PLAIN, 15));
        this.labelL.setBounds(43,510,100,50);
        this.labelL.setVisible(false);
        this.add(labelL);
        
        this.color_piernas = new JComboBox(colors);
        this.color_piernas.setActionCommand("Piernas");
        this.color_piernas.setFont(new Font("Arial", Font.PLAIN, 15));
        this.color_piernas.setBounds(100,520,100,25);
        this.color_piernas.setVisible(false);
        this.add(this.color_piernas);
        
	}
	
	public void crearCanva(Cabeza cabeza, Cuerpo cuerpo, Piernas piernas) {
		this.mp = new MyPanel(cabeza, cuerpo, piernas);
		this.mp.setBounds(20, 20, 600, 300);
		this.add(mp);
	
	}
	
	public void guardar() {
		BufferedImage bufferedImage = new BufferedImage(mp.getWidth(), mp.getHeight(), BufferedImage.TYPE_INT_RGB);
        mp.paint(bufferedImage.getGraphics());
		try {
            File output = new File("panel_image.jpg");
            ImageIO.write(bufferedImage, "jpg", output);
            System.out.println("Imagen guardada en: " + output.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
