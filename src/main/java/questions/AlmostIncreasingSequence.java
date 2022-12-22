package questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        List<Integer> list=arr.clone();

    }
    boolean solution(int[] arr) {
        if(isWorking(arr)){
            return true;
        }else{
            for(int i=0;i<arr.length;i++){


            }
        }
    }
    boolean isWorking(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                return true;
            }
            else return false;
        }
        return false;
    }
}
