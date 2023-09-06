package model.Legos;

import java.awt.Color;
import java.util.HashMap;

import model.Cabeza;
import model.Parte;
import model.Funkos.CabezaMaleF;

public class CabezaMaleL implements Cabeza{
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

	
	public CabezaMaleL() {
		this.x = 210;
		this.y = 60;
		this.h = 90;
		this.w = 90;
		this.xp= 190;
		this.yp = 40;
		this.hp = 130;
		this.wp = 80;
		this.d1 = 25;
		this.d2 = 25;
		this.xo1 = 220;
		this.yo1 = 90;
		this.xo2 = 270;
		this.yo2 = 90;
		this.colorP = Color.black;
		this.colorH = Color.yellow;
		this.colorO = Color.blue;
		this.ProductoInfo = new HashMap<>();
		llenarHm();
	}
	
	private CabezaMaleL(CabezaMaleL cabezaMaleL) {
		// TODO Auto-generated constructor stub
		this.x = cabezaMaleL.x;
		this.y = cabezaMaleL.y;
		this.h = cabezaMaleL.h;
		this.w = cabezaMaleL.w;
		this.xp= cabezaMaleL.xp;
		this.yp = cabezaMaleL.yp;
		this.hp = cabezaMaleL.hp;
		this.wp = cabezaMaleL.wp;
		this.d1 = cabezaMaleL.d1;
		this.d2 = cabezaMaleL.d2;
		this.xo1 = cabezaMaleL.xo1;
		this.yo1 = cabezaMaleL.yo1;
		this.xo2 = cabezaMaleL.xo2;
		this.yo2 = cabezaMaleL.yo2;
		this.colorH = cabezaMaleL.colorH;
		this.colorO = cabezaMaleL.colorO;
		this.colorP = cabezaMaleL.colorP;
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
		this.ProductoInfo.put("ColorP", this.colorP);
		this.ProductoInfo.put("ColorO", this.colorO); 
		
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
		// TODO Auto-generated method stub;
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
	@Override
	public Parte clonar() {
		// TODO Auto-generated method stub
		return new CabezaMaleL(this);
	}

}
