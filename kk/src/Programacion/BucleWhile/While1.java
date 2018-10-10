package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class While1 {
	public static void main(String[] args) {
		int num = 1; int suma = 0; int contador = 0;
		

		while (num!=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca n�mero (0 -> Salir): "));
			suma = suma + num;
			contador++;
		}
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Media " + ((float) suma / (contador - 1)));

	}

}
