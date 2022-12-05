package questions;

public class PolidromNumber {
    //if number x is palindrome, return true;
    // palindrome input =121 reverse 121 ==> true input -121 reverse 121- ==>false

    public static boolean isPalindrome(int x) {


        String str=String.valueOf(x);
        StringBuilder strB=new StringBuilder(String.valueOf(x)).reverse();
        boolean b=strB.toString().equals(str);
        return b;
    }
    public static void main(String[] args) {


        System.out.println(isPalindrome(1221));





    }
}
