 
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.print("Introduceti Textul : ");						//Preluam Textul de la Utilizator 				
	    String text = myObj.nextLine(); 
	    
	    System.out.print("Introduceti Caracterul de Extragere : ");		//Preluam Caracterul de Extragere
	    String caracter = myObj.nextLine();  
	        
	    String text_extras="";String text_ramas="";						//Cream 2 stringuri pentru delimitarea

	    char cc=caracter.charAt(0);
	    for(int i=0;i<text.length();i++)								
	    {
	    	char c = text.charAt(i);									//Preluam cate 1 caracter din textul initial
	    	if(c==cc)text_extras+=c;									//Verificam daca coincide cu caracterul de extragere
	    	else text_ramas+=c;	
	    }
	    
	    System.out.println("Text Extras  : " + text_extras);  			//Afisam Textele obtinute
	    System.out.println("Text Ramas  : " + text_ramas);  
	    
	    System.out.print("Introduceti Simbolul pentru Inserare : ");	//Preluam simbolul dupa care trebuie de inseraat
	    caracter = myObj.nextLine();  
	    
	    text_extras="";
	    cc=caracter.charAt(0);
	    
	    System.out.print("Introduceti Textul Pentru Inserare : ");		//Preluam textul de inserare dupa simbol
	    caracter = myObj.nextLine();  
	    
	    for(int i=0;i<text.length();i++)
	    {
	    	char c = text.charAt(i);									//Preluam cate 1 simbol din textul initil
	    	if(c==cc)text_extras+=c+caracter;							//Verifica daca coincide cu simbolul de inserare
	    	else text_extras+=c;
	    }
	    
	    System.out.println("Text Extras  : " + text_extras);  			//Afisam textul obtinut
	}
}  
