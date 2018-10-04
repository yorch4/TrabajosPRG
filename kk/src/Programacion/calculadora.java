package Programacion;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main (String args[]) {
		String menu = "MENU\n"
				+ "1.- Hipotenusa de un triangulo\n"
				+ "2.- Superficie de una circunferencia\n"
				+ "3.- Perimetro circunferencia\n"
				+ "4.- Area rectangulo\n"
				+ "5.-Area triangulo\n"
				+ "0.-Salir del programa";
		int num1, num2;
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer cateto"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo cateto"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.sqrt(Math.pow(num1, 2)+(Math.pow(num2, 2)))));
			return;
		
		case 2:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (Math.PI * Math.pow(num1, 2)));
			return;
			
		case 3:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (2 * Math.PI * num1));
			return;
			
		case 4:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (num1 * num2) );
			return;
		case 5:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			JOptionPane.showMessageDialog(null, "Resultado: " + ((num1 * num2)/2) );
			return;
		case 0: System.exit(0);
		break;
		}
}
}
