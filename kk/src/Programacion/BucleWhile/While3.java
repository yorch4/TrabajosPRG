package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class While3 {
	public static void main(String[] args) {
		int mayor = 0, num = -1;

		
		while (num != 0) {
			if (mayor > num && num != 0) {
				mayor = Integer.parseInt(JOptionPane.showInputDialog(
						"Introduzca n�mero (0 -> Salir): "));
				mayor = num; 
			}
			else {
				num = Integer.parseInt(JOptionPane.showInputDialog(
						"Introduzca n�mero (0 -> Salir): "));
				if (num < mayor && num != 0) {
					mayor = num;
				}
			}
		}
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Menor total " + mayor); 
	}
	

}