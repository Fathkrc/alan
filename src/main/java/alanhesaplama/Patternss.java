package alanhesaplama;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Patternss {
    public static void main(String[] args) {
        String s="foo(bar)baz";
        Pattern pattern= Pattern.compile("\\([a-z]*?\\)");
        Matcher matcher=pattern.matcher(s);
        String str1="";
        System.out.println(matcher.replaceAll(s));
        if(matcher.find()){
            str1=matcher.group(1)+reverse(matcher.group(2))+matcher.group(3);
        }

    //    System.out.println(matcher.group(2));
/*
Pattern pattern=Pattern.compile("(\\w*[(])(\\w*)([)]\\w*)");
  Matcher matcher=pattern.matcher(s);
  String str1="";
  if(matcher.find()){
      str1=matcher.group(1)+reverse(matcher.group(2))+matcher.group(3);
  }
  String str2="";
  for(String w:str1.split("")){
      if(!w.equals("(")&&!w.equals(")")){
          str2=str2.concat(w);
      }
  }
  return str2;

}
 */

    }
    static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);

        return sb.reverse().toString();
    }
}
