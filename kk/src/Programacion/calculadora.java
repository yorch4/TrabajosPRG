package Programacion;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main (String args[]) {
		String menu = "MENU\n"
				+ "1.- Suma de dos números\n"
				+ "2.- Resta de dos números\n"
				+ "3.- Multiplicación de dos números\n"
				+ "4.- División de dos números";
		int num1, num2;
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1: //Suma de dos números
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 + num2) );
			break;
		
		case 2: //Resta de dos números
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 - num2) );
			break;
			
		case 3: // Multiplicación de dos números
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2) );
			break;
			
		case 4: // División de dos números
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 / num2) );
			break;
		}
}
}
