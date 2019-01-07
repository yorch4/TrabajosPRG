/**
 * 
 */
package Programacion.F1;

public class Rampa extends Obstaculo {
	
	// Singleton
		private static Rampa rampa = null;
		
	
	/**
	 * 
	 */
	public Rampa() {
		super();
	}

	/**
	 * Singleton
	 * @return
	 */
	public static Rampa getRampa() {
		if (rampa == null) {
			rampa = new Rampa();
		}
		return rampa;
	}
	
	/**
	 * @param xObstaculo
	 * @param posicion
	 */
	public Rampa(int xObstaculo, int posicion) {
		super(xObstaculo, posicion);
		
	}

	public void inicializa() {
		int obs = (int) Math.round(Math.random() * (100 - 50) + 50);
		this.xObstaculo = obs;
	}

}
