package Programacion.Array;

public class TresArrays {
	public static void main (String args[]) {

		int array1[]= new int [150];
		int array2[]= new int [150];
		int array3[]= new int [150];
		int i;

		for (i = 0; i < 100; i++) {
			array1[i] = (int) Math.round(Math.random()* 100);
			array2[i] = (int) Math.round(Math.random()* 100);
			
			if (i % 2 == 0) {
				array3[i] = array2[i];
				
			}
			else {
				array3[i] = array1[i];
		
			}
			System.out.println("Array [" + i + "] " + array3[i]);
		}		
	}
}		