package model.Legos;

import java.awt.Color;
import java.util.HashMap;

import model.Parte;
import model.Piernas;
import model.Funkos.PiernasMaleF;

public class PiernasMaleL implements Piernas{
	private int x1;
	private int y1;
	private int w1;
	private int h1;
	private int x2;
	private int y2;
	private int w2;
	private int h2;
	private Color colorH;
	private HashMap<String, Object> ProductoInfo;

	//Colores 
	private HashMap<String, Color> colorMap = new HashMap<String, Color>();
	
	
	public PiernasMaleL() {
		this.x1 = 230;
		this.y1 = 0;
		this.w1 = 20;
		this.h1 = 20;
		this.x2 = 260;
		this.y2 = 0;
		this.w2 = 20;
		this.h2 = 20;
		this.colorH = Color.green;
		this.ProductoInfo = new HashMap<>();
		llenarHm();
	}

	private PiernasMaleL(PiernasMaleL piernasMaleL) {
		// TODO Auto-generated constructor stub
		this.x1 = piernasMaleL.x1;
		this.y1 = piernasMaleL.y1;
		this.h1 = piernasMaleL.h1;
		this.w1 = piernasMaleL.w1;
		this.x2 = piernasMaleL.x2;
		this.y2 = piernasMaleL.y2;
		this.h2 = piernasMaleL.h2;
		this.w2 = piernasMaleL.w2;
		this.colorH = piernasMaleL.colorH;
	}
	
	private void llenarHm() {		
		this.ProductoInfo.put("x1", this.x1); 
		this.ProductoInfo.put("y1", this.y1);
		this.ProductoInfo.put("h1", this.h1);
		this.ProductoInfo.put("w1", this.w1);
		this.ProductoInfo.put("x2", this.x2); 
		this.ProductoInfo.put("y2", this.y2);
		this.ProductoInfo.put("h2", this.h2);
		this.ProductoInfo.put("w2", this.w2);

		this.ProductoInfo.put("ColorH", this.colorH); 
		
		this.colorMap.put("black", Color.black);
		this.colorMap.put("blue", Color.blue);
		this.colorMap.put("red", Color.red);
		this.colorMap.put("yellow", Color.yellow);
		this.colorMap.put("pink", Color.pink);
		this.colorMap.put("magenta", Color.magenta);
		this.colorMap.put("white", Color.white);
		this.colorMap.put("black", Color.black);
	}

	@Override
	public void personalizar(String lugar, String aspecto) {
		// TODO Auto-generated method stub
		if (lugar.equals("Piernas")){						
			this.colorH = this.colorMap.get(aspecto);
			this.ProductoInfo.put("ColorH", this.colorH);
		}
	}
	
	@Override
	public Object mostrar(String aspecto) {
		// TODO Auto-generated method stub
		return ProductoInfo.get(aspecto);
	}
	
	@Override
	public Parte clonar() {
		// TODO Auto-generated method stub
		return new PiernasMaleL(this);
	}

}
