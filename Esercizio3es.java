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




private static void dieciNumeri(){
		
		Scanner scanner = new Scanner (System.in);		
		int[] arr = new int[10];
		arr[0] = scanner.nextInt();
		int i = 0;
		for (i = 1; i < arr.length; i++) {
			int tmp = scanner.nextInt();
			if( tmp <= arr[i-1] ){
				break;
			}
			arr[i] = tmp;
		}
		
		System.out.println("Insert the X value: ");
		int x = scanner.nextInt();
		int j = 0;
		
		for (j = 1; j < arr.length; j++) {
			if(arr[j] > x){
				arr[j-1] = x; 
				break;
			}
		}
		
		System.out.println("arr -> " + Arrays.toString(arr));		
		scanner.close();//recupera le risorse dalla memoria
}
