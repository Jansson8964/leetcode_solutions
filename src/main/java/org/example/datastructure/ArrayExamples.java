package org.example.datastructure;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayExamples {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 4};
//        System.out.println(randomAccess(nums));

    }

    private static int randomAccess(int[] nums) {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, nums.length);
        int RandomNum = nums[randomIndex];
        return RandomNum;

    }
    // insert
    void insert(int[] nums, int num, int index) {
        for (int i = nums.length - 1; i > index; i--) {
            // 向后移动
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
    }
    // remove
    void remove(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            // 向前移动
            nums[i] = nums[i + 1];

        }
    }

}
