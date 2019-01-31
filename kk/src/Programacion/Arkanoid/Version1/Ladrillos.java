package Programacion.Arkanoid.Version1;

public class Ladrillos extends Objetos {
	private Explosion explosion;
	
	protected boolean doExplosion = false;
	
	public Ladrillos(Stage stage) {
		super(stage);
	
	}

	public void act() {
		super.act();
		
	}
	
	public void collision(Objetos a){
		if (a instanceof Pelota) {
			isTouched = true;
			doExplosion = true;
			
		}
	}
	
}
