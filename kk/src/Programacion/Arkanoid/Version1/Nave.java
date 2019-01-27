package Programacion.Arkanoid.Version1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Nave extends Objetos {
	protected int vx;
	protected static final int PLAYER_SPEED = 4;
	private boolean left,right;
	private int mousePosition;
	
	
	public Nave(Stage stage) {
		super(stage);
		setSpriteName("nave.png");
	}
	
	public void act() {
		super.act();
		x+=vx;

		if (x < 0 ) 
			  x = 0;
		if (x > Stage.WIDTH - getWidth())
			  x = Stage.WIDTH - getWidth();
		
	}
	
	protected void updateSpeed() {
	  	vx=0;
	
	  	if (left) vx = -PLAYER_SPEED;
	  	if (right) vx = PLAYER_SPEED;
	  	
	  }
	  
	  public void keyReleased(KeyEvent e) {
	   	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = false; break; 
			  case KeyEvent.VK_RIGHT : right = false;break;
	   	}
	   	updateSpeed();
	  }
	  
	  public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			  case KeyEvent.VK_LEFT : left = true; break;
			  case KeyEvent.VK_RIGHT : right = true; break;
	  	}
	  	updateSpeed();
	  }
	  
	  public void mouseEntered(MouseEvent e) {
		 mousePosition = e.getX();
		 System.out.println("Estoy dentro");
		 x = mousePosition;
		
	  }
	  public void mouseExited(MouseEvent e) {
			System.out.println("Estoy fuera");
		  }
	
	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
}
