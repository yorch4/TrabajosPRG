package Programacion.RepasoArray;

import javax.swing.JOptionPane;

public class Ej2 {

	public static void main(String[] args) {
		float array[] = creaArray();
		imprimeArray(array);
		calcularPorcentaje(array);
	}
	
	public static float[] creaArray() {
		float array[] = new float[200];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (float) (Math.random() * 10 );
		}
		return array;
	}
	
	public static void imprimeArray(float array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void calcularPorcentaje(float array[]) {
		float sumaSuspensos = 0;
		float sumaAprobados = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 5) {
				sumaSuspensos++;
			} else {
				sumaAprobados++;
			}
		}
		float porcentajeAprobados = (sumaAprobados * 100) / array.length;
		float porcentajeSuspensos = (sumaSuspensos * 100) / array.length;
		
		JOptionPane.showMessageDialog(null, "El porcentaje de aprobados es del " + porcentajeAprobados + " %");
		JOptionPane.showMessageDialog(null, "El porcentaje de suspensos es del " + porcentajeSuspensos + " %");
	}
}
