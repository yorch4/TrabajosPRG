package Programacion.Ahorcado;

	import java.awt.Canvas;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics;
	import javax.swing.JFrame;
	import javax.swing.JPanel;



	// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
	// libremente.
	public class Ventana extends Canvas {

		// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
		// de la ventana
		public static final int WIDTH = 640;
		public static final int HEIGHT = 480;
		public static Ventana ventana = null;
		
		public Ventana () {
			// La clase JFrame nos permite mostrar una ventana en pantalla
			JFrame ventana = new JFrame("El juego del ahorcado");
			// Establecemos las dimensiones que queremos que tenga
			ventana.setBounds(0,0,WIDTH,HEIGHT);
			
			// Obtengo una referencia al panel principal de la ventana.
			// Todas las ventanas tienen un panel principal	
			JPanel panel = (JPanel)ventana.getContentPane();

			// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
			panel.add(this);

			// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
			this.setBounds(0,0,WIDTH,HEIGHT);
			
			// Provocamos que el programa se acabe cuando cerramos la ventana 
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Hacemos visible la ventana.
			ventana.setVisible(true);
			// Evitamos que la ventana pueda redimensionarse.
			ventana.setResizable(false);
		}
		
		@Override
		public void paint(Graphics g) {
			
			//NAVIDAD DESACTIVADO
			if (Juego.navidad == false) {
				//Imagen
				g.drawImage(CacheImagenes.getCache().getImagen("farWest.png"), 0, 0, this);
				
				String palabra = "";
				String error = "";
				//Imprimo "Palabra:"
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.white);
				g.drawString("Palabra:", 200, 300);
				
				for (int i=0; i<Juego.coincidencias.length;i++) {
					palabra+=Juego.coincidencias[i] + " ";
				}
				//Imprimo la palabra a adivinar
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.white);
				g.drawString(palabra, 300, 430);
				
				for (int i=0; i<Juego.errores.length;i++) {
				if (Juego.contErrores == 0) {
							Juego.errores[i] = "";	
					}
					error+=Juego.errores[i] + " ";	
				}
				
				//Imprimo "Errores:"
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.red);
				g.drawString("Errores:", 50, 15);
				//Imprimo los errores
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.red);
				g.drawString(error, 50, 50);
				
				g.setColor(Color.decode("#7f5900"));
				g.fillRect(438, 50, 3, 70);
				
				g.setColor(Color.black);
				g.fillRect(100, 50, 350, 10);
				
				g.setColor(Color.black);
				g.fillRect(100, 50, 20, 350);
				
				g.setColor(Color.black);
				g.fillRect(50, 400, 140, 20);
					
				if (Juego.contErrores >= 1 && Juego.contErrores <=6) {
					//Cabeza
					g.setColor(Color.decode("#ffcc99"));
					g.fillOval(416, 100, 50, 50);
				
					//Ojo izq
					g.setColor(Color.white);
					g.fillOval(425, 115, 10, 10);
					
					//Ojo der
					g.setColor(Color.white);
					g.fillOval(450, 115, 10, 10);
					
					//Pupila izq
					g.setColor(Color.black);
					g.fillOval(427, 118, 5, 5);
					
					//Pupila der
					g.setColor(Color.black);
					g.fillOval(452, 118, 5, 5);
					
					//Boca
					g.setColor(Color.red);
					g.fillOval(437, 130, 10, 10);
				}
				
				if (Juego.contErrores >= 2 && Juego.contErrores <=6) {
					//Torso
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(420, 150, 45, 120);
				}
				
				if (Juego.contErrores >= 3 && Juego.contErrores <=6) {
					//Brazo der
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(466, 150, 20, 90);
				}
				
				if (Juego.contErrores >= 4 && Juego.contErrores <=6) {
					//Brazo izq
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(399, 150, 20, 90);
				}
				
				if (Juego.contErrores >= 5 && Juego.contErrores <=6) {
					//Pierna der
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(445, 271, 20, 80);
				}
					
				
				if (Juego.contErrores == 6) {
					//Pierna izq
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(420, 271, 20, 80);
					
				}
				//Has ganado
				if (Juego.ganar == true) {
					g.setFont(new Font("Console", Font.BOLD, 90));
					g.setColor(Color.green);
					g.drawString("HAS GANADO", 25, 200);
				}
				//Has perdido
				if (Juego.perder == true) {
					g.setFont(new Font("Console", Font.BOLD, 90));
					g.setColor(Color.red);
					g.drawString("HAS PERDIDO", 5, 200);	
					g.setFont(new Font("Console", Font.BOLD, 70));
					g.setColor(Color.red);
					g.drawString(Juego.palabra, 200, 350);
					}
				}
			
			
			
			//NAVIDAD ACTIVADO
			if (Juego.navidad == true) {
				//Imagen
				g.drawImage(CacheImagenes.getCache().getImagen("Navidad.png"), 0, 0, this);
				
				String palabra = "";
				String error = "";
				//Imprimo "Palabra:"
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.black);
				g.drawString("Palabra:", 200, 300);
				
				for (int i=0; i<Juego.coincidencias.length;i++) {
					palabra+=Juego.coincidencias[i] + " ";
				}
				//Imprimo la palabra a adivinar
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.black);
				g.drawString(palabra, 200, 350);
				
				for (int i=0; i<Juego.errores.length;i++) {
				if (Juego.contErrores == 0) {
							Juego.errores[i] = "";	
					}
					error+=Juego.errores[i] + " ";	
				}
				
				//Imprimo "Errores:"
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.red);
				g.drawString("Errores:", 50, 15);
				//Imprimo los errores
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.red);
				g.drawString(error, 50, 50);
				
				g.setColor(Color.decode("#7f5900"));
				g.fillRect(438, 50, 3, 70);
				
				g.setColor(Color.blue);
				g.fillRect(100, 50, 350, 10);
				
				g.setColor(Color.blue);
				g.fillRect(100, 50, 20, 350);
				
				g.setColor(Color.blue);
				g.fillRect(50, 400, 140, 20);
					
				if (Juego.contErrores >= 1 && Juego.contErrores <=6) {
					//Cabeza
					g.setColor(Color.decode("#ffcc99"));
					g.fillOval(416, 100, 50, 50);
				
					//Ojo izq
					g.setColor(Color.white);
					g.fillOval(425, 115, 10, 10);
					
					//Ojo der
					g.setColor(Color.white);
					g.fillOval(450, 115, 10, 10);
					
					//Pupila izq
					g.setColor(Color.black);
					g.fillOval(427, 118, 5, 5);
					
					//Pupila der
					g.setColor(Color.black);
					g.fillOval(452, 118, 5, 5);
					
					//Boca
					g.setColor(Color.red);
					g.fillOval(437, 130, 10, 10);
					
					//CabezaN
					g.setColor(Color.red);
					g.fillRect(420, 93, 43, 22);
					
					g.setColor(Color.white);
					g.fillRect(416, 104, 50, 12);
				}
				
				if (Juego.contErrores >= 2 && Juego.contErrores <=6) {
					//Torso
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(420, 150, 45, 120);
					
					//TorsoN
					g.setColor(Color.red);
					g.fillRect(415, 150, 53, 120);
					
					g.setColor(Color.white);
					g.fillRect(417, 142, 50, 10);
					
					g.setColor(Color.white);
					g.fillRect(440, 170, 5, 5);
					
					g.setColor(Color.white);
					g.fillRect(440, 190, 5, 5);
					
					g.setColor(Color.white);
					g.fillRect(440, 210, 5, 5);
					
					g.setColor(Color.white);
					g.fillRect(440, 230, 5, 5);
				}
				
				if (Juego.contErrores >= 3 && Juego.contErrores <=6) {
					//Brazo der
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(466, 150, 20, 90);
					
					//BrazoN
					g.setColor(Color.red);
					g.fillRect(466, 150, 20, 90);
					
					g.setColor(Color.white);
					g.fillRect(466, 230, 20, 10);
				}
				
				if (Juego.contErrores >= 4 && Juego.contErrores <=6) {
					//Brazo izq
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(399, 150, 20, 90);
					
					//BrazoN
					g.setColor(Color.red);
					g.fillRect(399, 150, 20, 90);
					
					g.setColor(Color.white);
					g.fillRect(399, 230, 20, 10);
				}
				
				if (Juego.contErrores >= 5 && Juego.contErrores <=6) {
					//Pierna der
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(445, 271, 20, 80);
					
					//PiernaN
					g.setColor(Color.red);
					g.fillRect(445, 271, 20, 80);
					
					g.setColor(Color.black);
					g.fillRect(445, 345, 20, 10);
					
					g.setColor(Color.decode("#7f4b0c"));
					g.fillRect(414, 264, 54, 8);
				}
					
				
				if (Juego.contErrores == 6) {
					//Pierna izq
					g.setColor(Color.decode("#ffcc99"));
					g.fillRect(420, 271, 20, 80);
					
					//PiernaN
					g.setColor(Color.red);
					g.fillRect(420, 271, 20, 80);
					
					g.setColor(Color.black);
					g.fillRect(420, 345, 20, 10);
					
				}
				//Has ganado
				if (Juego.ganar == true) {
					g.setFont(new Font("Console", Font.BOLD, 90));
					g.setColor(Color.green);
					g.drawString("HAS GANADO", 25, 200);
				}
				//Has perdido
				if (Juego.perder == true) {
					g.setFont(new Font("Console", Font.BOLD, 90));
					g.setColor(Color.red);
					g.drawString("HAS PERDIDO", 5, 200);	
					g.setFont(new Font("Console", Font.BOLD, 70));
					g.setColor(Color.red);
					g.drawString(Juego.palabra, 200, 350);
					}
				}
			}
		
			
		
		public static Ventana getVentana() {
			if (ventana == null) {
				ventana = new Ventana();
			}
			return ventana;
		}

	}

