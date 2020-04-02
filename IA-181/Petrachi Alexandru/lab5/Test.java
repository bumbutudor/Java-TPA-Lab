import java.util.EmptyStackException;
import java.util.Stack;

//varianata 8

public class Test {

    public static class StackClass{

        double stack[];
        int n;
        int top = 0;

        public StackClass(int n) {
            try{
                this.n = n;
                stack = new double[n];
                System.out.println("Stack was created, with size " + n);
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("Stack's capacity must be positive" + illegalArgumentException );
            }
        }

        boolean push(int x)
        {
            try {
                if (top >= n){
                    throw new StackOverflowError();
                }else {
                    stack[top] = x;
                    System.out.println(x + " pushed into stack");
                    top++;
                }
            }catch (StackOverflowError stackOverflowError){
                System.out.println("Stack's underlying storage is overflow");
            }
            return true;
        }

        void pop()
        {
            try{
                if (top < 0) {
                    throw new EmptyStackException();
                }else{
                    double x = stack[top--];
                    System.out.println(x);
                }
            }catch (EmptyStackException emptyStackException){
                System.out.println("Stack is empty " + emptyStackException);
            }catch (ArrayIndexOutOfBoundsException arrayInedexOutOfBoundsException){
                System.out.println("Out of bounds " + arrayInedexOutOfBoundsException);
            }
        }

        void show(){
            for (int i = 0 ; i < n ; i++){
                System.out.print(this.stack[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        StackClass stackClass = new StackClass(5);

        stackClass.push(1);
        stackClass.push(2);
        stackClass.push(3);
        stackClass.push(4);
        stackClass.push(5);
        stackClass.push(6);



        stackClass.pop();
        stackClass.pop();
        stackClass.pop();
        stackClass.pop();

        stackClass.show();
    }

}
