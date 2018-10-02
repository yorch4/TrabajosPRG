package Programacion;

import javax.swing.JOptionPane;

public class ejercicioC4 {
	
	public static void main (String args[]) {
	
	String numero1 = JOptionPane.showInputDialog("Introduce un número");
	int num1 = Integer.parseInt(numero1);
	String numero2 = JOptionPane.showInputDialog("Introduce un número");
	int num2 = Integer.parseInt(numero2); 
	String numero3 = JOptionPane.showInputDialog("Introduce un número");
	int num3 = Integer.parseInt(numero3);
	String numero4 = JOptionPane.showInputDialog("Introduce un número");
	int num4 = Integer.parseInt(numero4); 
	String numero5 = JOptionPane.showInputDialog("Introduce un número");
	int num5 = Integer.parseInt(numero5);
	{
		if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5) {
			System.out.println("El número menor es " + num1);
		}
		else {
			if (num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5) {
				System.out.println("El número menor es " + num2);
		    }
			else {
				if (num3 <= num2 && num3 <= num1 && num3 <= num4 && num3 <= num5) {
					System.out.println("El número menor es " + num3);
			    }
				else {
					if (num4 <= num2 && num4 <= num3 && num4 <= num1 && num4 <= num5) {
						System.out.println("El número menor es " + num4);
				    }
					else {
						if (num5 <= num2 && num5 <= num3 && num5 <= num4 && num5 <= num1) {
							System.out.println("El número menor es " + num5);
					    } 
		}
	}
}
}
}
	}
}