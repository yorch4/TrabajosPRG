package Programacion.F1;

public abstract class Vehiculo {

	protected int x; // Posición horizontal que ocupa el vehículo
	protected String nombre; // Nombre del conductor o conductora del vehículo
	protected String color; // Color del vehículo, codificado como 6 cifras hexadecimales
	private int podium;
	private boolean sumado = false;
	
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Vehiculo(String nombre, String color) {
		super();
		this.x = 0;
		this.nombre = nombre;
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isTerminado () {
		if (this.x >= 500) {
			return true;
		}
		return false;
	}

	/**
	 * Método que permite el avance al azar del vehículo
	 */
	public void avanza () {
		int avance = (int) Math.round(Math.random() * (50-3) + 3);
		this.x += avance;
	}
	
	/**
	 * @return the podium
	 */
	public int getPodium() {
		return podium;
	}

	/**
	 * @param podium the podium to set
	 */
	public void setPodium(int podium) {
		this.podium = podium;
	}

	/**
	 * @return the podium
	 */
	public boolean getSumado() {
		return sumado;
	}

	/**
	 * @param podium the podium to set
	 */
	public void setSumado(boolean sumado) {
		this.sumado = sumado;
	}
	
	/**
	 * Método abstracto para que el vehículo se pinte a sí mismo en la consola
	 */
	public abstract String paint();
	
	
}
