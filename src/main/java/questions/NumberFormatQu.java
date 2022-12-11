package questions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatQu {
    public static void main(String[] args) {
        //true solution in java 8 but not in java 15!!
        Scanner scan=new Scanner(System.in);
        NumberFormat nUs=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nIn=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat nCh=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nFr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        try {long payment = scan.nextLong();
            System.out.println("US: "+nUs.format(payment));
            System.out.println("India: "+nIn.format(payment));
            System.out.println("China: "+nCh.format(payment));
            System.out.println("France  : "+nFr.format(payment));
        }catch(Exception e){
            System.out.println("NumberFormat Exception");
        }

    }
    }

