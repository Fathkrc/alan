package questions;

import java.util.Arrays;

public class AreSimilarBACK {
    public static void main(String[] args) {
        boolean b=solution(new int[]{1,2,3},new int[]{3,2,1});
        System.out.println(b);
    }

   static  boolean solution(int[] a, int[] b) {
        int[]arr1=a.clone();
        int[]arr2=b.clone();
        int count1=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int x=0;
        boolean bool=false;
        for(int w:arr1){
            if(w==arr2[x]){
                x++;
                bool=true;
            }else{bool=false;}
        }

        for(int i=0;i<a.length;i++){
            if(b[i]!=a[i]){
                count1++;
            }
        }
        if(count1>2){
            return false;
        }else{
            return bool;
        }}

}
