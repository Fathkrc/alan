package questions;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int summ=A.length()+B.length();
        System.out.println(summ);
        System.out.println(A.compareTo(B));


        if(A.compareTo(B)<0){
            System.out.println("Yes");
            A.substring(1).toUpperCase();
            System.out.println(A+" ");
            B.substring(1).toUpperCase();
            System.out.println(B+" ");

        }else if(A.compareTo(B)>0){
            System.out.println("No");
            B.substring(0,1).toUpperCase();
            System.out.println(B+" ");
            A.substring(0,1).toUpperCase();
            System.out.println(A+" ");
        }
        else if(A.compareTo(B)==0){
            System.out.println("why");
            A.substring(0,1).toUpperCase();
            System.out.print(A+" ");
            B.substring(0,1).toUpperCase();
            System.out.print(B+" ");

        }
    }
}
