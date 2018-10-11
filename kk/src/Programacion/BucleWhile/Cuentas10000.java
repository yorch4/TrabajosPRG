package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class Cuentas10000 {
	public static void main(String[] args) {
		int numeros;
		int suma = 0;
		
		for (int contador = 0; contador != 10000; contador++) {
			numeros = (int) Math.round(Math.random()*1000);
			suma = numeros + suma;
			
		}
	
		JOptionPane.showMessageDialog(null, "La suma es " + suma + " y la media es " + 	((float)suma / 10000));
		
	}
}
