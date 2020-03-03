import java.lang.reflect.Array;
import java.util.Scanner; // Import the Scanner class
import java.util.StringTokenizer;

class ReplaceAll {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduceti textul");
        String text = myObj.nextLine();  // Read user input
        System.out.println("Textul introdus este: " + text);  // Output user input

        Scanner num = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduceti lungimea cuvintului pe care doriti sa-l modificati");
        int lung = num.nextInt();
        Schimbare(text, lung);
    }
    public static void Schimbare(String text, int lung) {
        String[] tokens = text.split(" ");
        // inlocuirea cuvintelor de lungimea specificata
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].length() == lung){
                tokens[i] = "Gabi";
            }
        }
        // afisare
        for ( String a : tokens){
            System.out.print(a + " ");
        }
    }
}
/* Laboratorul nr.1 a fost nu chiar complicat, dar am avut o problema cu metoda replaceAll(). Dar multumita acestui
laborator am inteles mai bine cum metoda lucreaza si de ce nu mi se potriveste la rezolvarea sarcinii date, in modul
in care am abordat-o.
 */