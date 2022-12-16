package questions;

import java.util.Collections;
import java.util.Scanner;

public class StringDeneme {
    public static void main(String[] args) {
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc=new Scanner(System.in);
                String A=sc.next();
                String B=sc.next();
                /* Enter your code here. Print output to STDOUT. */
                int summ=A.length()+B.length();
                A=A.substring(0,1).toUpperCase().concat(A.substring(1));
                B=B.substring(0,1).toUpperCase().concat(B.substring(1));
                System.out.println(summ);
                if(A.compareTo(B)>0){
                    /*
                    String classındaki toString methodu bu örnekten hareketle karşılaştırılan A
                    karşılaştırılan B stringinden daha büyük bir değer taşıyorsa pozitif integer return eder.
                     */
                    System.out.println("Yes");
                    System.out.print(A+" ");
                    System.out.print(B);
                }else if(A.compareTo(B)<0){
                     /*
                    Aynı şekilde karşılaştırılan A stringi B stringinden düşük bir değer taşıyorsa negatif
                     bir integer değeri return eder.
                     */
                    System.out.println("No");
                    System.out.print(A+" ");
                    System.out.print(B);
                }
                else if(A.compareTo(B)==0){
                    //eğer Stringler eşitse compareTo() methodu bize 0 return eder.
                    System.out.println("No");
                    System.out.print(A+" ");
                    System.out.print(B);
                }
            }



}
