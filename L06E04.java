import java.util.Scanner;
public class L6E04{
	public static void main(String[] args){
		Scanner tastiera = new Scanner (System.in);
		String array[]=new String[4];
		System.out.println("Inserisci le quattro parole");
		for (int i=0; i<array.length; i++)
			array [i] = tastiera.next();
		String a=array[0];
		int c=a.length();
		int d=0;
		int e=0;
		for (int i=0; i<4; i++){
String b=array[i];
d=b.length();
			
			if (c < d){
				c=b.length();
				
				e=i+1;
			}
		}
		System.out.println(e);
	}
}
