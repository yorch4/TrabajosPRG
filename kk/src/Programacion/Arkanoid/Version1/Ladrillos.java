package Programacion.Arkanoid.Version1;

import java.awt.Rectangle;

public class Ladrillos extends Objetos {
	private Explosion explosion;
	
	protected boolean doExplosion = false;
	
	public Ladrillos(Stage stage) {
		super(stage);
	
	}

	public void act() {
		super.act();
		
	}
	public Rectangle getLadoDerecho() {
		return new Rectangle(x + width - 1,y + width - 1,1,height);
	}
	public Rectangle getLadoIzquierdo() {
		return new Rectangle(x ,y, 1,height);
	}
	
	public void collision(Objetos a){
		if (a instanceof Pelota) {
			isTouched = true;
			doExplosion = true;
			stage.getSoundCache().playSound("choque.wav");
		}
	}

	
}
