package Programacion;

import javax.swing.JOptionPane;

public class Bolque2Ejercicio1 {
	
	public static void main (String [] args) {
		int suma = 0;
		int media = 0;
		int i;
		int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea ingresar?"));
		
		for (i = 0; i < a; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
			suma = suma + num;
			
		
	}
		media = suma/a;
		System.out.println("La media es: " + media);
	}
}