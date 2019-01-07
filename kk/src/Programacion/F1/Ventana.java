package Programacion.F1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;

// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
// libremente.
public class Ventana extends Canvas {

	// Declaración de variables que nos permitirán introducir el ancho y el alto
	// de la ventana
	public static final int ANCHO = 654;
	public static final int ALTO = 673;
	
	// Incorporación de un patrón Singleton a esta clase
	public static Ventana ventana = null;
	
	// Utilización del doble buffer
	private BufferStrategy dobleBuffer;

	
	/**
	 * 
	 */
	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("F1");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,ANCHO,ALTO);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le añadimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tamaño del canvas (this) para que ocupe todo el tamaño de la ventana
		this.setBounds(0,0,ANCHO,ALTO);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);

		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);

		// Inicializo el doble buffer a partir del buffer del propio objeto Canvas
		createBufferStrategy(2);
		dobleBuffer = getBufferStrategy();
		
	}
	
	public void paint(Graphics g) {
		
		//PISTAS
		// Pintando pista 1
		g.setColor(Color.black);
		g.fillRect(10, 20, 500, 100);
		// Pintando pista 2
		g.setColor(Color.black);
		g.fillRect(10, 130, 500, 100);
		// Pintando pista 3
		g.setColor(Color.black);
		g.fillRect(10, 240, 500, 100);
		// Pintando pista 4
		g.setColor(Color.black);
		g.fillRect(10, 350, 500, 100);
		// Pintando pista 5
		g.setColor(Color.black);
		g.fillRect(10, 460, 500, 100);

		
		//COCHES/MOTOS
		//Vehiculo 1 (COCHE)
		g.setColor(Color.black);
		g.fillRect(10, 20, 20, 50);
	}
	

	/**
	 * Patrón Singleton
	 * @return
	 */
	public static Ventana getVentana() {
		if (ventana == null) {
			ventana = new Ventana();
		}
		return ventana;
	}
}
