package Programacion;

import javax.swing.JOptionPane;

public class BucleEjercicio3 {
	
	public static void main (String [] args) {
		int numerosNegativos = 0;
		int numerosPositivos = 0;
		int i;
		int a = Integer.parseInt(JOptionPane.showInputDialog("�Cuantos numeros desea ingresar?"));
		
		for (i = 0; i < a; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
			if (num < 0) {
				numerosNegativos++;
			}
			else {
					numerosPositivos++;
			}
		}
		
		System.out.println("Numeros positivos: " + numerosPositivos);
		System.out.println("Numeros negativos: " + numerosNegativos);
		
		}
	}
