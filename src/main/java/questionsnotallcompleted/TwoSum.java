package questionsnotallcompleted;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum;
        int idx=0;
        for(int i=1;i<nums.length;i++){
           sum=nums[i-1]+nums[i];
           idx=i-1;
            if (sum==target) {
                break;
            }
            }
        int[]arr=new int[2];

        for (int j=0;j<2;j++) {
            arr[j]=idx;
            idx++;

        }
        return arr;
    }
}
