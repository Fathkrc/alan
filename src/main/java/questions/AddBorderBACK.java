package questions;

import java.util.Arrays;

public class AddBorderBACK {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"aaaaa", "sssss"})));
    }
    static String[] solution(String[] picture) {
        String[]arr =new String[picture.length+2];

        String astx="*";
        for(int i=1;i<=arr.length-2;i++){
            arr[i]=""+astx+picture[i-1]+astx;
        }
        arr[0]=astx.repeat(picture[0].length()+2);
        arr[arr.length-1]=astx.repeat(picture[0].length()+2);
        return arr;
    }
}
