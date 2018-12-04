package Programacion.Ahorcado;

import javax.swing.JOptionPane;

public class Juego {

			static String palabras[] = new String[] {"pelo","avion","coche","camiseta"};
			static String palabra = palabras[(int) (Math.round(Math.random()* (palabras.length - 1)))];
			static int contErrores = 0;
			static char coincidencias[] = new char [palabra.length()];
			static String respuesta;
			static boolean error=true;
			static String errores[] = new String[6];
			static int indiceArray = 0;
			static boolean ganar = false;
			static boolean perder = false;
			static boolean god = false;
			static boolean navidad = false;
			static boolean bandera = true;
			static String palabrasNavidad[] = new String[] {"nieve","regalo","reno","familia"};
			
			public static void comienzaJuego() {
		
			for (int i = 0; i < palabra.length(); i++) {
				coincidencias[i] = '_';
				System.out.print(" " + coincidencias[i] + " ");
			}

			do {
				bandera=true;
				error=true;
				respuesta = JOptionPane.showInputDialog("Introduce letra o palabra");
				
				//CHEAT 1
				if (respuesta.equals("hint")) {
					char letra = palabra.charAt((int) Math.round(Math.random()* (palabra.length() - 1)));
					for (int i = 0; i < palabra.length(); i++) {
						char adivina = palabra.charAt(i);
						if (letra == adivina) {	
							coincidencias[i] = letra;
							Ventana.getVentana().repaint();
						}
						System.out.print(" " + coincidencias[i] + " ");	
					}
				}
				
				//CHEAT 2
				if (respuesta.equals("GOD")) {
					contErrores = 7;
					god = true;
				}
				
				//CHEAT 3
				if (respuesta.equals("NAVIDAD")) {
					contErrores = 0;
					palabra = palabrasNavidad[(int) (Math.round(Math.random()* (palabrasNavidad.length - 1)))];
					navidad = true;
					Ventana.getVentana().repaint();
					comienzaJuego();
					
				}
			
				//Suma error si la palabra no es correcta
				if (respuesta.length() > 1 && !respuesta.equals(palabra) && god == false) {
					contErrores++;
					Ventana.getVentana().repaint();
					errores[indiceArray] = respuesta;
					System.out.println("\n\t\t\t\t Errores: ");
					System.out.print("\t\t\t\t");
					for (int i = 0; i < errores.length; i++) {
					System.out.print(errores[i] + " ");
					}
					indiceArray++;
				}	
				
				//Compara las letras 
				if (respuesta.length() == 1) {
					System.out.println();
					for (int i = 0; i < palabra.length(); i++) {
							char letra = respuesta.charAt(0);
							char adivina = palabra.charAt(i);
							if (letra == adivina) {	
								coincidencias[i] = letra;
								error = false;
								Ventana.getVentana().repaint();
							}
							System.out.print(" " + coincidencias[i] + " ");	
					}
					
					//Suma error si la letra no es correcta
					if (error==true && god == false) {
						contErrores++;
						Ventana.getVentana().repaint();
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
				
				for (int i=0; i < coincidencias.length; i++) {
					if (coincidencias[i] == '_') {
						bandera = false;
					}
				}
				
			} while (!(respuesta.equals(palabra) || contErrores == 6 || bandera == true)); 
			
			bandera = false;
			
			if (contErrores >= 6 && god == false) {
				perder = true;
				System.out.println("\nHas perdido");
			}
			
			if (respuesta.equals(palabra)) { 
				ganar = true;
				for (int i=0; i<palabra.length(); i++) {
					coincidencias[i]=palabra.charAt(i);
				}
				Ventana.getVentana().repaint();
			}
			if (bandera == false && !(contErrores >= 6)) {
				ganar = true;
				System.out.println("\nHas ganado");
				Ventana.getVentana().repaint();
			}
			
	}

}



