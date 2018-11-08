package Programacion.Clases;

public class PersonaND extends Persona {

	private String descripcion;
	
	public PersonaND() {
		super();
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "PersonaND [descripcion=" + descripcion + ", getDescripcion()=" + getDescripcion() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getFechaNac()=" + getFechaNac()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
