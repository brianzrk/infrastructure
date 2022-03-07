package com.origin.infrastructure.algo.array;

/**
 * @author zhangruikai01
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZeros283 {

    // 建立o(n)空间数组
    public static void moveZeroes(int[] nums) {
        int[] nonZeros = new int[nums.length];
        int nonZeroIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeros[nonZeroIdx++] = nums[i];
            }
        }
        for (int i = 0; i < nonZeros.length; i++) {
            nums[i] = nonZeros[i];
        }
        for (int i = nonZeros.length; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // 原地覆盖，然后最后的置为0
    public static void moveZeroes1(int[] nums) {

        int k = 0;  // [0, k)中均为非0元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

    // 原地交换
    public static void moveZeroes2(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, k, i);
                k++;
            }
        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] data = {2, 0, 4, 5, 0, 7, 9, 0, 3, 0};
        moveZeroes(data);

    }
}
