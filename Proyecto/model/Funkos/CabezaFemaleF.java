package model.Funkos;

import java.awt.Color;
import java.util.HashMap;

import model.Cabeza;

public class CabezaFemaleF implements Cabeza{
	//Coordenadas Cara
	private int x;
	private int y;
	private int h;
	private int w;
	
	//Coordenadas pelo
	private int xp;
	private int yp;
	private int hp;
	private int wp;
	
	//Coordenadas Ojos
	private int d1;
	private int d2;
	private int xo1;
	private int yo1;
	private int xo2;
	private int yo2;
	private HashMap<String, Object> ProductoInfo;
	
	private Color colorH;
	private Color colorO;
	private Color colorP;
	
	//Colores 
	private HashMap<String, Color> colorMap = new HashMap<String, Color>();

	
	public CabezaFemaleF() {
		super();
		this.x = 180;
		this.y = 30;
		this.h = 150;
		this.w = 120;
		this.xp= 170;
		this.yp = 20;
		this.hp = 170;
		this.wp = 170;
		this.d1 = 30;
		this.d2 = 30;
		this.xo1 = 200;
		this.yo1 = 80;
		this.xo2 = 280;
		this.yo2 = 80;
		this.colorH = Color.white;
		this.colorO = Color.magenta;
		this.colorP = Color.black;
		this.ProductoInfo = new HashMap<>();
		llenarHm();
		

	}
	
	private void llenarHm() {		
		this.ProductoInfo.put("x", this.x); 
		this.ProductoInfo.put("y", this.y);
		this.ProductoInfo.put("h", this.h);
		this.ProductoInfo.put("w", this.w);
		this.ProductoInfo.put("xp", this.xp); 
		this.ProductoInfo.put("yp", this.yp);
		this.ProductoInfo.put("hp", this.hp);
		this.ProductoInfo.put("wp", this.wp);
		this.ProductoInfo.put("d1", this.d1);
		this.ProductoInfo.put("d2", this.d2);
		this.ProductoInfo.put("xo1", this.xo1);
		this.ProductoInfo.put("yo1", this.yo1); 
		this.ProductoInfo.put("xo2", this.xo2);
		this.ProductoInfo.put("yo2", this.yo2); 
		this.ProductoInfo.put("ColorH", this.colorH); 
		this.ProductoInfo.put("ColorO", this.colorO); 
		this.ProductoInfo.put("ColorP", this.colorP); 
		
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
		if (lugar.equals("Ojos")){		
			this.colorO = this.colorMap.get(aspecto);
			this.ProductoInfo.put("ColorO", this.colorO);
		}
		if (lugar.equals("piel")){						
			this.colorH = this.colorMap.get(aspecto);
			this.ProductoInfo.put("ColorH", this.colorH);
		}
		if (lugar.equals("pelo")){						
			this.colorP = this.colorMap.get(aspecto);
			this.ProductoInfo.put("ColorP", this.colorP);
		}
	}
	
	@Override
	public Object mostrar(String aspecto) {
		// TODO Auto-generated method stub
		return ProductoInfo.get(aspecto);
	}


}
