package questions;

public class DistinctArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,4,8,9,};
        uniqueArray(arr);

    }
    public static void uniqueArray(int[]a){
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a.length;j++) {
                if (a[i] == a[j] && i == j) {
                    continue;
                } else {
                    System.out.println(a[i]);
                }
            }



        }

    }
}
