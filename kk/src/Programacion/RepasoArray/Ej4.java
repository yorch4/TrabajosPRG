package Programacion.RepasoArray;

public class Ej4 {
	public static int FILAS = 5;
	public static int COLUMNAS = 5;
	
	public static boolean banderaPositiva = true;
	
	public static void main(String[] args) {
		int matriz[][] = creaMatrizAzar();
		print(matriz);
		matrizDispersa(matriz);
	}
	
	public static int[][] creaMatrizAzar() {
		
	//	int  matriz[][] = new int[FILAS][COLUMNAS];
		
	//	for (int i = 0; i < FILAS; i++) {
	//		for (int j = 0; j < COLUMNAS; j++) {
	//			matriz[i][j] = (int) (Math.round(Math.random() * (100 - (-100))+(-100)));
	//		}
	//	}
		int  matriz[][] = new int[][]{
			{0,		8, 		2, 		5, 		7},
			{1, 	0, 		3,		4,		8},
			{0, 	8, 		0, 		8, 		0},
			{8, 	5, 		8	, 	0, 		8},
			{8, 	8, 		8, 		8, 		0}
		};
		return matriz;
	}
	
	public static void print (int matriz[][]) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
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

}
