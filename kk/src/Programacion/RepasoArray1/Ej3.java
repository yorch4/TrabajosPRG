package Programacion.RepasoArray;

import javax.swing.JOptionPane;

public class Ej3 {
	
	public static void main(String[] args) {
		float array[] = creaArray();

	}

	public static float creaNumero() {
		float parteEntera = (float) (Math.round(Math.random() * 100));
		float parteDecimal = (float) (Math.round(Math.random() * 99));
		
		if (parteDecimal <= 50) {
			//JOptionPane.showMessageDialog(null, "Parte decimal menor que 0,50");
			System.out.println("Parte decimal menor que 0,50");
		}
		
		parteDecimal = parteDecimal / 100;
		
		
		float numero = parteEntera + parteDecimal;
		
		return numero;
	}
	
	public static float[] creaArray() {
		
		float array[] = new float[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = creaNumero();
			System.out.println("Numero " + i + " - " + array[i] + "\n");
		}
		return array;
		
		}
	}
