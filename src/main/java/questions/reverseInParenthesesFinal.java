package questions;

public class reverseInParenthesesFinal {
    public static void main(String[] args) {
    }
    String solution(String s) {
        int firstIndex=s.lastIndexOf("(");
        int lastIndex=s.indexOf(")",firstIndex);
        while(firstIndex!=-1){
            String firstPart=s.substring(0,firstIndex);
            String revPart=s.substring(firstIndex+1,lastIndex);
            String lastPart=s.substring(lastIndex+1);
            s=firstPart+reverse(revPart)+lastPart;
            firstIndex=s.lastIndexOf("(");
            lastIndex=s.indexOf(")",firstIndex);
        }
        return s;

    }
    String reverse(String s){
        StringBuilder sb=new StringBuilder(s);

        return sb.reverse().toString();
    }
}
