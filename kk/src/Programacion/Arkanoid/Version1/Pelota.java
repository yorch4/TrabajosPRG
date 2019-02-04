package Programacion.Arkanoid.Version1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Pelota extends Objetos {
protected int vx;
protected int vy;
protected boolean lanzado = false;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"pelota.png"});
	}
	
	public void act() {
		super.act();
		
		x+=vx;
		y-=vy;
		if (x < 0 || x > Stage.WIDTH - getWidth()) 
		  vx = -vx;
		if (y < 0 || y > Stage.HEIGHT) 
			  vy = -vy;
		
	}
	
	public void collision(Objetos a){
		if (a instanceof Ladrillos) {
			vy = -vy;
		}
		if (a instanceof Nave) {
			stage.getSoundCache().playSound("salto.wav");
			vy = -vy;
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

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}
	
}
