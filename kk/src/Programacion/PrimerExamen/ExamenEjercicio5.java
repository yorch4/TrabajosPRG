package Programacion.PrimerExamen;

public class ExamenEjercicio5 {
	public static void main (String args[]) {
		int array[] = new int [102]; //Declaracion del array
		int num;
		for (int i = 2; i < array.length; i++) { // Inicializacion de los valores del array
		
			num = (array[i-1])+(array[i-2]); //Escribo la formula
			array[i] = num;
			array[2]=1;			//Igualo los dos primeros elementos a 1 para que la operacion sea mas facil
			array[3]=1;
			
			
			System.out.println(array[i]); //Imprimo el array
		}
	}
}
