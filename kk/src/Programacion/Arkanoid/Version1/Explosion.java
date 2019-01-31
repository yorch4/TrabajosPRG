package Programacion.Arkanoid.Version1;

public class Explosion extends Objetos {

	String res[] = new String[] { "explosion1.png", "explosion2.png", "explosion3.png", "explosion3.png",
			"explosion2.png", "explosion1.png"};

	public Explosion(Stage stage) {
		super(stage);
		setSpriteNames(res);
		setFrameSpeed(3);
	}

	public void act() {
		super.act();
		if (currentFrame == (res.length - 1)) {
			isTouched = true;
		}
	}

}
