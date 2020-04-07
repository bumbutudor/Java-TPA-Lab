
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws customException {

             System.out.print("Pentru calculul rezistentei electrice in circuit introduceti numarul de experiente: ");

             Scanner scn = new Scanner(System.in);
             int n = scn.nextInt();

             int[] tensiunea = new int[n];
             int[] intensitatea = new int[n];
             double[] rezistenta = new double[n];
             double rezistentaMedie = 0;

             System.out.println("\nIntroduceti consecutiv rezultatele experientelor: ");
             System.out.println("Tensiunea: ");


             for (int i = 0; i < n; i++) {
                 System.out.print("U" + (i + 1) + " = ");
                 tensiunea[i] = scn.nextInt();

                 //verificarea corectitudinii datelor introduse
                 if(tensiunea[i]<0){
                     //utilizarea constructorului supraincarcat
                     throw new customException(tensiunea[i]);
                 }
             }

             System.out.println("Intensitatea: ");
             for (int i = 0; i < n; i++) {
                 System.out.print("I" + (i + 1) + " = ");
                 intensitatea[i] = scn.nextInt();

                 //verificarea corectitudinii datelor introduse
                 if(intensitatea[i]<0){
                     //utilizarea constructorului fara parametri
                     throw new customException();
                 }
             }

        //blocul pentru verificarea impartirii la 0
        try {
            System.out.println("Rezultatele rezistentei pentru fiecare experienta");
            for (int i = 0; i < n; i++) {
                rezistenta[i] = tensiunea[i] / intensitatea[i];
                System.out.print("R" + (i + 1) + " =" + rezistenta[i] + " ohmi; ");
            }



             System.out.print("\nRezitenta medie:");
            for (int i = 0; i < n; i++) {
                rezistentaMedie += rezistenta[i];
            }
            rezistentaMedie /= n;

             System.out.println(rezistentaMedie +" ohmi");

        } catch (ArithmeticException e){
        System.out.println("\n!!!Eroare in cadrul operatiilor aritmetice!!!");


    }
}

//clasa pentru tratarea exceptiilor individuale

 static class customException extends Exception {

     //constructor fara parametri
     public customException() {
         super("Valoare inadmisibila");
     }

     //constructor cu un singur parametru
     public customException(double value) {
         super("Valoare inadmisibila: " + value);
     }
 }
}
