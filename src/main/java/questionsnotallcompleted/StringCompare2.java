package questionsnotallcompleted;

import java.util.Scanner;

public class StringCompare2 {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int summ=A.length()+B.length();
        System.out.println(summ);
        if(A.compareTo(B)<0){
            System.out.println("Yes");
            A.substring(0,1).toUpperCase();
            System.out.println(A+" ");
            B.substring(1).toUpperCase();
            System.out.println(B+" ");

        }else if(A.compareTo(B)>0){
            System.out.println("No");
            A.substring(0,1).toUpperCase();
            System.out.println(B+" ");
            B.substring(1).toUpperCase();
            System.out.println(B+" ");
        }
        else if(A.compareTo(B)==0){
            System.out.println("Yes");
            A.substring(0,1).toUpperCase();
            System.out.println(A+" ");
            B.substring(1).toUpperCase();
            System.out.println(B+" ");


        }
    }
}
