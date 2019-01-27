package Programacion.Arkanoid.Version1;

import java.awt.image.ImageObserver;

public interface Stage extends ImageObserver {
	public static final int WIDTH=480;
	public static final int HEIGHT=800;
	public static final int SPEED=10;
	public SpriteCache getSpriteCache();

}
