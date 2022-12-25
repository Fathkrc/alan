package questions;

import java.util.Arrays;

public class DistinctArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4,8,9,};
        uniqueArray(arr);

    }
    public static void uniqueArray(int[]a){
        Arrays.stream(a).distinct().forEach(t-> System.out.println(t+" "));
    }
}
