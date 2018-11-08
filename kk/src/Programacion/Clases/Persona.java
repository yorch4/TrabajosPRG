package Programacion.Clases;

public class Persona {

	private String nombre;
	private String apellidos;
	private String fechaNac;
	
	public Persona() {
		super();
		
	}

	public Persona(String nombre, String apellidos, String fechaNac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
}
