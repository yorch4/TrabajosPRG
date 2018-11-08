package Programacion.Clases;

	public class PersonaD extends Persona {

		private String dni;

		public PersonaD() {
			super();
			
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		@Override
		public String toString() {
			return "PersonaD [dni=" + dni + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
					+ ", getApellidos()=" + getApellidos() + ", getFechaNac()=" + getFechaNac() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
}
