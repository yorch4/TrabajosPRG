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

		String mensaje = "";
		
		switch (opcion) {
		case 1:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer cateto"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo cateto"));
			mensaje = "Resultado: " + (Math.sqrt(Math.pow(num1, 2)+(Math.pow(num2, 2))));
			break;
		case 2:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			mensaje = "Resultado: " + (Math.PI * Math.pow(num1, 2));
			break;
			
		case 3:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			mensaje = "Resultado: " + (2 * Math.PI * num1);
			break;
			
		case 4:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
			mensaje = "Resultado: " + (num1 * num2);
			break;
		case 5:
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			mensaje = "Resultado: " + ((num1 * num2)/2);
			break;
		case 0: System.exit(0);
		break;
		default:
			mensaje = "Opcion incorrecta, elija bien";
	}
		JOptionPane.showInputDialog(null, mensaje);
}
}
