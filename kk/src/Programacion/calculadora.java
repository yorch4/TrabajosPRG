package Programacion;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main (String args[]) {
		String menu = "MENU\n"
				+ "1.- Raíz de un número\n"
				+ "2.- Potencia de un número\n"
				+ "3.- Resto de una división\n";
		int num1, num2;
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1: //Raiz de un número
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radicando"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el índice"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.pow(num1, 1/num2)) );
			break;
		
		case 2: //Potencia de un número
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.pow(num1, num2)) );
			break;
			
		case 3: // Resto de una división
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo número"));
			JOptionPane.showMessageDialog(null, "El resto es: " + (num1 % num2) );
			break;
			
		}
}
}
