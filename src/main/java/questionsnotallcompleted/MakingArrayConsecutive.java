package questionsnotallcompleted;

import java.util.Arrays;

public class MakingArrayConsecutive {
    public static void main(String[] args) {

    }
    int solution(int[] arr) {
        Arrays.sort(arr);
        int x=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=1){
                x=x+(arr[i]-arr[i-1]-1);
            }
        }
        return x;
    }
}
