package kk;

import javax.swing.JOptionPane;

public class ejercicioC6 {

	public static void main (String args[]) {
		
	}
	String numero = JOptionPane.showInputDialog("Escribe un número");
	int num = Integer.parseInt(numero);
	{
	int resto = num % 2;
	if (resto == 0) {
		System.out.println("El número es par");
	}
		else {
			System.out.println("El número es impar");
}
}
}	


