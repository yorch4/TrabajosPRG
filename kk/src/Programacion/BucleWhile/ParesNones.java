package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class ParesNones {
	public static void main(String[] args) {
	  int manoDerecha = (int) Math.round(Math.random() * 5);
	  int manoIzquierda = (int) Math.round(Math.random() * 5);
	  int eleccion = Integer.parseInt(JOptionPane.showInputDialog("¿Pares (0) o nones (1)?"));
	  int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dedos quieres sacar?"));
	  int suma = manoDerecha + manoIzquierda + num;
	  JOptionPane.showMessageDialog(null, "La maquina ha sacado " + suma);
	  if (suma % 2 == 0 && eleccion == 0) {
		  JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado (PARES)");
		 }
	  		else {
	  			if (suma % 2 == 0 && eleccion == 1) {
				  JOptionPane.showMessageDialog(null, "Que pena, has perdido (PARES)");
			  	}
	  			else {
	  				if (suma % 2 != 0 && eleccion == 1) {
	  					JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado (NONES)");
	  				}
	  				else {
	  					 JOptionPane.showMessageDialog(null, "Que pena, has perdido (NONES)");
	  				}
	  			}
	  	}
	  
	}

}
