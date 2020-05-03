/*
5.Sa se creeze obiectul clasa «Paragraf», folosind clasa «Cuvint».
 */

package lab2;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
            System.out.println("Nr de cuvinte");
            n = in.nextInt();

            //Cream un obiect de clasa paragraf cu un nr. n de cuvinte
        Paragraf par = new Paragraf(n);
        System.out.println(par);
    }
}

/*
Laboratorul nr.2 nu a fost complicat. Am creat 2 clase: Paragraf si Cuvint. Din clasa cuvint se creaza un paragraf.
Am lucrat cu diferite tipuri de constructori, cum ar fi constructori impliciti, cu un parametru,
cu 2 parametri. Am vazut cum 2 clase pot fi corelate.
 */