import java.util.Random;
import java.util.Scanner;

//Varianta 10

public class Ver1 {

    public static class Methods{
        void show(){}
        double add(){return 0;}
        double min(){return 0;}
    }

    public static class Array extends Methods{

        int col = 5;
        double[] array;

        Array(){
            Random rd = new Random();
            array = new double[col];
            for (int i = 0 ; i < array.length ; i++) {
                array[i] = rd.nextDouble();
            }
        }
        Array(int col){
            this.col = col;
            array = new double[col];
            Scanner input = new Scanner(System.in);
            for (int i = 0 ; i < col ; i++ ) {
                System.out.print("Enter number [" + i + "] : ");
                array[i] = input.nextDouble();
            }
            System.out.println("\n");
        }

        public void show(){
            for (int i = 0; i < this.col; i++) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println("\n");
        }

        public double add(Array array){

            int length = this.col > array.col ? this.col
                    : array.col;

            double result[] = new double[length];

            for (int i = 0; i < this.col ; i++) {
                result[i] += this.array[i];
            }
            for (int i = 0; i < array.col ; i++) {
                result[i] += array.array[i];
            }

            for (int i = 0; i < length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println("\n");
            return 1;
        }
        
        public double min(Array a){
            int length = this.col > a.col ? this.col
                    : a.col;

            double result[] = new double[length];

            if (this.col < a.col){
                for (int i = 0; i < this.col ; i++) {
                    result[i] -= this.array[i];
                }
                for (int i = 0; i < a.col ; i++) {
                    result[i] += a.array[i];
                }
            }else{
                for (int i = 0; i < this.col ; i++) {
                    result[i] += this.array[i];
                }
                for (int i = 0; i < a.col ; i++) {
                    result[i] -= a.array[i];
                }
            }

            for (int i = 0; i < length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println("\n");
            return 1;
        }
    }

    public static class ComplexArray extends Array{

        int row = 5;
        double[][] complexArray;

        ComplexArray(){
            Random rd = new Random();
            complexArray = new double[col][row];
            for (int i = 0 ; i < col ; i++) {
                for(int j = 0 ; j < row ; j++)
                complexArray[i][j] = rd.nextDouble();
            }
        }

        ComplexArray(int col, int row){
            this.col = col;
            this.row = row;
            complexArray = new double[col][row];
            Scanner input = new Scanner(System.in);
            for (int i = 0 ; i < col ; i++ ) {
                for (int j = 0 ; j < row ; j++) {
                    System.out.print("Enter number [" + i + "]" + "[" + j + "] : ");
                    complexArray[i][j] = input.nextDouble();
                }
            }
            System.out.println("\n");
        }

        public void show(){
            for (int i = 0 ; i < this.col ; i++) {
                for(int j = 0 ; j <this.row ; j++) {
                    System.out.print(this.complexArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }

        public double add(ComplexArray complexArray) {

            if (this.col == complexArray.col || this.row == complexArray.row) {

                double[][] sum = new double[this.col][this.row];

                for (int i = 0; i < col; i++) {
                    for (int j = 0; j < row; j++) {
                        sum[i][j] += this.complexArray[i][j];
                    }
                }
                for (int i = 0; i < col; i++) {
                    for (int j = 0; j < row; j++) {
                        sum[i][j] += complexArray.complexArray[i][j];
                    }
                }

                for (int i = 0; i < this.col ; i++) {
                    for (int j = 0; j < this.row ; j++) {
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("\n");
            }

            return 1;
        }

        public double min(ComplexArray complexArray){

            if (this.col == complexArray.col || this.row == complexArray.row) {

                double[][] sum = new double[this.col][this.row];

                if (this.col < complexArray.col) {
                    for (int i = 0; i < this.col; i++) {
                        for (int j = 0; j < this.row; j++)
                            sum[i][j] -= this.complexArray[i][j];
                    }
                    for (int i = 0; i < complexArray.col; i++) {
                        for (int j = 0; j < complexArray.row; j++)
                            sum[i][j] += complexArray.complexArray[i][j];
                    }
                } else {
                    for (int i = 0; i < this.col; i++) {
                        for (int j = 0; j < this.row; j++)
                            sum[i][j] += this.complexArray[i][j];
                    }
                    for (int i = 0; i < complexArray.col; i++) {
                        for (int j = 0; j < complexArray.row; j++)
                            sum[i][j] -= complexArray.complexArray[i][j];
                    }
                }

                for (int i = 0; i < this.col ; i++) {
                    for (int j = 0; j < this.row ; j++) {
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("\n");
            }
            else{
                System.out.println("Incorect matrix");
            }
            return 1;
        }

    }

    public static void main(String[] args) {
        Array a1 = new Array();
        Array a2 = new Array(4);
        a1.show();
        a2.show();
        a1.add(a2);
        a1.min(a2);

//        ComplexArray c1 = new ComplexArray();
//        ComplexArray c2 = new ComplexArray();
//        c2.show();
//        c1.show();
//        c1.add(c2);
//        c1.min(c2);
    }
}
