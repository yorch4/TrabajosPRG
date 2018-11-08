package Programacion.Array;import javax.swing.JOptionPane;

public class ArrayInverso {
	public static void main (String args[]) {
		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite superior"));
		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce un limite inferior"));
		int array[]= new int [150];
		int num=0;
		
		for (int i = 0; i < 150; i++) {
			num*=0;
			
			while (num<limInf){
				num = (int) Math.round(Math.random()* limSup);
			}
			array[i] = num;
			System.out.println(array[i] + "  ");
			
		}
		System.out.println("---------------- INVERSO ----------------");
		for (int i = 149; i > 0 ; i--) {
			System.out.println(array[i] + "  ");
		}
	}

}
