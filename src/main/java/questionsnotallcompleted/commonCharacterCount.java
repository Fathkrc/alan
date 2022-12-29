package questionsnotallcompleted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class commonCharacterCount {
    public static void main(String[] args) {
        // System.out.println(solution("abca","xyzbac"));
      /*  String s1="abca";
        String[] arr1=s1.split("");
        List<String>l1=Arrays.stream(arr1).sorted(String::compareTo).toList();
        //System.out.println(l1);
        String[]arr={"a","s","r","e","t","a"};
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder("sdafsadf");
        sb.deleteCharAt(1);
        System.out.println(Arrays.toString(arr)); */
        System.out.println(solution("aabca", "adcaa"));
        StringBuilder sb1 = new StringBuilder("abca");
        StringBuilder sb2 = new StringBuilder("xyzbac");
        List<String> l = new ArrayList<>();

        String[] arr = {"a", "s", "r", "e", "t", "a"};
        l = Arrays.asList(arr);
        Arrays.stream(arr).filter(t -> t.equals("e")).findFirst().map(t -> t = "x");
        System.out.println(Arrays.toString(arr));
        l.stream().filter(t -> t.equals("a")).map(t -> t = "");
        System.out.println(l);
    }

    static int solution(String s1, String s2) {
        int count = 0;
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        for (int i = 0; i < s1.length(); i++) {
            String s = arr1[i];//anymatch operator complaining if I directly give arr[i]
            if (Arrays.stream(arr2).anyMatch(t -> t.equals(s))) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j].equals(arr1[i])) {
                        arr2[j] = "";
                        break;
                    }
                }
                arr1[i] = "";
                count++;
            }
        }
        return count;
    }


}
