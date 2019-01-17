package Programacion.RepasoArray;

import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {
		int array[] = creaArray();
		imprimeArray(array);
		arrayImpar(array);
	}
	
	public static int[] creaArray() {
		int array[] = new int[(int) (Math.round(Math.random() * 100 ))];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * 100 ));
		}
		return array;
	}
	
	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Numero " + (i + 1) + ": " + array[i] + "\t");
		}
		System.out.println();
	}
	
	public static void arrayImpar(int array[]) {
		if (array.length % 2 == 0) {
			JOptionPane.showMessageDialog(null, "-1");
		} else {
			int posicionMedia = array.length / 2;
			JOptionPane.showMessageDialog(null, array[posicionMedia]);
		}
	}

}
