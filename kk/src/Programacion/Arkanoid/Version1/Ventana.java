package Programacion.Arkanoid.Version1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends Canvas {
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	public static final int SPEED = 10;
	public int posX,posY,vX, vY;
	
	public BufferStrategy strategy;
	public HashMap sprites;
	
	public Ventana() {
		sprites = new HashMap();
		BufferedImage buffer;
		posX = WIDTH/2;
		posY = HEIGHT/2;
		vX = 2;
		vY = 2;
		
		buffer = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,WIDTH,HEIGHT);
		panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
	}
	
	public BufferedImage loadImage(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getSprite(String nombre) {
		BufferedImage img = (BufferedImage)sprites.get(nombre);
		if (img == null) {
			img = loadImage("../res/"+nombre);
			sprites.put(nombre,img);
		}
		return img;
	}
	
	public void initWorld() {
	    
		}
	
	public void game() {
		initWorld();
		while (isVisible()) {
			updateWorld();
			paintWorld();
			try { 
				 Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	public void paintWorld() {
		Graphics g = strategy.getDrawGraphics();
		g.setColor(Color.white);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(getSprite("pelota.png"), posX, posY,this);
		strategy.show();
	}
	
	public void updateWorld() {
		posX += vX;
		posY += vY;
		if (posX < 0 || posX > (WIDTH - 23)) vX = -vX;
		if (posY < 0 || posY > (HEIGHT - 35)) vY = -vY;
	}
	
	public static void main(String[] args) {
		Ventana ven = new Ventana();
		ven.game();
	}
	
}



