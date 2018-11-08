package Programacion.PrimerExamen;

public class ExamenEjercicio1 {
	public static void main (String args[]) {
		int array[] = new int [100]; //Declaracion de los elementos
		int suma = 0;
		int maximo = 0;
		int minimo = 2000;
		
		for (int i = 0; i < array.length; i++) {
			// Inicializacion de los valores del array
			int num = (int) Math.round(Math.random()* 1000); 
			array[i] = num;
			if (num>maximo) {	//Escribo las condiciones para que un numero sea maximo o minimo
				maximo=num;
			}
			if (num<minimo) {
				minimo=num;
			}
				
			
			
			System.out.println(array[i]); //Se imprime el array
			
			suma = num + suma;
		
		}
		System.out.println("La suma es: " + suma); //Se imprime la suma
		System.out.println("La media es: " + (float) suma/100); //Se imprime la media
		System.out.println("El maximo es: " + maximo); //Se imprime el maximo
		System.out.println("El minimo es: " + minimo); //Se imprime el minimo
	}
		

}
