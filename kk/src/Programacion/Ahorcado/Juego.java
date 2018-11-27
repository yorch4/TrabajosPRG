package Programacion.Ahorcado;

import javax.swing.JOptionPane;

public class Juego {

	public static void main(String[] args) {
			
			String palabras[] = new String[] {"pelo","avion","coche","camiseta"};
			String palabra = palabras[(int) (Math.round(Math.random()* (palabras.length - 1)))];
			int errores[] = new int[6];
			int contErrores = 0;
			System.out.println(palabra);
			
			for (int i = 0; i < palabra.length(); i++) {
				char coincidencias[] = new char [palabra.length()];
				coincidencias[i] = '-';
				System.out.print(coincidencias[i]);
				
			}
			String respuesta = JOptionPane.showInputDialog("Introduce letra o palabra");
			
			
			if (respuesta.equals(palabra)) {
				System.out.println("\nEnhorabuena, has acertado");
			} else {
				if (respuesta.length() == 1) {
					
				} else {
					contErrores++;
				}
			}
	}

}
