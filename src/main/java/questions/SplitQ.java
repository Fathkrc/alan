package questions;

import java.util.Scanner;

public class SplitQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean b=true;
        String s = scan.nextLine();
        if(!s.trim().contains(" ")){
            System.out.println("1");
            System.out.println(s.trim());

        }else if(s.trim().length()==0){
            System.out.println("0");
        }else if(s.trim().isBlank()) {
            System.out.println("0");
        }else{
            String[]arr=s.replaceAll("\\p{Punct}", " ").replaceAll("\\s+"," ").trim().split(" ");
            System.out.println(arr.length);

            for (String w : arr) {
                if(w.isBlank()){
                    b=false;
                    continue;
                }else{
                    System.out.println(w);}
            }}
        if(!b){
            System.out.println("0");

        }
        scan.close();}}


