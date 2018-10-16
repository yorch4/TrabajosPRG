package Programacion.Array;


public class ArrayCambiaSigno {
	public static void main (String args[]) {
		
		int array[]= new int [150];
		int num=0;
		int pares=0;
		
		for (int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random() * (200) - 100);
			array[i] = num;
			if (array[i] % 2 == 0) {
				pares = array[i] * (-1);
				System.out.println(pares);
			}
			else {
				System.out.println(array[i]);
			}
		}
	}
}