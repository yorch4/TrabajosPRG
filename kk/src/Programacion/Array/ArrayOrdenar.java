package Programacion.Array;
public class ArrayOrdenar {
	public static void main (String args[]) {
	
		int array[] = new int [5];
		
		for (int i = 4; i > 0; i--) {
			array[i] = (int) Math.round(Math.random()* 5);
			array[1] = array[4];
			System.out.println(array[i]);
		}
	}
}
			