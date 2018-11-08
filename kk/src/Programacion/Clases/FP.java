package Programacion.Clases;

public class FP extends Matricula {

	private boolean dual;

	public FP() {
		super();
	
	}

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public String toString() {
		return "FP [dual=" + dual + ", isDual()=" + isDual() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
