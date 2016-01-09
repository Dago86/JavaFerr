import java.util.ArrayList;
import java.util.Scanner;


public class Contatto {
    
	private String name;
    private String phoneNumber;
    
    public Contatto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
      this.name = name;
    }
     public String getPhoneNumber() {
        return phoneNumber;
      }
     public void setPhoneNumber(String phoneNumber) {
       this.phoneNumber = phoneNumber;
     }
    

    public String toString() {
        return "PhoneBookEntry [name=" + name + ", phoneNumber="
        + phoneNumber + "]";
    }
    
    
    
  
    
    
    
    
public static void main(String[] args) {
    	Scanner tastiera = new Scanner(System.in);
    	ArrayList<Contatto> phoneNumberEntries = new ArrayList<>();
    	int on=0;
    	while (on==0){
    		System.out.println("Cosa vuoi fare? 1- inserisci, 2- elenco, 3-ricerca, 4-esci");
    		int s = tastiera.nextInt();
    		if (s==1) {
    		 
    			Inserisci();
    		 
    	
    	
    		}
    			
    			
    			
    		else if (s==2){
    			int m=phoneNumberEntries.size();
    			for(int i=0;i<m;i++){
    				System.out.println(phoneNumberEntries.get(i).getName());
    				System.out.println(phoneNumberEntries.get(i).getPhoneNumber());
    			}
    			}
    		
    			else if (s==3){
    			}
    			
    			else if (s==4){
    				on=1;
    			}
    		}
    		

}    	



}
