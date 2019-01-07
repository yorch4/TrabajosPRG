package Programacion.F1;


public class Pista {

	public Obstaculo obstaculo[] = new Obstaculo[4];
	
	// Singleton
	private static Pista pista = null;
				
	
	/**
	 * 
	 */
	public Pista() {
		super();
		
	}

	/**
	 * Singleton
	 * @return
	 */
	public Pista getPista() {
		if (pista == null) {
			pista = new Pista();
		}
		return pista;
	}

	/**
	 * @param obstaculo
	 */
	public Pista(Obstaculo[] obstaculo) {
		super();
		this.obstaculo = obstaculo;
	}
	
	public void inicializa() {
		int var = 0;
			for (int i = 0; i < obstaculo.length; i++) {
				int azar = (int) Math.round(Math.random());
				int posicion;
				do {
					posicion = (int) (Math.round(Math.random() * 500));
				} while(var == posicion);
				var = posicion;
				if (azar == 0) {
					Rampa.getRampa().inicializa();
					obstaculo[i] = new Rampa(Rampa.getRampa().xObstaculo, posicion);
					//System.out.println("Obstaculo " + (i + 1) + " Rampa- xObstaculo: " + Rampa.getRampa().xObstaculo + " posicion: " + posicion);
				} else {
					ManchaAceite.getManchaAceite().inicializa();
					obstaculo[i] = new ManchaAceite(ManchaAceite.getManchaAceite().xObstaculo, posicion);
					//System.out.println("Obstaculo " + (i + 1) + " Mancha- xObstaculo: " + ManchaAceite.getManchaAceite().xObstaculo + " posicion: " + posicion);
				}
			}
		}
}
