package Programacion.PracticaExamen;

public class Poker {
	
	public Jugador jugador[] = new Jugador[5];
	
	public Baraja baraja;

	/**
	 * @param baraja
	 */
	public Poker(Baraja baraja) {
		this.baraja = baraja;
		
		jugador[0] = new Jugador("Jugador 1");
		jugador[1] = new Jugador("Jugador 2");
		jugador[2] = new Jugador("Jugador 3");
		jugador[3] = new Jugador("Jugador 4");
		jugador[4] = new Jugador("Jugador 5");
	
	for (int i=0;i<jugador.length;i++) {
		baraja.darMano(jugador[i]);
		
		System.out.println("Nombre Jugador: " + jugador[i].getNombre());
		
		for (int j=0;j<jugador[i].getMano().length;j++) {
			System.out.println("\t" + jugador[i].getMano()[j].toString());
		}
		}

	}
}
