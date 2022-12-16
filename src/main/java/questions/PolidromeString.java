package questions;

import java.util.Scanner;

public class PolidromeString {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder B=new StringBuilder(A);
        B=B.reverse();
        if(B.toString().equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
