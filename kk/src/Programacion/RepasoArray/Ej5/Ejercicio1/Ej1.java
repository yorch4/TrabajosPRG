package Programacion.RepasoArray.Ej5.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ej1 {

	public static void main(String[] args) {
			menu();	
	}

	public static boolean salir = false;

	public static void menu() {
		List<String> texto = new ArrayList<String>();
		int opcion;
		do {
		String menu = "MENU\n" + "1.- Añadir una linea\n" + "2.- Insertar una línea en cualquier posición del texto\n"
				+ "3.-  Editar una línea\n" + "4.-  Borrar una línea\n" + "5.-Cortar un conjunto de líneas\n"
				+ "6.- Pegar un conjunto de líneas cortadas en una determinada posición\n" + "7.-Imprimir el texto\n"
				+ "0.-Salir del programa";

		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		String mensaje = "";

		switch (opcion) {
		case 1:
			texto.add(JOptionPane.showInputDialog("Introduce una linea"));
			break;
		case 2:
			int indice2 = (Integer.parseInt(JOptionPane.showInputDialog("Introduce la línea en la que quieres escribir")));
			String texto2 = JOptionPane.showInputDialog("Introduce el texto");
			texto.add(indice2, texto2);
			break;

		case 3:
			int indice3 = (Integer.parseInt(JOptionPane.showInputDialog("Introduce la línea en la que quieres escribir")));
			String texto3 = JOptionPane.showInputDialog("Introduce el texto");
			texto.set(indice3, texto3);
			break;

		case 4:
			int indice4 = (Integer.parseInt(JOptionPane.showInputDialog("Introduce la línea que quieres borrar")));
			texto.remove(indice4);
			break;
		case 5:
			int posicionInicial = (Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice inicial")));
			int posicionFinal = (Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice final")));
			posicionFinal = posicionFinal + 1;
			
			List<String> portapapeles = texto.subList(posicionInicial, posicionFinal);
			
			break;
		case 6:

			break;
		case 7:
			System.out.println("----------------------------------------------");
			for (int i = 0; i < texto.size(); i++) {
				System.out.println("Linea " + i + "   " + texto.get(i).toString());
			}
			break;
		case 0:
			System.exit(0);
			salir = true;
			break;
		default:
			mensaje = "Opcion incorrecta, elija bien";
		}
		}while (opcion != 0);
	}

}
