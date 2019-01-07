package Programacion.F1;

public class Moto extends Vehiculo {
	
	/**
	 * @param x
	 * @param nombre
	 * @param color
	 */
	public Moto(String nombre, String color) {
		super(nombre, color);
	}

	/**
	 * Implementación del método abstracto que pinta la moto
	 */
	@Override
	public String paint() {
		return "Moto: " + this.nombre + " - " + this.x;
	}

}
