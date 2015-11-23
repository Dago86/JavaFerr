import java.util.Scanner;


class Matrici {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner (System.in);
		System.out.println("Inserisci la grandezza della matrice");
		int righe = tastiera.nextInt();
		int colonne = tastiera.nextInt();
		int a[][]=new int[righe][colonne];
		int i, j;
		int n=1;
		for(i=0; i<=righe-1; i=i+1) {
			for(j=0; j<=colonne-1; j=j+1) {
				a[i][j]=n;
				n++;
			}
		}
		
		for(i=0; i<=righe-1; i=i+1) {
			for(j=0; j<=colonne-1; j=j+1) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
