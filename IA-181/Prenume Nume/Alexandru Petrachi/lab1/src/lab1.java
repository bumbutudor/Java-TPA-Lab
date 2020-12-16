//Laborator cu vrianta 8
//8. Afişaţi de câte ori sunt repetate cuvintele care apar în textul dat. 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lab1 {
    public static void main( String args[]){
        String text;
        String some;
        int i = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Introdu textul:");
        text = in.nextLine();

        System.out.println("Introdu textul care doresti sa-l gasesti:");
        some = in.nextLine();

        Pattern p = Pattern.compile(some);
        Matcher m = p.matcher( text );
        while (m.find()) {
            i++;
        }
        System.out.println(i); // Prints
    }
}
