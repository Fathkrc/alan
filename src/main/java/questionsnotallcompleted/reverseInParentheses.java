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

}
