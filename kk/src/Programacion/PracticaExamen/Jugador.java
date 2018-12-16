package Programacion.PracticaExamen;

public class Jugador {

	public String nombre;
	public Carta mano[] = new Carta[5];
	
	/**
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}
	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	

}
