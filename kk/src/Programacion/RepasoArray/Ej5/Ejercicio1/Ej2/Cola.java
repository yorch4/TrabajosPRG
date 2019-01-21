package Programacion.RepasoArray.Ej5.Ejercicio1.Ej2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Cola {

	List<Persona> cola = new ArrayList<Persona>();
	

	/**
	 * @param cola
	 */
	public Cola(List<Persona> cola) {
		super();
		this.cola = cola;
	}

	/**
	 * 
	 */
	public Cola() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cola
	 */
	public List<Persona> getCola() {
		return cola;
	}

	/**
	 * @param cola the cola to set
	 */
	public void setCola(List<Persona> cola) {
		this.cola = cola;
	}

	public void añadirPersona() {
		int contPersona = 0;
		do {
			cola.add(new Persona(contPersona));
			contPersona++;
			imprimir();
		}while(true);
	}
	public void eliminarPersona() {
		cola.remove(0);
	}
	
	public void imprimir() {
		for (int i = 0; i < cola.size(); i++) {
			System.out.println(cola.get(i).toString());
		}
		JOptionPane.showMessageDialog(null, "");
		System.out.println("------------");
	}
}
