/* Esercizio 6
Risolvere l'esercizio 1 dell'appello del 16/09/2014
http://sferrett.web.cs.unibo.it/LPI/SLIDES/es160914.pdf */

//fattoriale
//coefficiente binomiale
//sommatoria
import java.util.Scanner;
public class Es6 {
	//main
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserire il numero n: ");
		int n = scan.nextInt();
		
		System.out.println("Inserire il numero k: ");
		int k = scan.nextInt();
		
		double stirling = (1/fattoriale(k))*sommatoria(k,n);
		
		System.out.println("Il numero di Stirling S(n,k) è: " + stirling);
		
	}
	//sommatoria
	static double sommatoria(int b, int c) {
		double somma = 0;
		int i=0;
		while (i<=b) {
			somma = somma + potenza(b-i,-1)*coeff(b,i)*potenza(c,i);
				
				i++;
		}
		return somma;
	}
	
	//coefficiente binomiale
	static double coeff(int beta, int alfa){
		double c = fattoriale(beta)/(fattoriale(alfa)*fattoriale(beta-alfa));
		
		return c;
	}
	
	//fattoriale
	static double fattoriale (double x) {
		int f = 1;
		for(int i=1;i<=x;i=i+1){
			f=f*i;
		}
		return f;
	}
	
			
	//esponente
	static double potenza(int esp, double num){
		double ris = 1;
	
		if (esp==0){
			ris = 1;
		}
		else if (esp>0){
			double[] arr = new double[esp];
			for(int i=0; i<arr.length;i++){
				arr[i]= num;
				ris = ris*arr[i];	
			}	
		}
		else {
			double[] arr = new double[-esp];
			for(int i=0; i<arr.length;i++){
				arr[i]=1/num;
				ris = ris * arr[i];
			}
		
		}	
	
		return ris;
	}
}
