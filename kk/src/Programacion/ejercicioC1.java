package Programacion;

import javax.swing.JOptionPane;

public class ejercicioC1 {
	
	public static void main (String args[]) {
	
	String numero1 = JOptionPane.showInputDialog("Introduce un número");
	int num1 = Integer.parseInt(numero1);
	String numero2 = JOptionPane.showInputDialog("Introduce un número");
	int num2 = Integer.parseInt(numero2); 
	{
	if (num1>num2) {
		System.out.println("El número mayor es " + num1);
	}
	else {
			System.out.println("El número mayor es " + num2);
		}
	}
}
}