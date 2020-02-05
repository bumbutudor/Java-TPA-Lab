import java.util.Scanner; // Import the Scanner class

class ReplaceAll {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduceti textul");
        String text = myObj.nextLine();  // Read user input
        System.out.println("Textul introdus este: " + text);  // Output user input

        Scanner num = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduceti lungimea cuvintului pe care doriti sa-l modificati");
        int lung = num.nextInt();

        String[] tokens = text.split(" ");

        for (String token : tokens)
            if ((token.length() == lung)) {
                String replaceString = text.replaceAll(token, "Gabi");
                System.out.println(replaceString);
            }
    }
}
