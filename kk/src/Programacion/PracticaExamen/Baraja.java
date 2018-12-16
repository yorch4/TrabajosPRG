package Programacion.PracticaExamen;

public class Baraja extends Carta {

	private static Baraja baraja = null;
	
	/**
	 * @param valor
	 * @param palo
	 * @param id
	 */
	
	/**
	 * Singleton
	 * @return
	 */
	public static Baraja getBaraja() {
		if (baraja == null) {
			baraja = new Baraja();
		}
		return baraja;
	}
	
	
	public Baraja(int valor, String palo, int id) {
		super(valor, palo, id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public Baraja() {
		super();
		// TODO Auto-generated constructor stub
	}

	Carta carta[] = new Carta[52];
	int indice = 0;
	
	
	
	public void inicializarCartas() {
		for (int i = 0; i < 13; i++) {
			carta[indice] = new Carta(i + 1, "Picas", indice);
			indice++;
		}
		for (int i = 0; i < 13; i++) {
			carta[indice] = new Carta(i + 1, "Diamantes", indice);
			indice++;
		}
		for (int i = 0; i < 13; i++) {
			carta[indice] = new Carta(i + 1, "Treboles", indice);
			indice++;
		}
		for (int i = 0; i < 13; i++) {
			carta[indice] = new Carta(i + 1, "Corazones", indice);
			indice++;
		}
	}
	
	public void imprimir() {
		for (int i = 0; i< carta.length; i++) {
			System.out.println(carta[i]);
		}
		
	}
	
	public void abajoArriba() {
		Carta aux = new Carta();
		int contAbajo = 51;
		
		for (int i=0; i<contAbajo;i++) {
			 aux = carta[i];
			 carta[i] = carta[contAbajo];
			 carta[contAbajo] = aux;
			 contAbajo--;
		}
		
	}
	
	public void arribaAbajo() {
		Carta aux = new Carta();
		int contAbajo = 51;
		
		for (int i=0; i<contAbajo;i++) {
			 aux = carta[contAbajo];
			 carta[contAbajo] = carta[i];
			 carta[i] = aux;
			 contAbajo--;
		}
		
	}
	
	public void mezclar() {
		for (int i = 0; i < 100; i++) {
			int indiceAzar1 =(int) Math.round(Math.random() * (carta.length-1));
			int indiceAzar2 = (int) Math.round(Math.random() * (carta.length-1));
			
			Carta aux = carta[indiceAzar1];
			carta[indiceAzar1] = carta[indiceAzar2];
			carta[indiceAzar2] = aux;
		}
	}
	
	public void ordenar() {
		for (int i = carta.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (carta[j].getId() > carta[j+1].getId()) {
					Carta aux = carta[j];
					carta[j] = carta[j+1];
					carta [j+1] =  aux;
				}
			}
		}
	}
	
	public void darMano(Jugador jugador) {
		Carta mano[] = new Carta[5];
		
		for (int i = 0; i<mano.length; i++) {
			int azar;
			
			do {
				azar = (int) Math.round(Math.random() * (carta.length - 1));
			} while (carta[i]==null);
			
			mano[i] = carta[azar];
			carta[i] = null;
		}
		jugador.setMano(mano);
	}
}


