package org.example.myleetcodes.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] test = {2, 1, 5, 3};
        System.out.println(Arrays.toString(twoSum(test, 4)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }

            prevMap.put(num, i);
        }

        return new int[]{};
    }

}



