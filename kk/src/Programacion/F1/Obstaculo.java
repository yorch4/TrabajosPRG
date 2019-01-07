package Programacion.F1;

public abstract class Obstaculo {

	protected int xObstaculo; // Posición horizontal que retrasa o avanza
	protected int posicion;
	
	public Obstaculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param xObstaculo
	 * @param posicion
	 */
	public Obstaculo(int xObstaculo, int posicion) {
		super();
		this.xObstaculo = xObstaculo;
		this.posicion = posicion;
	}

	/**
	 * @return the xObstaculo
	 */
	public int getxObstaculo() {
		return xObstaculo;
	}

	/**
	 * @param xObstaculo the xObstaculo to set
	 */
	public void setxObstaculo(int xObstaculo) {
		this.xObstaculo = xObstaculo;
	}

	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
