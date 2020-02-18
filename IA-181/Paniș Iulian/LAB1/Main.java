import java.util.*;
public class Main {

    public static void main(String[] args) {
        //obiect scanner
        Scanner scanner = new Scanner(System.in);

        //mesaj text pozitie
        System.out.print("Introduceti mesajul initial: ");
        String mesaj = scanner.nextLine();

        System.out.print("Introduceti textul pentru inserare: ");
        String txt = ' '+ scanner.nextLine()+ ' ';

        System.out.print("Introduceti pozitia pentru inserare: ");
        int n = scanner.nextInt();

        //inserarea textului dupa pozitie
        StringBuffer msg = new StringBuffer(mesaj);

        msg.insert(n, txt);

        System.out.print("Dupa inserare: ");
        System.out.println(msg.toString());

    }
}
