package questionsnotallcompleted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {3, 2,4,7,2,3,12};
        System.out.println(Arrays.toString(twoSum(arr, 15)));

    }

    public static int[] twoSum(int[] nums, int target) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i != k && nums[i] + nums[k] == target) {
                    arr.add(i);
                    arr.add(k);
                }
            }
        }
        int[] arr2 = new int[2];
        for (int i = 0; i < 2; i++) {
            arr2[i] = arr.get(i);
        }
        return arr2;
    }


}

