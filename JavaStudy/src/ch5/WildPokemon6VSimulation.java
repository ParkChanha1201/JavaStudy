package ch5;

import java.util.Random;

public class WildPokemon6VSimulation {
	public static void main(String[] args) {
		int[] V = {0,0,0,0,0,0};
		int Try = 0;
		
		Random r = new Random();
		
		for (int i = 0; i < V.length; i++) {
			
			while(V[i] != 31) {
				V[i] = r.nextInt(32);
				Try++;
			}
		}
		
		System.out.println(Try + "finish");
		
	}
}
