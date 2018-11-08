package Programacion.Clases;

public class Bach extends Matricula {

	private String modalidad;

	public Bach() {
		super();
		
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "Bach [modalidad=" + modalidad + ", getModalidad()=" + getModalidad() + ", getFecha()=" + getFecha()
				+ ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
