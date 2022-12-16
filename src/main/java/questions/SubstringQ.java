package questions;

public class SubstringQ {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcomejava", 3));
        String s="hellojava";
        s=s.substring(1,3)+s.charAt(4);
        //System.out.println(s);
    }
    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String str=s.substring(0,k);
        String max=str;
        String min=str;
        for(int i=1;i<=s.length()-k;i++){
            str=s.substring(i,i+k);
            if(str.compareTo(max)<0){
                max=str;
            }else if(str.compareTo(min)>0){
                min=str;
            }
        }
        return max + "\n" + min;
    }
    }


