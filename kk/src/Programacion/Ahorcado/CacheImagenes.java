package Programacion.Ahorcado;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class CacheImagenes {
	

	private static CacheImagenes cache= null;
	
	
	public static CacheImagenes getCache() {
		if (cache == null) {
			cache = new CacheImagenes();
		}
		return cache;
	}
	
	public BufferedImage getImagen(String farWest) {
		URL url=null;
		try {
			url = getClass().getResource("/Programacion/Ahorcado/" + farWest);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + farWest +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	public BufferedImage getImagenNavidad(String Navidad) {
		URL url=null;
		try {
			url = getClass().getResource("/Programacion/Ahorcado/" + Navidad);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + Navidad +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
}
