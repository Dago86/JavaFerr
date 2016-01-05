Esercizio 2
Scrivere un programma in grado di leggere un file (nome specificato dall’utente) che
contiene informazioni su un insieme di studenti. Il file è fatto nel seguente modo:
- la prima riga contiene il numero di studenti riportati nel seguito del file;
- ogni successiva riga contiene le informazioni relative ad uno studente;
- ogni riga/studente ha le seguenti informazioni separate dal carattere “;” :
nome; cognome; numMatricola; dataDiNascita; luogoDiNascita.
Esempio di file
3
Mario; Rossi; 1234; 01/01/1990
Chiara; Bianchi; 1235; 02/02/1990
Silvia; Verdi; 1236; 03/03/1990
Si crei un programma in grado di leggere il file, controllare che tale file sia corretto (segue
le specifiche riportate sopra), e in caso positivo stampare a video solo i numeri di
matricola; in caso contrario, si stampi a video un avviso relativo al fatto che il file è
corrotto.




import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class EsercizioDueEsame29 {
	
	
	
public static void parseLine(String line)
//throws BadDataException
{
	Scanner lineScanner = new Scanner(line);
			
	lineScanner.useDelimiter(";");
	String name = lineScanner.next();
	String surname = lineScanner.next();
	String matricola = lineScanner.next();
	String data = lineScanner.next();
	//if (!lineScanner.next())
		//throw new BadDataException("Non ci siamo");
		
	System.out.println( "La matricola e'" + matricola);
}


	public static void main (String [] args) {
		//DataSetReader reader = new DataSetReader();
		String nomeFile = "studenti.txt";
		Scanner scanner = null;
		
		try {
			scanner = new Scanner (new File(nomeFile));
		} catch (FileNotFoundException e){
			System.out.println("Erore nell'apertura del file" + nomeFile);
			System.exit(0);
		}
			while (scanner.hasNextLine()){
			parseLine(scanner.nextLine());
			}
			scanner.close();
		}
	
}	


