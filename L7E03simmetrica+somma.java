import java.util.Scanner;


class L7E03simmetrica {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner (System.in);
		System.out.println("Inserisci la grandezza della matrice");
		int righe = tastiera.nextInt();
		int colonne = tastiera.nextInt();
		int a[][]=new int[righe][colonne];
		int n=1;
		for(int i=0; i<=righe-1; i=i+1) {
			for(int j=0; j<=colonne-1; j=j+1) {
				a[i][j]=tastiera.nextInt();
			}
		}
		
		for(int i=0; i<=righe-1; i=i+1) {
			for(int j=0; j<=colonne-1; j=j+1) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		int flag = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j] != a[j][i])
				{
					flag = 1; // Setting flag = 1 when elements do not match
					break;
				}
			}
		}
		
		if(flag == 1)
			System.out.println("\nThe given Matrix is Not Symmetric");
		else
			System.out.println("\nThe given Matrix is Symmetric");
		
		
		
	}
}

//------------------------------------------------------------------------------//

import java.util.Scanner;


class L7E03somma {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner (System.in);
		System.out.println("Inserisci la grandezza della matrice");
		int righe = tastiera.nextInt();
		int colonne = tastiera.nextInt();
		int a[][]=new int[righe][colonne];
		for(int i=0; i<=righe-1; i=i+1) {
			for(int j=0; j<=colonne-1; j=j+1) {
				a[i][j]=tastiera.nextInt();
			}
		}
		
	 System.out.print("Inserisci la seconda matrice ");

		
		int b[][]=new int[righe][colonne];
		for(int i=0; i<=righe-1; i=i+1) {
			for(int j=0; j<=colonne-1; j=j+1) {
				b[i][j]=tastiera.nextInt();
			}
		}
		
		
		for(int i=0; i<=righe-1; i=i+1) {
			for(int j=0; j<=colonne-1; j=j+1) {
				System.out.print((a[i][j]+b[i][j]) +" ");
			}
			System.out.println("");
		}
	}
}


