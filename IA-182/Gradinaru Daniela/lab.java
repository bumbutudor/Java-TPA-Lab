import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Pagina {
    String text;
    int nrPag;
    public Pagina() {
        text = "Hi";
        nrPag = 1;
    }
    public Pagina( final String t, final int nr) {
        this.text = t;
        this.nrPag = nr;
    }

    public String gettext() {
        return this.text;
    }

    public int getnr() {
        return this.nrPag;
    }

    public int pagina() {
        return this.nrPag - 1;
    }

    public int pagina(final int a) {
        return this.nrPag + a;
    }
}

class Text extends Pagina {
    String textul;
    int num;
    Pagina[] pagini = new Pagina[100];

    public Text() {

        textul = " ";
        num = 0;

        System.out.println("Nu exista pagini");

    }

    public Text(final int n) throws IOException {
        textul = "";
        this.num = n;
        for (int i = 0; i < n; i++) {
            System.out.println("Dati textul din pagina");
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            final String g = br.readLine();
            System.out.println("Dati numarul paginii");
            final int b = Integer.parseInt(br.readLine());
            pagini[i] = new Pagina(g, b);
        }
    }

    public String gettext() {
        textul = "";
        for (int i = 0; i < num; i++) {
            textul = textul.concat(pagini[i].gettext());
            textul += "\n";
            textul = textul.concat(Integer.toString(pagini[i].getnr()));
            textul += "\n";

        }
        return textul;
    }

    public String paginile() {
        textul = "";
        for (int i = 0; i < num; i++) {
            textul = textul.concat(pagini[i].gettext());
            textul += "\n";
            textul = textul.concat(Integer.toString(pagini[i].pagina()));
            textul += "\n";

        }
        return textul;
    }

    public String paginile(final int a) {
        textul = "";
        for (int i = 0; i < num; i++) {
            textul = textul.concat(pagini[i].gettext());
            textul += "\n";
            textul = textul.concat(Integer.toString(pagini[i].pagina(a)));
            textul += "\n";

        }
        return textul;
    }

}

public class lab2 {
    public static void main(final String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        System.out.println("Dati numar de pagini");
        final int n = in.nextInt();

        Text tx = new Text(n);
        Pagina pag = new Pagina("Continut pagina 4", 4);
        pag.gettext();
        


            System.out.println(tx.gettext());
            
            System.out.println(tx.paginile(5));
            
            System.out.println(tx.paginile());
       }
}