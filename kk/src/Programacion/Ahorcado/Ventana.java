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
			
			
			
			//Imagen
			g.drawImage(CacheImagenes.getCache().getImagen("farWest.png"), 0, 0, this);
			
			String palabra = "";
			String error = "";

				for (int i=0; i<Juego.coincidencias.length;i++) {
					palabra+=Juego.coincidencias[i] + " ";
				}
				
				g.setFont(new Font("Console", Font.BOLD, 20));
				g.setColor(Color.red);
				g.drawString(palabra, 200, 350);
				
				for (int i=0; i<Juego.errores.length;i++) {
					error+=Juego.errores[i] + " ";
					if (error == null) {
						error = "";
					}
				}
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
		
			//Torso
			g.setColor(Color.decode("#ffcc99"));
			g.fillRect(420, 150, 45, 120);
			
			//Brazo der
			g.setColor(Color.decode("#ffcc99"));
			g.fillRect(466, 150, 20, 90);
			
			//Brazo izq
			g.setColor(Color.decode("#ffcc99"));
			g.fillRect(399, 150, 20, 90);
			
			//Pierna der
			g.setColor(Color.decode("#ffcc99"));
			g.fillRect(445, 271, 20, 80);
			
			//Pierna izq
			g.setColor(Color.decode("#ffcc99"));
			g.fillRect(420, 271, 20, 80);
			
			
		}
		public static Ventana getVentana() {
			if (ventana == null) {
				ventana = new Ventana();
			}
			return ventana;
		}

	}

