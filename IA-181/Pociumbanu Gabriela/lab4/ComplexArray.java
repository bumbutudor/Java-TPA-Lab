package lab4;

import java.util.Random;

public class ComplexArray extends ComplexNumber {
    private ComplexNumber[][] complexArray;

    private Random rand = new Random();

    private double computeRandom() {
        int randomNum = (int) ((rand.nextDouble() - 0.5) * rand.nextInt(20) * 100);
        return randomNum / 100.0;
    }

    // Constructor de numere random
    public ComplexArray(int rows, int cols) {
        super();
        double real = 0;
        double img = 0;

        ComplexNumber[][] complexArray = new ComplexNumber[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < cols; j++) {
                real = computeRandom();
                img = computeRandom();
                complexArray[i][j] = new ComplexNumber(real, img);
                System.out.print(complexArray[i][j].toString());
                System.out.print("\t ");
            }
        }

    }

    @Override
    public String toString() {
        int rows = 0, cols = 0;
        ComplexArray s = new ComplexArray(rows, cols);
        String out = "\t";
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                out = s.toString();
                out += "  ";
            }
        out += "\t";
        return out;
    }
}
