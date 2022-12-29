package questionsnotallcompleted;

public class InterestingPoligon {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
   static int solution(int n) {
        int sum=0;
        if(n==1){
            return 1;
        } else if(n==2){
            return 5;
        }else{
            for(int i=0 ;i<(2*n)-1;i++){
                if(i%2!=0){
                    sum=sum+(i*2);// 1,3,5 2+6+10=18
                }
            }
            return sum+((2*n) -1);
        }

    }
}
