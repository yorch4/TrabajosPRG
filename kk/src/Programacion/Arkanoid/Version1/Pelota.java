package Programacion.Arkanoid.Version1;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends Objetos {
protected float vx;
protected float vy;
protected boolean lanzado = false;
TrayectoriaRecta trayectoria = null;
PuntoAltaPrecision coordenadas = null;
float pixelFrame = 3;

	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"pelota.png"});
	}
	
	public void act() {
		super.act();
	
		if (trayectoria == null) {
			this.coordenadas = new PuntoAltaPrecision(x, y);
			this.trayectoria = new TrayectoriaRecta(-3f, coordenadas, true);
		}
		
		this.coordenadas =  this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, pixelFrame);
		
		if (pixelFrame < 8) {
			pixelFrame *= 1.00035;
		}
		
		this.x = Math.round(this.coordenadas.x);
		this.y = Math.round(this.coordenadas.y);
	
		if (this.x < 0 || this.x > Stage.WIDTH - getWidth()) 
			this.trayectoria.reflejarHorizontalmenteRespectoAPunto(coordenadas);
		if (y < 0 || y > Stage.HEIGHT) 
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(coordenadas);
	}
	
	public void collision(Objetos a){
		if (a instanceof Ladrillos) {
			choqueLadrillo(Ladrillo o);
		}
		
		if (a instanceof Nave) {
			stage.getSoundCache().playSound("salto.wav");
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
		}
	}
	
	
	
	public void choqueLadrillo(Ladrillo o) {
		Rectangle ladoDerecho  = new Rectangle(x + width - 1, y, 1, height);
		Rectangle ladoIzquierdo = new Rectangle(x, y, 1, height);
		Rectangle ladoArriba = new Rectangle(x, y + 1, width, 1);
		Rectangle ladoAbajo = new Rectangle(x, y + height - 1, width, 1);
		boolean arriba = false, abajo = false, derecha = false, izquierda = false;
		
		
		if (Ventana.getInstancia().pelotaBounds.intersects(ladoArriba)) {
			arriba = true;
		}
		if (Ventana.getInstancia().pelotaBounds.intersects(ladoAbajo)) {
			abajo = true;
		}
		if (Ventana.getInstancia().pelotaBounds.intersects(ladoDerecho)) {
			derecha = true;
		}
		if (Ventana.getInstancia().pelotaBounds.intersects(ladoIzquierdo)) {
			izquierda = true;
		}
		
		if (izquierda == true && abajo == true) {
			
		}
	}
	
	 public void keyPressed(KeyEvent e) {
		  	switch (e.getKeyCode()) {
				  case KeyEvent.VK_SPACE : lanzado = true;	  
		  	}
		  }
	 public void mouseClicked(MouseEvent e) {
		  	switch (e.MOUSE_CLICKED) {
				  case MouseEvent.MOUSE_CLICKED : lanzado = true;	  
		  	}
		  }

	public float getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public float getVy() { return vy; }
	public void setVy(int i) {vy = i;	}
	
}
