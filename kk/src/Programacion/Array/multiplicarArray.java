package Programacion.Array;

import javax.swing.JOptionPane;

public class multiplicarArray {
	public static void main (String args[]) {
	
		int array[] = new int [150];
		int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Numero por el que lo quieres multiplicar"));
		
		for (int i = 0; i < 100; i++) {
			int num = (int) Math.round(Math.random()* 100);
			array[i] = num;
			System.out.println("Array antiguo: " + array[i]);
			num = multiplicador * num;     
			array[i] = num;
			System.out.println("Array nuevo: " + array[i] + "\n");
		}
	}
}
