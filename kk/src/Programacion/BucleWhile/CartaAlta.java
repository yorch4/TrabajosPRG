package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class CartaAlta {
	public static void main(String[] args) {
		  int cartaMaquina = (int)(Math.random() * 14);
		  int miCarta = (int) Math.round(Math.random() * 14);
		  JOptionPane.showMessageDialog(null, "La carta de la maquina es: " + cartaMaquina);
		  
		  if (cartaMaquina > miCarta ) {
			  JOptionPane.showMessageDialog(null, "Que pena, has perdido");
		  }
		  else {
			  if (cartaMaquina < miCarta) {
				  JOptionPane.showMessageDialog(null, "Bien, has ganado");
			  }
		  }
	}

}
