package questionsnotallcompleted;

public class isLucky {
    public static void main(String[] args) {

    }
    boolean solution(int n) {
        int dgt=0;
        int x=n;
        while(x!=0){
            x/=10;
            dgt++;
        }
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=dgt/2;i++){
            sum1+=n%10;
            n/=10;
        }
        for(int i=(dgt/2)+1;i<=dgt;i++){
            sum2+=n%10;
            n/=10;
        }
        return sum1==sum2? true : false;
    }

}
