//Sarcina numarul 3

import java.util.Scanner;

public class lab2 {

    static class Paragraf{

        String numele;

        public Paragraf(String a){numele=a;}   //overloading
        public Paragraf(){                  //overloading

            System.out.println("Introdu numele paragrafului:");

            Scanner s = new Scanner(System.in);
            numele = s.nextLine();
        }

        public void show(){                 //overwriting
            System.out.println("Numele paragrafului este: " + numele);
        }

    }

    static class Pagini extends Paragraf{

        int pagini;

        Pagini(String a, int b){super(a);pagini=b;}   //overloading
        Pagini(){                                   //overloading
            System.out.println("Introdu cate pagini are paragraful:");

            Scanner s = new Scanner(System.in);
            pagini = s.nextInt();
        }

        public void show(){                         //overwriting
            System.out.println("Numele paragrafului este "+ numele+" si are " + pagini + " pagini  ");
        }
    }

    public static void main(String[] args) {
        Paragraf p1 = new Paragraf();
        Pagini a1 = new Pagini();
        Pagini a2 = new Pagini("Marea dezolare",500);

        p1.show();
        a1.show();
        a2.show();
    }
}
