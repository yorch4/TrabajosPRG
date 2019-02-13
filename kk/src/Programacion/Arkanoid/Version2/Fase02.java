package Programacion.Arkanoid.Version2;

import Programacion.TresEnRaya.Matriz;

public class Fase02 extends Fase {
	private static Matriz instance = null;
	public static final int FILAS = 6;
	public static final int COLUMNAS = 8;

	int matriz[][] = new int[FILAS][COLUMNAS];
	
	@Override
	public void inicializaFase() {
		matriz[0][0] = 10;
		matriz[1][0] = 1;
		matriz[2][0] = 1;
		matriz[3][0] = 1;
		matriz[4][0] = 1;
		matriz[5][0] = 10;
		matriz[0][1] = 1;
		matriz[1][1] = 1;
		matriz[2][1] = 3;
		matriz[3][1] = 6;
		matriz[4][1] = 1;
		matriz[5][1] = 1;
		matriz[0][2] = 1;
		matriz[1][2] = 3;
		matriz[2][2] = 5;
		matriz[3][2] = 1;
		matriz[4][2] = 3;
		matriz[5][2] = 1;
		matriz[0][3] = 1;
		matriz[1][3] = 3;
		matriz[2][3] = 3;
		matriz[3][3] = 1;
		matriz[4][3] = 3;
		matriz[5][3] = 1;
		matriz[0][4] = 1;
		matriz[1][4] = 3;
		matriz[2][4] = 3;
		matriz[3][4] = 1;
		matriz[4][4] = 3;
		matriz[5][4] = 1;
		matriz[0][5] = 1;
		matriz[1][5] = 3;
		matriz[2][5] = 1;
		matriz[3][5] = 1;
		matriz[4][5] = 3;
		matriz[5][5] = 1;
		matriz[0][6] = 1;
		matriz[1][6] = 1;
		matriz[2][6] = 6;
		matriz[3][6] = 3;
		matriz[4][6] = 1;
		matriz[5][6] = 1;
		matriz[0][7] = 10;
		matriz[1][7] = 1;
		matriz[2][7] = 1;
		matriz[3][7] = 1;
		matriz[4][7] = 1;
		matriz[5][7] = 10;
		
	    for (int x=0; x < matriz.length; x++) {
	        for (int y=0; y < matriz[x].length; y++) {
	        	if (matriz[x][y] != 10) {
		        	Ladrillo l = new Ladrillo((Arkanoid.ANCHO/2 - Ladrillo.ANCHO*COLUMNAS/2) + x*34,y * 34,matriz[x][y]);
			    	actores.add(l);
	        	}
	        }
	      }
	}

}
