Esercizio 3
Scrivere un programma che faccia le seguenti cose:
- richiede all'utente l'inserimento, in ordine strettamente crescente, di una serie di numeri
interi (al massimo 10), salvandoli in un array num. L'acquisizione termina dopo l'inserimento
del decimo numero, o dopo che l'utente inserisce un numero non ordinato (questo numero
non deve essere salvato in num);
- stampa a video l’array acquisito;
- acquisisce dall'utente un nuovo numero intero x;
- sostituisce l’ultimo elemento di num che ha valore più piccolo di x, con il valore di x;
- stampa a video l’array num ottenuto.
Usare gli array, NON gli ArrayList
ESEMPIO (NOTA: è solo un esempio, NON deve funzionare SOLO con questi valori)
se in num avessimo memorizzato i valori
num → 2 4 6 8 10 12 14 16 18 20
e in x avessimo memorizzato il valore 11, l’array num diventerebbe
num → 2 4 6 8 11 12 14 16 18 20





import java.util.Scanner;

public class Esercizio3es {
	
	public static void main (String [] args) {
		int temp = 0;
		Scanner scanner = new Scanner (System.in);
		int [] arr = new int [10];
		System.out.println("Inserisci valori");
				{
				for (i=0; i<arr.length; i++)
					{
						arr[i]= scanner.nextInt();
				
					}
		}
		
		for(int i= 0;i<arr.length;i++)
			System.out.print(arr[i]);
		
		System.out.println("Inserisci la x");
		int x = scanner.nextInt();
		for(int i= 1;i<arr.length;i++)
		{
			if (arr[i]>x){
				arr[i-1]=x;
			break;}
			if (arr[9]<x)
				arr[9]=x;
			
			
		}
		for(int i= 0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
	
}
