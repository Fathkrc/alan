package questionsnotallcompleted;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        System.out.println(solution(arr));

    }//while true ile çözcem


   static boolean solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (Integer w : arr) {
            list.add(w);
        }
        boolean b = false;
        if (isWorkingL(list)) {
            return true;
        } else {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1) < list.get(i)) {
                    continue;
                } else {
                    if (list.get(i - 1) > list.get(i) ||
                            list.get(i - 1) == list.get(i)) {
                        list.remove(list.get(i - 1));
                        count++;
                        i--;
                    } else if(list.get(i - 1) > list.get(i)){

                    }else{
                        list.remove(list.get(i));
                        count++;
                        i--;
                        b = false;
                    }
                    if (isWorkingL(list) || list.size() == 1) {
                        b = true;
                    }
                }
            }
        }
        if (count > 1||list.size()<2) {
            return false;
        } else {
            return b;
        }

    }

   static boolean isWorkingL(List<Integer> list) {
        boolean b = false;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) <
                    list.get(i)) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }
}