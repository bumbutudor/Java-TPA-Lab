
package lab2;
import java.util.Scanner;

public class Paragraf {
    public Paragraf() {
        par = null;
        numCuv = 0;
        cuv = null;
    }
    public Paragraf(int numCuv) {
        Scanner in = new Scanner(System.in);
        this.numCuv = numCuv;
        cuv = new Cuvint[this.numCuv];
        par = "";
        for (int i=0;i<this.numCuv;i++)
        {
            System.out.println("Daţi cuvintul "+(i+1)+":");
            String s = in.nextLine();
            par += s+" ";
            System.out.println("Numărul de caractere");
            int n = in.nextInt();
            in.nextLine();
            if (s.length()==0)
            {
                cuv[i] = new Cuvint();
            }
            else
            {
                if (n==0){
                    cuv[i] = new Cuvint(s);
                }
                else
                {
                    cuv[i] = new Cuvint(s,n);
                }}}}
    public String toString() {
        String output = super.toString();
        output += "(";

        for(Cuvint t:cuv)
        {
            output += t + ",";
        }
        output += par;
        output += ")";
        return output;
    }
    private Cuvint[] cuv;
    private String par;
    private int numCuv;
}


