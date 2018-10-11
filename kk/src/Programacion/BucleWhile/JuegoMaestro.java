package Programacion.BucleWhile;

import javax.swing.JOptionPane;

public class JuegoMaestro {
	public static void main(String[] args) {
		int tirada = 0;
		int numeroPensado = (int) (Math.round((Math.random() * 100)));
		System.out.println("numero" + numeroPensado);
		
		do {
			tirada = Integer.parseInt(JOptionPane.showInputDialog("Busca el numero pensado (0 - 100): "));
			
			if (tirada > numeroPensado) {
				JOptionPane.showMessageDialog(null, "El numero debe ser menor");
			}
				else {
					if (tirada < numeroPensado){
						 {
							 JOptionPane.showMessageDialog(null, "El numero debe ser mayor");
						}
					}
					else {
								JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado");
					}
					
			}
					
		} while (numeroPensado != tirada); 
	}

}
