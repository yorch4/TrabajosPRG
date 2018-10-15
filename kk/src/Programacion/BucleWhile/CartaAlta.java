package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class CartaAlta {
	public static void main(String[] args) {
		 int cartaMaquina = 0;
		 int miCarta = 0;
		 int paloMaquina = 0;
		 int paloMio = 0;
		do {
		  cartaMaquina = (int)(Math.random() * 12);
		  miCarta = (int) Math.round(Math.random() * 12);
		  paloMaquina = (int) (Math.random() * 3);
		  paloMio = (int) (Math.random() * 3);
		} while (cartaMaquina==miCarta&&paloMaquina==paloMio);
		  
		  if (cartaMaquina > miCarta ) {
			  JOptionPane.showMessageDialog(null, "Que pena, has perdido");
		  }
		  else {
			  if (cartaMaquina < miCarta) {
				  JOptionPane.showMessageDialog(null, "Bien, has ganado");
			  }
				  else {
					  if (paloMaquina < paloMio) {
						  JOptionPane.showMessageDialog(null, "Bien, has ganado");
					  }
					  else {
						  if (paloMaquina > paloMio) {
							  JOptionPane.showMessageDialog(null, "Que pena, has perdido");
						  }
					  }
				  }
		  }
	}
}


