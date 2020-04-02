import java.util.Date;
//var 1,2
public class lab3 {

    interface Persoana{
        String nume = "default";
        int varsta = 00;

        String creat();
        void time();
    }

    public static class Methods implements Persoana{

        public String creat(){
            Date date = new Date();

            String info = "\nCand a fost creat obiectul:\n" +
                    date.toString() +
                    "\nTimpul in milesecunde: " +
                    System.currentTimeMillis();

            return info;
        }

        public void time(){
            Date date = new Date();
            System.out.println("---------------------------------------------");
            System.out.println("Cand a fost afisat obiectul:");
            System.out.println(date.toString());
            System.out.println("Timpul in milesecunde: " + System.currentTimeMillis());
            System.out.println("_____________________________________________");
        }
    }

    public static class subClass extends Methods{

        String nume,info;
        int varsta;

        subClass(){
            info = creat();
            System.out.println(info);
        }

        subClass(String nume, int varsta){
            this.nume = nume;
            this.varsta = varsta;
            info = creat();
            System.out.println(info);
        }

        public void show(){
            System.out.println("\n_____________________________________________");
            System.out.println("Metoda show:");
            System.out.println("Numele: " + nume + " \nVarsta: " + varsta + " \nInfo: " + info);
            time();
        }

        public void showDefault(){
            System.out.println("\n_____________________________________________");
            System.out.println("Metoda show default:");
            System.out.println("Numele: " + Persoana.nume + " \nVarsta: " + Persoana.varsta + " \nInfo: " + info);
            System.out.println("_____________________________________________");
            time();
        }
    }

    public static void main(String args[]) {

        subClass s1 = new subClass("Vasilica",6);
        s1.show();

        subClass s2 = new subClass();
        s2.showDefault();
    }
}
