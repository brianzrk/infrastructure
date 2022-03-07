package com.origin.infrastructure.algo;

/**
 * @author zhangruikai01
 */
public class BinarySearch {

    public static int binarySearch(int[] data, int value) {

        int l = 0, r = data.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (data[mid] == value) {
                return mid;
            } else if (data[mid] > value) {
                r = mid -1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 8, 10, 45, 67, 89, 90};
        int i = binarySearch(arr, 45);
        System.out.println(i);
    }
}
