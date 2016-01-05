
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDriver {

	public static void main(String[] args) {
		
		String fileName = "studenti.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.print("Checking string: [" + line + "]...");
				if( studentChecked(line) == false ) {
					System.out.println("[ERROR] >>> The line: doesn't match the line format");
				} else {
					System.out.println("OK!");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private static boolean studentChecked(String studentString){
		String nameRE = "\\s*^[A-Z][a-z]{3,20}\\s*[;]{1}\\s*[A-Z]{1}[a-z]{3,20}\\s*";
		String matricolaRE = "\\s*[0-9]+\\s*";
		String dataRE = "\\s*[0-9]{2}[/][0-9]{2}/[0-9]{4}\\s*";
		String separator = "[;]{1}";
		Pattern checkStudent = Pattern.compile(nameRE + separator + matricolaRE + separator + dataRE);
		Matcher regexMatcher = checkStudent.matcher(studentString);
		if(regexMatcher.find()){
			//System.out.println(regexMatcher.group().trim());
			return true;
		}
		return false;
	}
	
}
