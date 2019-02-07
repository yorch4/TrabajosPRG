package Programacion.Arkanoid.Version1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends Objetos {
protected float vx;
protected float vy;
protected boolean lanzado = false;
TrayectoriaRecta trayectoria = null;
PuntoAltaPrecision coordenadas = null;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"pelota.png"});
	}
	
	public void act() {
		super.act();
	
		if (trayectoria == null) {
			this.coordenadas = new PuntoAltaPrecision(x, y);
			this.trayectoria = new TrayectoriaRecta(-3, coordenadas, true);
		}
		this.x = Math.round(this.coordenadas.x);
		this.y = Math.round(this.coordenadas.y);
		this.coordenadas =  this.trayectoria.getPuntoADistanciaDePunto(this.coordenadas, 3);
		
	//	x+=vx;
	//	y-=vy;
		if (this.x < 0 || this.x > Stage.WIDTH - getWidth()) 
			this.trayectoria.reflejarHorizontalmenteRespectoAPunto(this.coordenadas);
		if (y < 0 || y > Stage.HEIGHT) 
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
	}
	
	public void collision(Objetos a){
		if (a instanceof Ladrillos) {
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
		}
		if (a instanceof Nave) {
			stage.getSoundCache().playSound("salto.wav");
			this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
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
