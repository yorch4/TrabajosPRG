package Programacion.F1;

import javax.swing.JOptionPane;

public class Carrera {
	// Singleton
		private static Carrera carrera = null;
	// Necesito un array de elementos de tipo "Vehiculo", deben ser 5
	private Vehiculo vehiculos[] = new Vehiculo[5];
	
	private Pista pista[] = new Pista[5];

	/**
	 * Constructor
	 */
	public Carrera() {
		super();
		// Inicialización de los vehículos
		vehiculos[0] = new Coche("Bertha Benz", "ff7c7c");
		vehiculos[1] = new Moto("Dani Pedrosa", "ffe97c");
		vehiculos[2] = new Coche("Fernando Alonso", "82ff7c");
		vehiculos[3] = new Coche("María de Villota", "8effd9");
		vehiculos[4] = new Moto("Ana Carrasco", "d18eff");
		// Inicialización de los vehículos
		for (int i = 0; i < pista.length; i++) {
			pista[i] = new Pista();
		}
	}
	
	public void comienzaCarrera() {
		asignarPista();
		do {
			//compara();
			for (int i = 0; i < vehiculos.length; i++) {
				vehiculos[i].avanza();
				System.out.println(vehiculos[i].paint());
			}
			
			
			System.out.println("--------------------------");	
			
		} while (!(carreraFinalizada()==true));
		
		
		//System.out.println("Primer lugar: " + vehiculos[0].nombre);
	}
	
	public boolean carreraFinalizada() {
		boolean finaliza = true;
			for (int i = 0; i < vehiculos.length; i++) {
				if (vehiculos[i].isTerminado() == false) {
					finaliza = false;
				} else {
					if (vehiculos[i].isTerminado() == true && vehiculos[i].getSumado() == false) {
						vehiculos[i].setPodium(getMaximoValorEnPodium() + 1);
						vehiculos[i].setSumado(true);
					}
				}
			}
			if (finaliza == true) {
				return true;
			} else {
				return false;
			}
	}
	
	public void asignarPista() {
		for (int i = 0; i < pista.length; i++) {
			pista[i].inicializa();
		}
	}
		
	public void compara() {
			for (int j = 0; j < vehiculos.length; j++) {
				for (int k = 0; k < 4; k++) {
					if (vehiculos[j].x >= pista[j].getPista().obstaculo[k].posicion) {
						int posAux = vehiculos[j].x + pista[j].getPista().obstaculo[k].xObstaculo;
						vehiculos[j].x = posAux;
					}
				}
			}
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMaximoValorEnPodium () {
		// Este método obtiene el máximo valor de podium del conjunto de jugadores.
		// Si ningún jugador ha llegado a la meta, todos los jugadores tendrán en su
		// "podium" el valor "0".
		int maxValor = 0;
		
		// Comprobamos que el array tenga al menos un elemento
		if (vehiculos.length > 0) {
			maxValor = vehiculos[0].getPodium(); // Asignamos el máximo valor de podium al que tenga el primer jugador
			// Recorremos todos los jugadores, buscando un valor de podium más alto,
			// comenzando por el segundo jugador y llegando hasta el último.
			for (int i = 1; i < vehiculos.length; i++) {
				if (vehiculos[i].getPodium() > maxValor) {
					maxValor = vehiculos[i].getPodium();
				}
			}
		}
		return maxValor;
	}
	

	/**
	 * 
	 * @param jugadores
	 */
	public void ordenaArrayJugadoresPorPodium () {
		// Ordenación por el método de la burbuja, para que los jugadores queden
		// ordenados por orden de llegada a la meta
		for (int i = vehiculos.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (vehiculos[j].getPodium() > vehiculos[j+1].getPodium()) {
					Vehiculo aux = vehiculos[j];
					vehiculos[j] = vehiculos[j+1];
					vehiculos [j+1] = aux;
				}
			}
		}		
	}
	
	
	/**
	 * 
	 */
	public void imprimeJugadores () {
		// Imprimo array de jugadores
		System.out.println("\n\nPodium de jugadores");
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].nombre + " Podium: " + vehiculos[i].getPodium());
		}
	}
	
	
	/**
	 * Singleton
	 * @return
	 */
	public static Carrera getCarrera() {
		if (carrera == null) {
			carrera = new Carrera();
		}
		return carrera;
	}

	public Pista[] getPista() {
		return pista;
	}

	public void setPista(Pista pista[]) {
		this.pista = pista;
	}
	
}
