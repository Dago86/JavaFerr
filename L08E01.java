//Scrivere  una classe   in  grado di  calcolare   la  somma e  la sottrazione  tra  2
//numeri interi, utilizzando esclusivamente +1 e -1. Collaudare la classe.

public class CalcolatoreFinale {
	public static int x;
	public static int y;
	public static int s;
	
	void switchone() {
		
		switch (s){
		case 1 : 
			
			somma();
			
			break ;
			
		case 2 :
			sottrazione();
			break;
		case 3 : moltiplicazione();
			break;
			default: System.out.println("No");
			break;
		}
		
	}
	
	
	public int somma(){
		int risultato =0;
		{
			for (int i= 0; i<y; i++){
				x++;
				risultato = x;
			}
			System.out.println(risultato);
			return risultato;
		}
	}
	
	public int sottrazione(){
		int risultato =0;
		{
			for (int i= 0; i<y; i++){
				x--;
				risultato = x;
			}
			System.out.println(risultato);
			return risultato;
			
			
		}
	}
	
	public int moltiplicazione(){
		int risultato= 0;
		{
			for (int i=0; i<y; i++){
				for (int l=0; l<y; l++){
					x++;
					risultato = x;
				}
			}
			System.out.println(risultato);
			return risultato;
			
		}
	}
}

import java.util.Scanner;



public class Mammita {
public static void main(String[] args) {
Scanner tastiera = new Scanner (System.in);

CalcolatoreFinale calcolatore = new CalcolatoreFinale();
calcolatore.x = 9;
calcolatore.y = 3;
calcolatore.s = tastiera.nextInt();
calcolatore.switchone();

}
}

