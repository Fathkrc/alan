package questionsnotallcompleted;


import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String a = "bbcc";
        String b = "dabc";
        System.out.println((isAnagram(a, b)) ? "Anagram" : "Not Anagram");
    }

    static boolean isAnagram(String a, String b) {
        // İLK DENEME
        /*int x=a.compareToIgnoreCase(b);
        int y=b.compareToIgnoreCase(a);
        if (x==y||x==-y) {
            return true;
        }else{
            return false;*/
        //İKİNCİ DENEME
        /*
        int sum1=0;
        int sum2=0;
        byte[]arr1=a.toLowerCase().getBytes();
        byte[]arr2=b.toLowerCase().getBytes();
        for (byte w:arr1) {
            sum1+=w;
        }
        for (byte w:arr2) {
            sum2+=w;
        }
        if (sum1==sum2) {
            return true;
        }else{
        return false;
        }}
*/
        // ÜÇÜNCÜ DENEME
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }


    }
}
