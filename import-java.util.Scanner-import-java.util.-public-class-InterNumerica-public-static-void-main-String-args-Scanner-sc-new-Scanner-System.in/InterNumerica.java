Si crei un programma java per la gestione di un insieme di elementi di tipo numerico. L’interfaccia utente deve permettere di effettuare operazioni in maniera interattiva e iterativa (finchè l’utente non decida di terminare il programma).
Le operazioni da implementare sono le seguenti:
- inserzione di un elemento nell’insieme
- verifica della presenza di un elemento nell’insieme
- rimozione di un elemento dall’insieme (se è presente)
- stampa di tutti gli elementi nell’insieme
- stampa degli elementi superiori a un valore dato dall’utente - sommatoria dei valori nell’insieme
- media dei valori dell’insieme 







import java.util.Scanner;
import java.util.*;

public class InterNumerica{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		//creo un array list
		int s=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Decidi cosa vuoi fare: 1- Inserzione elemento 2- verifica presenza 3- rimozione di un elemento 4-stampa tutti gli elementi 5- stampa gli elementi superiore ad un valore dato 6-fai la media dei valori");
		do {
			s = sc.nextInt();
			if(s==1){
				System.out.println("Aggiungi un valore");
				al.add(sc.nextInt());
			}
			else if(s==2){
				System.out.println("Quale valore vuoi controllare?");
				boolean element = al.contains(sc.nextInt());
				if (element){
				System.out.println("Lo contiene");
				}else
				System.out.println("Non lo contiene...");
			}
			else if(s==3){
				System.out.println("Quale valore vuoi elminare=?");
				al.remove(sc.nextInt());
			}
			else if(s==4){
				System.out.println("Arraylist contains: " + al.toString());
			}
			else if(s==5){
	
			}
			else if(s==6){
				long sum = 0;
				int n = al.size();
				for (int i = 0; i < n; i++)
					sum += al.get(i);
				System.out.println(((double)sum)/n);
			}
			
      
			
		}while (s < 7); 
		
	}
}
