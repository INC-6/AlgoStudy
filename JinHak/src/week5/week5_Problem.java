package week5;

import java.util.Arrays;

public class week5_Problem {

    public static void main(String[] args) throws Exception {

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;


        int[] nums2 = {3, 2, 4};
        int target2 = 6;


        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;

    }


}