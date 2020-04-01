//Laborator 1
//Varianta 8
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class lab1 {
    public static void main( String args[]){
        String text;
        String some;
        int i = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Introdu textul:");
        text = in.nextLine();

        System.out.print("Introdu cuvantul care doresti sa-l gasesti:");
        some = in.nextLine();

        Pattern p = Pattern.compile(some);
        Matcher m = p.matcher(text);
        while (m.find()) {
            i++;
        }
        System.out.print("Cuvantul a fost intalnit in text de " + i + " ori.");
    }
}
