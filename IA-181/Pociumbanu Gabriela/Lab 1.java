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
        for (String token : tokens) {
            if ((token.length() == lung)) {
                //System.out.println(token);
                tokens[token] = "";
                    System.out.println(token);

            }
        }
        for ( String a : tokens){
            System.out.print(a + " ");
        }
    }
}
