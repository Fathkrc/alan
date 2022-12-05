package questions;

public class Fibonacci {
    public static void main(String[] args) {
        int s=15;
        for (int i=0;i<15;i++) {
            System.out.print(fibonacci(i)+" ");
        }

    }
    public static int fibonacci(int a){
        if (a<=1) {
            return a;
        }else{
            return fibonacci(a-1)+fibonacci(a-2);
        }

    }
}
