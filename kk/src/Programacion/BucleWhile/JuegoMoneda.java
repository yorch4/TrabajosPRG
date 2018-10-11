package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class JuegoMoneda {
	public static void main(String[] args) {
		int tirada = 0;
		int ganadas = 0;
		int perdidas = 0;
		
		do {
			int aleatorio = (int) (Math.round((Math.random())));
			tirada = Integer.parseInt(JOptionPane.showInputDialog("Elige cara (1) o cruz (0)"));
			
			if (tirada == aleatorio) {
				JOptionPane.showMessageDialog(null, "Enhorabuena, que suerte tienes");
				ganadas++;
			}
				else {
					JOptionPane.showMessageDialog(null, "Has perdido");
					perdidas++;
			}
					
		} while (ganadas != 3 && perdidas != 3); 
		if (ganadas == 3) {
			JOptionPane.showMessageDialog(null, "Enhorabuena máquina");
		}
		else {
			JOptionPane.showMessageDialog(null, "Lo siento, has perdido");
		}
		JOptionPane.showMessageDialog(null, "Has ganado " + ganadas + " veces y perdido " + perdidas + " veces");
	}

}