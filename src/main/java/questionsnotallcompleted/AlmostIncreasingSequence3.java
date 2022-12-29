package questionsnotallcompleted;

import java.util.List;

public class AlmostIncreasingSequence3 { public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2};
    System.out.println(solution(arr));
}//while true ile çözcem


    static boolean solution(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] - arr[i+1] >= 0) {
                   count += 1;
                   if (i - 1 >= 0 && i + 2 <= arr.length - 1
                        && arr[i] - arr[i+2] >= 0
                        && arr[i-1] - arr[i+1] >= 0) {
                       return false;
                }}
        }
        if (count<=1) { return true;
        }else {
            return false;
        }}

    static boolean isWorkingL(List<Integer> list) {
        boolean b = false;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) <
                    list.get(i)) {
                b = true;
            } else {
                b = false;
                return b;
            }
        }
        return b;
    }
}
