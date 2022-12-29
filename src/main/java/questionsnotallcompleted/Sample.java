package questionsnotallcompleted;

import java.util.Scanner;

public class Sample {
    /*
    bir stringte harf sayısını belirten bir kod yazınız
     */
    public static void main(String[] args) {
        int[]arr=new int[256];
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        for (int i=0;i<str.length();i++) {
            arr[(int)str.charAt(i)]++;
        }
        for (int j=0;j<arr.length;j++) {
            if (arr[j]!=0 && j!=32) {
                System.out.println((char)j+" cumlede "+arr[j]+ " adet bulunur");
            }
        }


    }
}
