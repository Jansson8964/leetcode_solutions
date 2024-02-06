package org.example.datastructure;

import java.util.Stack;

public class loopExamples {
//    int whileLoop(int n) {
//        int res = 0;
//        int i = 1;
//        while (i <= n) {
//            res += i;
//            i++;
//        }
//        return res;
//
//    }


    public static void main(String[] args) {
        loopExamples le = new loopExamples();
//        System.out.println(le.whileLoop(10));
//        System.out.println(le.whileLoop2(10));
//        System.out.println(le.nestedForLoop(10));
//        System.out.println(le.factorialFunction(10));
        //System.out.println(le.Fibonacci(50));
        // System.out.println(le.forLoop(10));
//        System.out.println(le.bubbleSort(new int[]{2,6,8,2,546,14,9,1,14,6}));
        System.out.println(le.logarithmic(100));

    }

    private int whileLoop2(int n) {
        int result = 0;
        int i2 = 1;
        while (i2 <= n) {
            result += i2;
            i2++;
            i2 *= 2;
        }
        return result;
    }

    String nestedForLoop(int n) {
        StringBuilder res = new StringBuilder();
        // 循环 i = 1, 2, ..., n-1, n
        for (int i = 1; i <= n; i++) {
            // 循环 j = 1, 2, ..., n-1, n
            for (int j = 1; j <= n; j++) {
                res.append("(" + i + ", " + j + "), ");
            }
        }
        return res.toString();
    }

    int factorialFunction(int n) {
        if (n == 1) return 1;
        return n * factorialFunction(n - 1);
    }

    int Fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    int forLoop(int n) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    /* 平方阶（冒泡排序） */
    int bubbleSort(int[] nums) {
        int count = 0; // 计数器
        // 外循环：未排序区间为 [0, i]
        for (int i = nums.length - 1; i > 0; i--) {
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // 交换 nums[j] 与 nums[j + 1]
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    count += 3; // 元素交换包含 3 个单元操作
                }
            }
        }
        return count;
    }

    /* 对数阶（循环实现） */
    int logarithmic(float n) {
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;

            // System.out.println("25除以2"+25/2);


        }
    //    System.out.println("25除以2"+25/2);
        return count;
    }

    /* 在数组的索引 index 处插入元素 num */
    void insert(int[] nums, int num, int index) {
        // 把索引 index 以及之后的所有元素向后移动一位
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        // 将 num 赋给 index 处元素
        nums[index] = num;
    }
}
