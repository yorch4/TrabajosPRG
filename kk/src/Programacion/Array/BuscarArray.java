package Programacion.Array;import javax.swing.JOptionPane;

public class BuscarArray {
	public static void main (String args[]) {
		int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres buscar"));
		int array[]= new int [150];
		int num=0;
		int posicion=0;
		int bandera = 0;
		
		for (int i = 0; i < 100; i++) {
			num = (int) Math.round(Math.random()* 100);
			array[i] = num;
	
			System.out.println(array[i] + " - " + i);
			
		
			if (numUsuario == array[i]) {
				bandera = 1; posicion = i;
			}
				
		}
		if (bandera == 1) {
			System.out.println("El numero esta en la " + posicion + " linea");
		}
		else {
			System.out.println("El numero no existe");
		}
		

	}

}
