package Programacion;

import javax.swing.JOptionPane;

public class Bloque3Ejercicio4 {
	public static void main(String[] args) {	
		
	int importe = Integer.parseInt(JOptionPane.showInputDialog("Introduce el importe: "));
	int cantidadRecibida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad recibida: "));
	
	int devolver = cantidadRecibida - importe;
	int monedas100 = devolver / 100;
	int resto100 = devolver % 100;
	int monedas50 = resto100 / 50;
	int resto50 = resto100 % 50;
	int monedas25 = resto50 / 25;
	int resto25 = resto50 % 25;
	int monedas5 = resto25 / 5;
	int resto5 = resto25 % 5;
	int monedas1 = resto5 / 1;
	
	System.out.println("La vuelta son:\n"
			+ monedas100 + " moneda/s de 100\n"
					+ monedas50 + " moneda/s de 50\n"
							+ monedas25 + " moneda/s de 25\n"
									+ monedas5 + " moneda/s de 5\n"
											+ monedas1 + " moneda/s de 1" );
	

}
}