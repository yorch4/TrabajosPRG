package Programacion.Array;import javax.swing.JOptionPane;

public class ArraySuma {
	public static void main (String args[]) {
		int array[]= new int [150];
		int num=0;
		int sumaPar=0;
		int sumaImpar=0;
		
		for (int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random()* 100);
			array[i] = num;
	
			System.out.println(array[i]);
			
			if (array[i] % 2 == 0) {
				sumaPar = array[i] + sumaPar;
			}
			else {
				sumaImpar = array[i] + sumaImpar;
			}
			}
		System.out.println("La suma de los pares es: " + sumaPar);
		System.out.println("La suma de los impares es: " + sumaImpar);
	}
}			
		