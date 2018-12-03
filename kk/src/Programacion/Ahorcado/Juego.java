package Programacion.Ahorcado;

import javax.swing.JOptionPane;

public class Juego {

			static String palabras[] = new String[] {"pelo","avion","coche","camiseta"};
			static String palabra = palabras[(int) (Math.round(Math.random()* (palabras.length - 1)))];
			static int contErrores = 0;
			static char coincidencias[] = new char [palabra.length()];
			static String respuesta;
			static int contBandera = palabra.length();
			static boolean error=true;
			static String errores[] = new String[6];
			static int indiceArray = 0;
			
			public static void comienzaJuego() {
		
			for (int i = 0; i < palabra.length(); i++) {
				coincidencias[i] = '_';
				System.out.print(" " + coincidencias[i] + " ");
					
			}
			do {
				error=true;
				respuesta = JOptionPane.showInputDialog("Introduce letra o palabra");
			
				if (respuesta.length() > 1 && !respuesta.equals(palabra)) {
					contErrores++;
					errores[indiceArray] = respuesta;
					System.out.println("\n\t\t\t\t Errores: ");
					System.out.print("\t\t\t\t");
					for (int i = 0; i < errores.length; i++) {
						if (errores[i] == null) {
							errores[i] = "";
						}
					System.out.print(errores[i] + " ");
					}
					indiceArray++;
				}	
					
				if (respuesta.length() == 1) {
					System.out.println();
					for (int i = 0; i < palabra.length(); i++) {
							char letra = respuesta.charAt(0);
							char adivina = palabra.charAt(i);
							if (letra == adivina) {
								
								contBandera--;
								coincidencias[i] = letra;
								error = false;
							}
							System.out.print(" " + coincidencias[i] + " ");	
					}
					
					if (error==true) {
						contErrores++;
						errores[indiceArray] = respuesta;
						System.out.println("\n\t\t\t\t Errores: ");
						System.out.print("\t\t\t\t");
						for (int i = 0; i < errores.length; i++) {
							if (errores[i] == null) {
								errores[i] = "";
							}
							System.out.print(errores[i] + " ");
							}
						indiceArray++;
					}
					
				}
				
			} while (!(respuesta.equals(palabra) || contErrores >= 6 || contBandera == 0)); 
			
			if (contErrores >= 6) {
				System.out.println("\nTe has pasado con los errores :(");
			}
			
			if (respuesta.equals(palabra) || contBandera == 0) {
				System.out.println("\nHas ganado");
			}
			
	}

}



