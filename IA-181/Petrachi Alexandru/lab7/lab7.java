import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//varianta 4

public class lab7 {

    ArrayList<Double> arrayList;
    int n = 5;

    lab7() {
        arrayList = new ArrayList<Double>(n);
    }

    lab7(int n) {
        this.n = n;
        arrayList = new ArrayList<Double>(n);
    }

    public void AtribRandom(){
        Random rd = new Random();

        for (int i = 0 ; i < this.n ; i++){
            this.arrayList.add(i, rd.nextDouble());
        }
    }

    public void AtribManual(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < this.n ; i++){
            System.out.print("Enter element " + "[" + i + "] :");
            this.arrayList.add(i, sc.nextDouble());
        }
    }

    public void Disply(){
        System.out.print("\nVector: ");
        for (int i = 0 ; i < this.n ; i++){
            System.out.print(new DecimalFormat("##.##").format(this.arrayList.get(i)) + " ");
        }
    }

    public static void main(String[] args) {
        lab7 a1 = new lab7();
        lab7 a2 = new lab7(3);

        a2.AtribManual();
        a2.Disply();
    }
}