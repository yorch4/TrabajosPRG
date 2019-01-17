package Programacion.RepasoArray;

import javax.swing.JOptionPane;

public class Ej4 {
	public static int FILAS = 5;
	public static int COLUMNAS = 5;
	
	public static boolean banderaPositiva = true;
	
	public static void main(String[] args) {
		int matriz[][] = creaMatrizAzar();
		print(matriz);
		eliminarFila(matriz);
	}
	
	public static int[][] creaMatrizAzar() {
		
		int  matriz[][] = new int[FILAS][COLUMNAS];
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = (int) (Math.round(Math.random() * (100 - (-100))+(-100)));
			}
		}
		//Matriz modificada
	/**	int  matriz[][] = new int[][]{
			{0,		8, 		2, 		5, 		7},
			{8, 	0, 		3,		8,		8},
			{2, 	3, 		0, 		8, 		0},
			{5, 	4, 		8	, 	0, 		8},
			{7, 	8, 		0, 		8, 		0}
	**/
		return matriz;
	}
	
	public static void print (int matriz[][]) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void matrizPositiva(int matriz[][]) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] < 0 ) {
					banderaPositiva = false;
				}
			}
		}
		if (banderaPositiva) {
			System.out.println();
			System.out.println("La matriz es positiva");
		} else {
			System.out.println();
			System.out.println("La matriz es normal");
		}
	}
	
	public static void matrizDiagonal(int matriz[][]) {
		boolean diagonalPositiva = true;
		boolean restoDeMatriz = true;
		
		for (int i = 0; i < FILAS; i++) {
				if (matriz[i][i] == 0) {
					diagonalPositiva = false;
				}
		}
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] != 0) {
					if (i != j)
					restoDeMatriz = false;
				}
			}
		}
		
		if (restoDeMatriz == true && diagonalPositiva == true) {
			System.out.println("La matriz ES diagonal");
		} else {
			System.out.println("La matriz NO es diagonal");
		}
	}
	public static void matrizTriangularSuperior(int matriz[][]) {
		boolean triangular = true;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (i>j) {
					if (matriz[i][j] != 0) {
						triangular = false;
					}
				}
			}
		}
		if (triangular == true) {
			System.out.println("La matriz ES triangular superior");
		} else {
			System.out.println("La matriz NO es triangular superior");
		}
	}
	
	public static void matrizDispersa(int matriz[][]) {
		int contador = 0;
		int i = 0;
		int j = 0;
		
		for (j = 0; j < COLUMNAS; j++) {
			if (matriz[i][j] == 0) {
				contador++;
				i++;
			}
		}
		
		for (i = 0, j = 0; i < FILAS; i++) {
			if (matriz[i][j] == 0) {
				contador++;
				j++;
			}
		}
		
		if (contador >= 10) {
			System.out.println("La matriz ES dispersa");
		} else {
			System.out.println("La matriz NO es dispersa");
		}
	}
	
	public static void arrayUnidimensional(int matriz[][]) {
		int indiceArray = FILAS * COLUMNAS;
		int variableArray = 0;
		int array[] = new int [indiceArray];
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				array[variableArray] = matriz[i][j];
				variableArray++;
			}
		}
		for (int i = 0; i < indiceArray; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void matrizSimetrica(int matriz[][]) {
		boolean matrizSimetrica = true;
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					matrizSimetrica = false;
				}
			}
		}
		if (matrizSimetrica == true) {
			System.out.println("La matriz ES simetrica");
		} else {
			System.out.println("La matriz NO es simetrica");
		}
	}
	
	public static void matrizTraspuesta(int matriz[][]) {
		int matrizTraspuesta[][] = creaMatrizAzar();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matrizTraspuesta[i][j] = matriz[j][i];
			}
		}
		
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matrizTraspuesta[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void matrizOpuesta(int matriz[][]) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = matriz[i][j] * (-1);
			}
		}
		print(matriz);
	}
	
	public static void eliminarFila(int matriz[][]) {
		int  matrizSinFila[][] = new int[FILAS - 1][COLUMNAS];
		int filaEliminar =Integer.parseInt(JOptionPane.showInputDialog("Pon la fila que quieres eliminar"));
		int indicePrueba = 0;
		
		for (int i = 0; i < FILAS; i++, indicePrueba++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (filaEliminar == i) {
					i++;
				}
				if (i > 4) {
					break;
				}
					matrizSinFila[indicePrueba][j] = matriz[i][j];
			}	
		}
		
		for (int i = 0; i < FILAS - 1; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matrizSinFila[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
