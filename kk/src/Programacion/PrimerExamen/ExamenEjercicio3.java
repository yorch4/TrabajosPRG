package Programacion.PrimerExamen;

public class ExamenEjercicio3 {
	public static void main (String args[]) {
		int array[] = new int [20]; //Declaracion del array
		int numBueno=0;
		
		for (int i = 0; i < array.length; i++) { // Inicializacion de los valores del array
			int num = (int) Math.round(Math.random()* 100); 
			if (num % 2 !=0 && num % 3!=0 && num % 5 !=0) { //Si se cumple la condicion de que el numero es primo
				numBueno=num;                          //Igualo ese numero al numero que tendra nuestro array
			}
			array[i]=numBueno;
			System.out.println("[" + i + "] " + array[i]); //Imprimo el array
			
			}
		}
	}


