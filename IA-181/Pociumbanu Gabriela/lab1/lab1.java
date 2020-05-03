/*
3. În textul dat,  cuvintele cu  lungimea indicată, sa se înlocuiască cu un subşir specificat, lungimea căruia  poate
să nu coincidă cu lungimea  cuvântului.
 */
package lab1;

import java.util.Scanner;

class lab1 {
    public static void main(String[] args) {

        // Cream obiectul Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti textul");

        // Citim input de la user
        String text = myObj.nextLine();

        // Afisam input de la user
        System.out.println("Textul introdus este: " + text);

        // Cream obiectul Scanner
        Scanner myNum = new Scanner(System.in);
        System.out.println("Introduceti lungimea cuvintului pe care doriti sa-l modificati");

        // Citim input de la user
        int lung = myNum.nextInt();

        //Apelam metoda Schimbare
        Schimbare(text, lung);
    }
    public static void Schimbare(String text, int lung) {
        //Fiecare cuvint din propozitie in plasam in array tokens
        String[] tokens = text.split(" ");

        // Inlocuirea cuvintelor de lungimea specificata cu cuvintul Gabi
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].length() == lung){
                tokens[i] = "Gabi";
            }
        }
        // Afisarea rezultatului
        for ( String a : tokens){
            System.out.print(a + " ");
        }
    }
}
/*
Laboratorul nr.1 a fost nu chiar complicat, dar am avut o problema cu metoda replaceAll(). Dar multumita acestui
laborator am inteles mai bine cum metoda lucreaza si de ce nu mi se potriveste la rezolvarea sarcinii date, in modul
in care am abordat-o.
 */