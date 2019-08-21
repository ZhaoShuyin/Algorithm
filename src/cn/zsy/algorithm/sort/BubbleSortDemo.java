package cn.zsy.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序算法
 */
public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前: " + Arrays.toString(arr));
        bubbleSort2(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     */
    private static void bubbleSort2(int[] arr) {
        //首先遍历所有数据
        for (int y = 0; y < arr.length - 1; y++) {
            //每个元素与之后元素对比,最小者置前
            for (int x = 0; x < arr.length - 1 - y; x++) {
                if (arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }

    }

    // 冒泡排序
    private static void bubbleSort(int[] arr) {

        // 第一次排序
        for (int x = 0; x < arr.length - 1 - 0; x++) {
            if (arr[x] > arr[x + 1]) {
                int temp = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = temp;
            }
        }

        // 第二次排序
        for (int x = 0; x < arr.length - 1 - 1; x++) {
            if (arr[x] > arr[x + 1]) {
                int temp = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = temp;
            }
        }

        // 第三次排序
        for (int x = 0; x < arr.length - 1 - 2; x++) {
            if (arr[x] > arr[x + 1]) {
                int temp = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = temp;
            }
        }

        // 第四次排序
        for (int x = 0; x < arr.length - 1 - 3; x++) {
            if (arr[x] > arr[x + 1]) {
                int temp = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = temp;
            }
        }

    }

    // 数组遍历的方法
    public static void print(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
    }

}
