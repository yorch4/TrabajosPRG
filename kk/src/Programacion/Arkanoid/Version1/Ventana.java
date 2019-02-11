package Programacion.Arkanoid.Version1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ventana extends Canvas implements Stage{
	public static final int FPS=100;
	private BufferStrategy strategy;
	private long cincoSegundos;
	public static long millisAntes;
	private SoundCache soundCache;
	private SpriteCache spriteCache;
	private Nave nave;
	private Pelota pelota;
	private List<Explosion> explosion = new ArrayList<Explosion>();
	private List<Objetos> objetos = new ArrayList<Objetos>();
	private static Ventana instancia = null;

	public static Ventana getInstancia() {
		if (instancia == null) {
			instancia = new Ventana();
		}
		return instancia;
	}
	
	public Ventana() {
		spriteCache = new SpriteCache();
		soundCache = new SoundCache();
		
		JFrame ventana = new JFrame("Arkanoid Mario Bros");
		JPanel panel = (JPanel) ventana.getContentPane();
		setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH, Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0, 0, Stage.WIDTH, Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		
		this.addKeyListener (new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				nave.keyReleased(e);
			}
			public void keyPressed(KeyEvent e) {
				nave.keyPressed(e);
				pelota.keyPressed(e);
			}
		});

		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved (MouseEvent e) {
				nave.mouseMoved(e);
			}
		
		});
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				pelota.mouseClicked(e);
			}
		
		});
	}

	public void initWorld() {
		objetos = new ArrayList();
		explosion = new ArrayList();
		soundCache.loopSound("musica.wav");
		
		int alturaBloquesR = 0;
		int alturaBloquesA = 0;
		int alturaBloquesRs = 0;
		int alturaBloquesAz = 0;
		
		int anchura = 0;
		int anchoTotalR = 0;
		int anchoTotalA = 0;
		int anchoTotalRs = 0;
		int anchoTotalAz = 0;
		int anchoTotalV = 0;
		 
		 for (; anchoTotalR + anchura < Stage.WIDTH;){
		      LadrillosRojos ladrilloR = new LadrillosRojos(this);
		     anchura = ladrilloR.getWidth();
		      ladrilloR.setX(2 + anchoTotalR);
		      ladrilloR.setY((Stage.HEIGHT / 6) - (Stage.WIDTH / 6) );
		      alturaBloquesR = ladrilloR.getY() + 2;
		      objetos.add(ladrilloR);
		      
		      anchoTotalR =2 +  anchoTotalR + ladrilloR.getWidth();
		    }
		 for (; anchoTotalA + anchura < Stage.WIDTH;){
		      LadrillosAmarillos ladrilloA = new LadrillosAmarillos(this);
		      anchura = ladrilloA.getWidth();
		      ladrilloA.setX(2 + anchoTotalA);
		      ladrilloA.setY(alturaBloquesR + ladrilloA.getHeight());
		      alturaBloquesA = ladrilloA.getY() + 2;
		      objetos.add(ladrilloA);
		      
		      anchoTotalA =2 +  anchoTotalA + ladrilloA.getWidth();
		    }
		 for (; anchoTotalRs + anchura < Stage.WIDTH;){
		      LadrillosRosas ladrilloRs = new LadrillosRosas(this);
		      anchura = ladrilloRs.getWidth();
		      ladrilloRs.setX(2 + anchoTotalRs);
		      ladrilloRs.setY(alturaBloquesA + ladrilloRs.getHeight());
		      alturaBloquesRs = ladrilloRs.getY() + 2;
		      objetos.add(ladrilloRs);
		      
		      anchoTotalRs =2 +  anchoTotalRs + ladrilloRs.getWidth();
		    }
		 for (; anchoTotalAz + anchura < Stage.WIDTH;){
		      LadrillosAzules ladrilloAz = new LadrillosAzules(this);
		      anchura = ladrilloAz.getWidth();
		      ladrilloAz.setX(2 + anchoTotalAz);
		      ladrilloAz.setY(alturaBloquesRs + ladrilloAz.getHeight());
		      alturaBloquesAz = ladrilloAz.getY() + 2;
		      objetos.add(ladrilloAz);
		      
		      anchoTotalAz =2 +  anchoTotalAz + ladrilloAz.getWidth();
		    }
		 for (; anchoTotalV + anchura < Stage.WIDTH;){
		      LadrillosVerdes ladrilloV = new LadrillosVerdes(this);
		      anchura = ladrilloV.getWidth();
		      ladrilloV.setX( 2 + anchoTotalV );
		      ladrilloV.setY(alturaBloquesAz + ladrilloV.getHeight());
		      objetos.add(ladrilloV);
		      
		      anchoTotalV =2 +  anchoTotalV + ladrilloV.getWidth();
		    }
		 
		nave = new Nave(this);
		nave.setX(Stage.WIDTH / 2 - (nave.getWidth() / 2));
		nave.setY(Stage.WIDTH + (Stage.WIDTH / 3));
			
		pelota = new Pelota(this);
		pelota.setX(nave.x + nave.getWidth() + 2);
		pelota.setY(nave.y + pelota.getHeight());
		pelota.setVx(2);
		pelota.setVy(2);

		
		
	

	}

	public void updateWorld() { 
		if (pelota.lanzado) {
			soundCache.playSound("salto.wav");
			pelota.act();
		} else {
			if (cincoSegundos >= 5000) {
				pelota.lanzado = true;
			} else {
				pelotaPegada();
			}
		}
		nave.act();
		for (int i = 0; i < objetos.size(); i++) {
			Objetos ladrillos = (Objetos)objetos.get(i);
			if (ladrillos.isTouched) {
				Explosion e = new Explosion(this);
	            e.setX(ladrillos.getX());
	            e.setY(ladrillos.getY());
	            explosion.add(e);
	            objetos.remove(i);
			}
		}
	     for (int i = 0; i < explosion.size();) {
	            Objetos m = (Objetos) explosion.get(i);
	            if (m.isTouched) {
	               explosion.remove(i);
	            } else {
	                i++;
	            }
	        }
        for (int i = 0; i < explosion.size(); i++) {
            Objetos m = (Objetos) explosion.get(i);
            m.act();
        }
   

	}
	
	public void checkCollisions() {
		Rectangle pelotaBounds = pelota.getBounds();
		Rectangle naveBounds = nave.getBounds();
		for (int i = 0; i < objetos.size(); i++) {
			Objetos a1 = (Objetos)objetos.get(i);
			Rectangle r1 = a1.getBounds();
			if (r1.intersects(pelotaBounds)) {
				pelota.collision(a1);
				a1.collision(pelota);
			}

		}
		if (pelotaBounds.intersects(naveBounds)) {
			pelota.collision(nave);
		}
	}

	public void paintWorld() {
		Toolkit.getDefaultToolkit().sync();
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		g.drawImage(SpriteCache.getCache().getSprite("fondo.jpg"), 0, 0, this);

		for (int i = 0; i < objetos.size(); i++) {
			Ladrillos ladrillos = (Ladrillos)objetos.get(i);
			if (!ladrillos.isTouched) {
				ladrillos.paint(g);
			}
			
			
		}
		
		for (int i = 0; i < explosion.size(); i++) {
			Objetos pum = (Objetos)explosion.get(i);
			if (!pum.isTouched) {
				pum.paint(g);
			}
			
			
		}

		
		pelota.paint(g);

		nave.paint(g);

		strategy.show();
	}
	
	public void pelotaPegada() {
		pelota.x = nave.x + nave.getWidth()/2 + 2;
		pelota.y = nave.y - pelota.getHeight();
	}
	
	

	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	public SoundCache getSoundCache() {
		return soundCache;
	}
		
	public void game() {
		cincoSegundos = 1000;
		millisAntes = System.currentTimeMillis();
		initWorld();
		while (isVisible()) {
			long millisAntesDeConstruirEscena = System.currentTimeMillis();
			updateWorld();
			cincoSegundos= System.currentTimeMillis() - millisAntes;
			paintWorld();
			
			checkCollisions();
			
			int millisUsados = (int) (System.currentTimeMillis() - millisAntesDeConstruirEscena);
			try { 
				int millisADetenerElJuego = 1000 / FPS - millisUsados;
				if (millisADetenerElJuego >= 0) {
					 Thread.sleep(millisADetenerElJuego);
				}
			} catch (InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		Ventana vent = new Ventana();
		vent.game();
	}
}
