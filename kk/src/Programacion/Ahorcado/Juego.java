package Programacion.Ahorcado;

import javax.swing.JOptionPane;

public class Juego {

			static String palabras[] = new String[] {"aburrido", "acido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "comun", "conocido", "contento", "corto", "debil", "delgado", "derecho", "diferente", "dificil", "dulce", "duro", "enfermo", "estrecho", "exterior", "facil", "falso", "famoso", "feo", "final", "fresco", "frio", "fuerte", "gordo", "grande", "guay", "guapo", "humedo", "igual", "imposible", "interesante", "interior", "inutil", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "pequeño", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "proximo", "rapido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinverguenza", "social", "solo", "soso", "timido", "tonto", "triste", "util", "verdadero", "verde", "viejo", "vivo", "crema", "explosion", "navaja", "universidad", "llaves", "papa", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "musica", "habitacion", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petroleo", "debate", "ruido", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipopotamo", "arbol", "discurso","lentejas", "reloj", "desodorante", "montañas", "moto", "partido", "fiesta", "cafe", "guitarra", "martillo", "lapicera", "letra", "libreria", "rueda", "camisa", "sillon", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "cesped", "parlante", "pestaña", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "telefono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "boligrafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "periodico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zoologico", "deporte", "recipiente", "fotografia", "ave", "refugio", "pantalon", "carne", "nieve", "humedad", "pistola", "tristeza", "sofa", "cama", "campera", "coche", "cinturon", "famoso", "madera", "piso", "maletin", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "plastico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estadistica", "mensaje", "rey", "presidencia", "colegio", "lampara", "flor", "tornillo", "abuela", "satelite"};
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
			static String palabrasNavidad[] = new String[] {"nieve","regalo","reno","familia", "pavo"};
			
			
			public static void comienzaJuego() {
				System.out.println(palabra);
				
			for (int i = 0; i < palabra.length(); i++) {
				coincidencias[i] = '_';
				System.out.print(" " + coincidencias[i] + " ");
				Ventana.getVentana().repaint();
			}

			do {
				bandera=true;
				error=true;
				respuesta = JOptionPane.showInputDialog("Introduce letra o palabra");
				
				//CHEAT 1
				if (respuesta.equalsIgnoreCase("hint")) {
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
				if (respuesta.equalsIgnoreCase("GOD")) {
					contErrores = 0;
					god = true;
				}
				
				//CHEAT 3
				if (respuesta.equalsIgnoreCase("NAVIDAD")) {
					contErrores = 0;
					for (int i = 0; i < palabra.length(); i++) {
						coincidencias[i] = ' ';
						System.out.print(" " + coincidencias[i] + " ");
					}
					palabra = palabrasNavidad[(int) (Math.round(Math.random()* (palabrasNavidad.length - 1)))];
					navidad = true;
					System.out.println();
					Ventana.getVentana().repaint();
					comienzaJuego();
					
				}
			
				//Suma error si la palabra no es correcta
				if (respuesta.length() > 1 && !respuesta.equalsIgnoreCase(palabra) && god == false) {
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
				
			} while (!(respuesta.equalsIgnoreCase(palabra) || contErrores == 6 || bandera == true)); 
			
			bandera = false;
			
			if (contErrores >= 6 && god == false) {
				perder = true;
				System.out.println("\nHas perdido");
			}
			
			if (respuesta.equalsIgnoreCase(palabra)) { 
				ganar = true;
				for (int i=0; i<palabra.length(); i++) {
					coincidencias[i]=palabra.charAt(i);
				}
				Ventana.getVentana().repaint();
			}
			if (bandera == false && !(contErrores == 6)) {
				ganar = true;
				System.out.println("\nHas ganado");
				Ventana.getVentana().repaint();
			}
			
	}

}



