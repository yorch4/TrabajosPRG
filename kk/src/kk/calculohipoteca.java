package kk;

public class calculohipoteca {
	
	public static void main(String[] args) {
		float euribor = (float) -0.167;
		float diferencial = (float) 0.89;
		int capital = 500000; 
		int meses = 120;
		
		float interesanual = euribor + diferencial;
		float interesmensual = (interesanual / 12) / 100;
		float potencia = (float) Math.pow(1 + interesmensual, meses);
		float cuotamensual = capital * (interesmensual * potencia) / (potencia - 1);
		
	System.out.println("La cuota mensual es " + cuotamensual);
	}

}
