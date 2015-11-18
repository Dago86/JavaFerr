import java.util.Scanner;
public class L5E03{
	public static void main(String[] args){
		Scanner tastiera = new Scanner (System.in);
		char [] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'z'};
		System.out.println("Inserisci la parola");
		String parola;
	               parola = tastiera.next();
                        for (int i=0; i<parola.length(); i++)
                        for(int b=0; b<array.length;b++)
                        if (parola.charAt(i) == array[b]){
                        System.out.println("La cacca sciolta"+ (b+1) );}
                
       }
}

                	
            
