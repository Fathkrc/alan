package questionsnotallcompleted;

public class reverseInParentheses {
    String solution(String s) {
        int b=0;
        int l=0;
        int count=0;
        String[]arr=s.split("");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("(")){
                b=i;
            }
            if(arr[i].equals(")")){
                l=i;
                for(int j=b+1;j<l;j++){
                    arr[j]=arr[l-1];
                    l--;
                }
            }
        } String asd="";
        for(String w:arr){
            if(!w.equals("(")&&!w.equals(")")){
                asd=asd+""+w;
            }
        }
        return asd;
    }
    /*
    String solution(String s) {
    int b=0;
    int l=0;
    int count=0;
String[]arr=s.split("");
String str="";
String str1="";
// StringBuilder str=new StringBuilder();
// StringBuilder str1=new StringBuilder();
for(int i=0;i<s.length();i++){
    if(arr[i].equals("(")){
        str=s.substring(i);
    }
}
for(int i=0;i<str.length();i++){
    if(str.charAt(i)==')'){
        str1.substring(i);
    }
}
str=reverse(str.replaceAll(str, ""));
for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='('){
        b=i;
    }else if(s.charAt(i)==')'){
        l=i;
    }
    String.

}
return asd;
}
String reverse(String s){
    String s1="";
    for(int i=s.length()-1;i<=0;i--){
        s1=s1+s.charAt(i);
    }
    return s1;
}
     */

}
