package Programacion.PracticaExamen;



public class Principal {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		
		baraja.inicializarCartas();
		Poker poker = new Poker(baraja);
		
		
		

	}

}
