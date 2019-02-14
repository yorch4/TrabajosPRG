package Programacion.Arkanoid.Version2;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a cada ladrillo de los que pondremos sobre la pantalla
 * @author R
 *
 */
public class Ladrillo extends Actor {
	// Damos un ancho y un alto espec�fico al ladrillo. Suponemos que todos los ladrillos ser�n iguales
	public static final int ANCHO = 32;
	public static final int ALTO = 32;
	public static final int ESPACIO_ENTRE_LADRILLOS = 2;
	public int numImagen;
	public boolean listoParaRomper = false;
	
	/**
	 * Constructor
	 */
	public Ladrillo() {
		super();
		this.x = 10;
		this.y = 10;
		this.ancho = ANCHO;
		this.alto = ALTO;
	}

	/**
	 * Constructor parametrizado
	 * @param x
	 * @param y
	 * @param bufferedImage
	 */
	public Ladrillo(int x, int y, int imagen) {
		this.x = x;
		this.y = y;
		this.ancho = ANCHO;
		this.alto = ALTO;
	    // Array con los diferentes colores, uno por cada fila
	    List<BufferedImage> nuevosSprites = new ArrayList<BufferedImage>();
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("redBricks.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("blueBricks.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("pinkBricks.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("yellowBricks.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("greenBricks.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("ironBrick.png"));
		nuevosSprites.add(CacheRecursos.getInstancia().getImagen("rompeBrick.png"));
		
		this.spriteActual = nuevosSprites.get(imagen);
		numImagen = imagen;
	}
	/**
	 * Colisi�n detectada
	 */
	@Override
	public void colisionProducidaConOtroActor(Actor actorColisionado) {
		super.colisionProducidaConOtroActor(actorColisionado);
		// Si un ladrillo detecta una colisi�n con un objeto de tipo "Bola", debe desaparecer
		if (numImagen!= 5) {
			if (actorColisionado instanceof Bola) {
				if (numImagen !=6 || listoParaRomper == true) {
					eliminar();
					// Creo un nuevo actor de tipo Explosion y lo centr� respecto a la posici�n del ladrillo
					Explosion explosion = new Explosion(this.getX(), this.getY());
					explosion.setX(this.x + Ladrillo.ANCHO / 2 - explosion.getAncho() / 2);
					Arkanoid.getInstancia().agregarActor(explosion);
					// Reproduzco el sonido de la explisi�n
					CacheRecursos.getInstancia().playSonido("choque.wav");
				} else {
					CacheRecursos.getInstancia().playSonido("choqueRomper.wav");
					listoParaRomper = true;
				}
			}
		} else {
			CacheRecursos.getInstancia().playSonido("choqueHierro.wav");
		}
	}
}
