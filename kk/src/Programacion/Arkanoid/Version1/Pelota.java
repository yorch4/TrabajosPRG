package Programacion.Arkanoid.Version1;

public class Pelota extends Objetos {
protected int vx;
protected int vy;
	
	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"pelota.png"});
	}
	
	public void act() {
		x+=vx;
		y+=vy;
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
			vy = -vy;
		}
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
	
	public int getVy() { return vy; }
	public void setVy(int i) {vy = i;	}
	
}
