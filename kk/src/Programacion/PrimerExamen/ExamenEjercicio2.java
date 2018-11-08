package Programacion.PrimerExamen;

import javax.swing.JOptionPane;

public class ExamenEjercicio2 {
	public static void main (String args[]) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero")); //Se pide al usuario el numero

		//Se usa una condicion que compruebe si el numero es primo
	if ((num % 2 !=0) && (num % 3 != 0) && (num % 5 != 0)) {    
		System.out.println("El numero es primo");     //Imprime la respuesta
	} else {
		System.out.println("El numero no es primo");
	}

}
}
