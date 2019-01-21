package Programacion.RepasoArray.Ej5.Ejercicio1.Ej2;

public class Persona {

	private int numero;

	/**
	 * @param numero
	 */
	public Persona(int numero) {
		super();
		this.numero = numero;
	}

	/**
	 * 
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [numero=" + numero + "]";
	}
	
}
