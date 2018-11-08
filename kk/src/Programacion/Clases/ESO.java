package Programacion.Clases;

public class ESO extends Matricula {

	private boolean pmar;

	public ESO() {
		super();
	
	}

	public boolean isPmar() {
		return pmar;
	}

	public void setPmar(boolean pmar) {
		this.pmar = pmar;
	}

	@Override
	public String toString() {
		return "ESO [pmar=" + pmar + ", isPmar()=" + isPmar() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
