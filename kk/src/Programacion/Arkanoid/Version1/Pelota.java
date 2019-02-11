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
			choqueLadrillo((Ladrillos) a);
		}
		
		if (a instanceof Nave) {
			stage.getSoundCache().playSound("salto.wav");
			//this.trayectoria.reflejarVerticalmenteRespectoAPunto(this.coordenadas);
			choqueNave((Nave)a);
		}
	}
	
	
	
	public void choqueLadrillo(Ladrillos a) {
		Rectangle ladoDerecho  = new Rectangle(a.x + a.width - 1, a.y, 1, a.height);
		Rectangle ladoIzquierdo = new Rectangle(a.x, a.y, 1, a.height);
		Rectangle ladoArriba = new Rectangle(a.x, a.y + 1, a.width, 1);
		Rectangle ladoAbajo = new Rectangle(a.x, a.y + a.height - 1, a.width, 1);
		boolean esquina = false;
		
		if (this.getBounds().intersects(ladoAbajo) && this.getBounds().intersects(ladoIzquierdo)) {
			esquina = true;
			this.trayectoria.setPendiente(-1.5f, coordenadas);
		}
		if (this.getBounds().intersects(ladoAbajo) && this.getBounds().intersects(ladoDerecho)) {
			esquina = true;
			this.trayectoria.setPendiente(1.5f, coordenadas);
		}
		
		if (this.getBounds().intersects(ladoIzquierdo) && esquina == false) {
			this.trayectoria.reflejarHaciaIzquierda(this.coordenadas);
		}
		if (this.getBounds().intersects(ladoDerecho) && esquina == false) {
			this.trayectoria.reflejarHaciaDerecha(this.coordenadas);
		}
		if (this.getBounds().intersects(ladoArriba) && esquina == false) {
			this.trayectoria.reflejarHaciaArriba(this.coordenadas);
		}
		if (this.getBounds().intersects(ladoAbajo) && esquina == false) {
			this.trayectoria.reflejarHaciaAbajo(this.coordenadas);
		}
	}
	
	public void choqueNave (Nave a) {
		Rectangle ladoDerecho  = new Rectangle(a.x + a.width - 8, a.y, 8, a.height);
		Rectangle ladoIzquierdo = new Rectangle(a.x, a.y, 8, a.height);
		Rectangle ladoMedio = new Rectangle(a.x + 9, a.y, a.width - 8, a.height);
		
		boolean borde = false;
		
		if (this.getBounds().intersects(ladoIzquierdo)) {
			this.trayectoria.setPendiente(0.9f, coordenadas);
			borde = true;
		}
		
		if (this.getBounds().intersects(ladoDerecho)) {
			this.trayectoria.setPendiente(-0.9f, coordenadas);
			borde = true;
		}
		
		if (this.getBounds().intersects(ladoMedio) && borde == false) {
			this.trayectoria.reflejarHaciaArriba(coordenadas);
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
