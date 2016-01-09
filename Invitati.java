Esercizio 2
Si supponga di dover gestire una lista di invitati ad un qualche ricevimento. La lista di invitati
è memorizzata in un file (il cui nome dovrà essere specificato dall’utente). Il file è fatto nel
seguente modo:
- ogni riga contiene le informazioni relative ad un invitato;
- ogni riga ha le seguenti informazioni separate dal carattere “,” :
nome, cognome, num_telefono, Y/N_specifica_se_ha_confermato_partecipazione
Si crei un programma in grado di leggere il file, controllare che tale file sia corretto (segue le
specifiche riportate sopra), e in caso positivo stampare a video solo gli invitati che hanno
confermato la loro partecipazione; in caso contrario, si stampi a video un avviso relativo al
fatto che il file è corrotto.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Invitati{

public static void main(String [] args){
	
	String fileName = "invitati.txt";
	
	try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
	String line;
	while ((line = br.readLine()) != null){
			System.out.print("Controllo la stringa" + line);
			if (invitatoChecked(line) == false){
				System.out.println("Errore");
			}else{
				 System.out.println("Ok!");
			}
	}
} catch(IOException e){
	e.printStackTrace();
}


}
private static boolean invitatoChecked(String invitatoString){
String nameRE = "\\s*^[A-Z][a-z]{3,20}\\s*[;]{1}\\s*[A-Z]{1}[a-z]{3,20}\\s*";
String telnumbRE= "\\s*[0-9]{4}[/][0-9]{5}\\s*";
String specificaRE= "\\s*[Y|N]{1}\\s*";
String separator= "[;]{1}";
Pattern checkInvitato = Pattern.compile(nameRE + separator + telnumbRE + separator + specificaRE);
Matcher regexMatcher=checkInvitato.matcher(invitatoString);
if(regexMatcher.find()){
			//System.out.println(regexMatcher.group().trim());
			return true;
		}
		return false;
	}
}
