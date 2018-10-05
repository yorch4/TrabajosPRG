package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio2Bucle {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números quiere introducir?"));
		int i, acumuladorNumerosMayoresDiez = 0;
		
		for (i = 0; i < a; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero " + i));
	
			if (numero > 10) {
	
				acumuladorNumerosMayoresDiez += numero;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Total acumulado: " + acumuladorNumerosMayoresDiez);
	}

}