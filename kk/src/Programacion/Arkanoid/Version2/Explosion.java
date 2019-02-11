package Programacion.Arkanoid.Version2;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Explosion extends Actor {
	/**
	 * Constructor
	 */
	public Explosion(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		// Carga de los sprites de la explosi�n
		List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion3.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion2.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion1.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("explosion1.png"));
		this.setSpritesDeAnimacion(nuevosSprites);
		// Sprite actual
		this.spriteActual = this.getSpritesDeAnimacion().get(0);
		// Velocidad de cambio de sprite
		this.velocidadDeCambioDeSprite = 5;
	}
	

	/**
	 * M�todo que se llamar� para cada actor, en cada refresco de pantalla del juego
	 */
	@Override
	public void act() {
		super.act();
		if (this.spriteActual.equals(this.spritesDeAnimacion.get(this.spritesDeAnimacion.size()-1))) {
			this.eliminar();
		}
	}

}
