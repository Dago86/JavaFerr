import java.util.Scanner;

public class CoeffBinomiale{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int n, k;
		
		System.out.println("Inserisci n");
		n = sc.nextInt();
		//System.out.println("Inserisci k");
		k = sc.nextInt();
		int nFatt= Fatt(n);
		int kFatt= Fatt(k);
		System.out.println(CoeffBin(n, k, nFatt, kFatt));
	}


public static int Fatt(int f){
	    int tmp=0;
		int Fatt=1;
		for(int i=f-1;i>=1;i--){
			Fatt = Fatt * i;
		}
		    return Fatt=Fatt*f;
}

public static int CoeffBin(int n, int k, int nFatt, int kFatt){
	int nk= n-k;
	int nkFatt= Fatt(nk);
	int coeff = nFatt/(kFatt*nkFatt);
    return coeff;

}
}
