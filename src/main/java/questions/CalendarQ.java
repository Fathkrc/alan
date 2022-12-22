package questions;

import java.util.Calendar;
import java.util.Date;

public class CalendarQ {
    public static void main(String[] args) {
        System.out.println(solution(2001));


    }
   static int solution(int year) {
       try{
           String str=Integer.toString(year).substring(0,2);
           int y=Integer.valueOf(str);
           if(year<100){
               return 1;
           }
           if(year<1000){
               if(y%10==0){
                   return y/10;
               }else{
                   return y/10+1;
               }

           }
           if(year<2001){
               if(year%100==0){
                   return y;
               }else{
                   return y+1;
               }
           }
           if(year>2000){
               return 21;
           }
           else{
               return 1;
           }

       }catch(Exception e){
           return 1;
       }







   }
}
