package model.Funkos;

import java.awt.Color;
import java.util.HashMap;

import model.Cuerpo;

public class CuerpoMaleF implements Cuerpo{
	//Coordenadas Cuerpo
	private int x;
	private int y;
	private int w;
	private int h;
	private int[] brazo1x = {220, 220,210, 200};
	private int[] brazo1y = {0, 40, 70, 60};
	private int[] brazo2x = {290, 290,300,310};
	private int[] brazo2y = {0, 40, 70, 60};

	private Color colorH;
	private HashMap<String, Object> ProductoInfo;

	//Colores 
	private HashMap<String, Color> colorMap = new HashMap<String, Color>();
	
	
	public CuerpoMaleF() {
		this.x = 220;
		this.y = 0;
		this.h = 70;
		this.w = 80;
		this.colorH = Color.blue;
		this.ProductoInfo = new HashMap<>();
		llenarHm();
	}

	private void llenarHm() {		
		this.ProductoInfo.put("x", this.x); 
		this.ProductoInfo.put("y", this.y);
		this.ProductoInfo.put("h", this.h);
		this.ProductoInfo.put("w", this.w);
		this.ProductoInfo.put("brazo1x", this.brazo1x);
		this.ProductoInfo.put("brazo1y", this.brazo1y);
		this.ProductoInfo.put("brazo2x", this.brazo2x);
		this.ProductoInfo.put("brazo2y", this.brazo2y);
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
		if (lugar.equals("Cuerpo")){						
			this.colorH = this.colorMap.get(aspecto);
			this.ProductoInfo.put("ColorH", this.colorH);
		}
	}
	
	@Override
	public Object mostrar(String aspecto) {
		// TODO Auto-generated method stub
		return ProductoInfo.get(aspecto);
	}
}
