package Programacion.F1;

public class Principal {

	public static void main(String[] args) {
		
		// Pintamos una ventana en pantalla, basta con llamar al Singleto para 
		// inicializar el JFrame y mostrarlo en pantalla
		Ventana.getVentana();
		
		Carrera.getCarrera().comienzaCarrera();
	
		Carrera.getCarrera().ordenaArrayJugadoresPorPodium();
		
		Carrera.getCarrera().imprimeJugadores();
	}

}
