package Programacion.TresEnRaya;

public class Matriz {

	private static Matriz instance = null;
	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;

	int matriz[][] = new int[FILAS][COLUMNAS];
	
	/**
	 * 
	 */
	public Matriz () {
		init();
	}
	
	
	/**
	 * 
	 */
	private void init () {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = 0;
			}
		}
	}
	
	
	/**
	 * 
	 */
	public void print () {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * @return the matriz
	 */
	public int[][] getMatriz() {
		return matriz;
	}


	/**
	 * 
	 * @return
	 */
	public static Matriz getInstance () {
		if (instance == null) {
			instance = new Matriz();
		}
		return instance;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isJuegoTerminado () {
		
		if (matriz[0][0] == matriz [0][1] && matriz[0][1] == matriz[0][2] && matriz[0][2] != 0) {
			return true;
		}
		if (matriz[1][0] == matriz [1][1] && matriz[1][1] == matriz[1][2] && matriz[1][2] != 0) {
			return true;
		}
		if (matriz[2][0] == matriz [2][1] && matriz[2][1] == matriz[2][2] && matriz[2][2] != 0) {
			return true;
		}
		if (matriz[0][0] == matriz [1][0] && matriz[1][0] == matriz[2][0] && matriz[2][0] != 0) {
			return true;
		}
		if (matriz[0][1] == matriz [1][1] && matriz[1][1] == matriz[2][1] && matriz[2][1] != 0) {
			return true;
		}
		if (matriz[0][2] == matriz [1][2] && matriz[1][2] == matriz[2][2] && matriz[2][2] != 0) {
			return true;
		}
		if (matriz[0][0] == matriz [1][1] && matriz[1][1] == matriz[2][2] && matriz[2][2] != 0) {
			return true;
		}
		if (matriz[0][2] == matriz [1][1] && matriz[1][1] == matriz[2][0] && matriz[2][0] != 0) {
			return true;
		}
		
		return false;
	}
	
	public boolean isJugador1Ganador () {
		if (isJuegoTerminado() == true && matriz[0][0] == matriz [0][1] && matriz[0][1] == matriz[0][2] && matriz[0][2] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[1][0] == matriz [1][1] && matriz[1][1] == matriz[1][2] && matriz[1][2] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[2][0] == matriz [2][1] && matriz[2][1] == matriz[2][2] && matriz[2][2] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[0][0] == matriz [1][0] && matriz[1][0] == matriz[2][0] && matriz[2][0] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[0][1] == matriz [1][1] && matriz[1][1] == matriz[2][1] && matriz[2][1] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[0][2] == matriz [1][2] && matriz[1][2] == matriz[2][2] && matriz[2][2] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[0][0] == matriz [1][1] && matriz[1][1] == matriz[2][2] && matriz[2][2] == 1) {
			return true;
		}
		if (isJuegoTerminado() == true && matriz[0][2] == matriz [1][1] && matriz[1][1] == matriz[2][0] && matriz[2][0] == 1) {
			return true;
		}
		
		return false;
	}
}

