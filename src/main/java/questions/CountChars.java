package questions;

import java.util.Arrays;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        int[]counter=new int[256];
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen cumle girisi yapınız");
        String sentence =input.nextLine();
        for (int i=0;i<sentence.length();i++) {
            counter[(int)sentence.charAt(i)]++;
        }
        for (int j=0;j< counter.length;j++) {
            if (counter[j]!=0) {
                if ((char)j==' ') {
                    continue;
                }else{
                System.out.println((char)j+" - cümlede "+counter[j]+" adet bulunmaktadır");
            }}
        }
    }}


