import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

//8. Afişaţi de câte ori sunt repetate cuvintele care apar în textul dat. 

public class lab_1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduceti propozitia");
		
		String str = keyboard.nextLine();
		
		str = str.toLowerCase();
		
		String []words = str.split("\\W+");
		
		List<String> list = new ArrayList<String>();
		
		/*
		for (String word: words) {
			System.out.println(word);
		}
		*/
		
		int end = words.length;
		Set<String> set = new HashSet<String>();

		for(int i = 0; i < end; i++){
		  set.add(words[i]);
		}
		
		java.util.Iterator<String> it = set.iterator();
		while(it.hasNext()) {
//		  System.out.println(it.next());
			list.add(it.next());
		}
		
		int [] nr = new int[list.size()]; //pastram numarul de aparitii
		
		for (int i=0; i<list.size(); i++) {
			nr[i] = 0;
		}
		
		for (int i=0; i<words.length; i++) {
			String word = words[i];
			int index = list.indexOf(word);
			nr[index] = nr[index] + 1;
		}
		
		for (int i=0; i< list.size(); i++) {
			String word = list.get(i);
			System.out.println(word + " -> " + nr[i]);
		}
	}
}

/*
 * Concluzii:
 * Efectuând această lucrare de laborator am însușit modelitățile de creare a claselor și obiectelor în Java, 
 * de asemenea am însușit și modalitățile de prelucrare a șirulor de caractere utilizând clasele de bază. 
 * Astfel am combinat informația predată de la curs și sfaturile de la lecțiile de laborator pentru a efectua un program 
 * conform sarcinii stabilite. 
 * Programul citeste de la tastatura un sir de caractere, il imparte in cuvinte si calculeaza numarul lor de aparitii in textul 
 * citit de la tastatura.
 * 
 */
