package questions;

import java.util.*;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        Object[] arr2=list.stream().toArray();
    }
   static boolean solution(int[] arr) {
       List<Integer>list=new ArrayList<>();
       for (Integer w:arr) {
           list.add(w);
       }
       Collections.sort(list);
       for(int i=0;i<list.size();i++){
           if(list.get(i)-list.get(i-1)>1){
               list.remove(list.indexOf(i));
           }
       }
    return false;}
 /* static  boolean <E> boolean isWorking(E[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                return true;
            }
            else return false;
        }
        return false;
    }*/
}
