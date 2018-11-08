package Programacion.PrimerExamen;

public class ExamenEjercicio4 {
	public static void main (String args[]) {
		int array[] = new int [100]; //Declaracion del array
		int contador=0; //Declaracion del contador
		
		for (int i = 0; i < 100; i++) { // Inicializacion del array
			array[i]=0;
			int num = (int) Math.round(Math.random());
			if (num == 1 && contador!= 10) { //Hago una condicion que pone el 1 al azar
				contador++;
				array[i]=1;
			}
			System.out.println(array[i]); //Imprime el array
		}
	}

}
