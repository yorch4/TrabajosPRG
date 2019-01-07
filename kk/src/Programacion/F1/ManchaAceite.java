package Programacion.F1;

public class ManchaAceite extends Obstaculo {
	
	// Singleton
			private static ManchaAceite manchaAceite = null;
			
	/**
	 * Singleton
	 * @return
	 */
	public static ManchaAceite getManchaAceite() {
		if (manchaAceite == null) {
			manchaAceite = new ManchaAceite();
		}
		return manchaAceite;
	}
	
	/**
	 * 
	 */
	public ManchaAceite() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param xObstaculo
	 * @param posicion
	 */
	public ManchaAceite(int xObstaculo, int posicion) {
		super(xObstaculo, posicion);
	}

	public void inicializa() {
		int obs = - (int) Math.round(Math.random() * (50 - 10) + 10);
		this.xObstaculo = obs;
	}
	
}
