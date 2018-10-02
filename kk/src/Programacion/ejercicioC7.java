package Programacion;

import javax.swing.JOptionPane;

public class ejercicioC7 {

	public static void main (String args[]) {
		

	int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero"));
	
	int and = (num & 1);
	if (and == 1) {
		System.out.println("El n�mero es impar");
		}
		else {
			System.out.println("El n�mero es par");
	         }
}	
}

