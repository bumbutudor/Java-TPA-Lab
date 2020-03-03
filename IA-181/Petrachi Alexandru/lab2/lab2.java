//Sarcina numarul 3

import java.util.Scanner;

public class lab2 {

    static class Paragraf{

        String paragraf;


        public Paragraf(String a){
            paragraf =a;}   //overloading
        public Paragraf(){                  //overloading

            System.out.println("Introdu numele paragrafului:");

            Scanner s = new Scanner(System.in);
            paragraf = s.nextLine();
        }

        public void show(){                 //overwriting
            System.out.println("Numele paragrafului este: " + paragraf);
        }
        public void show(String cartea){System.out.println("Paragraful: " + paragraf + " din cartea: " + cartea);}

        public void modify(){this.paragraf = "default";}
        public void modify(String numele){this.paragraf = numele;}

        public void hexDecimal(){

            StringBuffer hex = new StringBuffer();
            char cod[] = paragraf.toCharArray();

            for (int i = 0;i < cod.length ; i++){
                String hexString = Integer.toHexString(cod[i]);
                hex.append(hexString);
            }
            paragraf = hex.toString();

            System.out.println("Numele in hexDecimal: " + paragraf);
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

        @Override
        public void show(){System.out.println("Numele paragrafului este "+ paragraf +" si are " + pagini + " pagini  ");}
        @Override
        public void show(String cartea) {System.out.println("Paragraful: " + paragraf + " din cartea: " + cartea + " are " + pagini + " pagini");}

        @Override
        public void modify(){super.paragraf = "default"; this.pagini = 0;}
        public void modify(String numele, int pagini) {super.paragraf = numele; this.pagini = pagini;}

        @Override
        public void hexDecimal(){
            super.hexDecimal();
            Integer b = pagini;
            Integer.toHexString(b);
            System.out.println("Paginile in foramt hexDecimal: " + b);
        }
    }

    public static void main(String[] args) {
        Paragraf p1 = new Paragraf();
        Paragraf p2 = new Paragraf("Ziua trece");
        Pagini a1 = new Pagini();
        Pagini a2 = new Pagini("Marea dezolare",500);

        p1.show();
        p1.modify();
        p1.show();
        p1.hexDecimal();

        p2.show("Inima celor 3");
        p2.modify("Nume schimbat");
        p2.show();
        p2.hexDecimal();

        a1.show();
        a1.modify();
        a1.show();
        a1.hexDecimal();

        a2.show();
        a2.modify("Nume schimbat",6);
        a2.show("AUTOR");
        a2.hexDecimal();


    }
}
