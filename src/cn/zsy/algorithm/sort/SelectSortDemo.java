package cn.zsy.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSortDemo {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("选择排序前: " + Arrays.toString(arr));
        selectSort2(arr);
        System.out.println("选择排序后: " + Arrays.toString(arr));
    }


    // 选择排序
    private static void selectSort2(int[] arr) {
        //遍历所有元素
        for (int y = 0; y < arr.length - 1; y++) {
            //后 l-y 个元素 最小者置于第一位
            for (int x = y + 1; x < arr.length; x++) {
                if (arr[y] > arr[x]) {
                    int temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;
                }
            }
            System.out.println("   <" + (arr.length-(y + 1)) + " 次>排序 " + Arrays.toString(arr));
        }

    }


    // 选择排序的推导过程
    private static void selectSort(int[] arr) {

        // 全五个元素,最小者置前
        int index = 0;
        for (int x = index + 1; x < arr.length; x++) {
            if (arr[index] > arr[x]) {
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
            }
        }

        // 后四个元素,最小者置前
        index = 1;
        for (int x = index + 1; x < arr.length; x++) {
            if (arr[index] > arr[x]) {
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
            }
        }

        // 后三个元素,最小者置前
        index = 2;
        for (int x = index + 1; x < arr.length; x++) {
            if (arr[index] > arr[x]) {
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
            }
        }

        // 后两个元素,最小者置前
        index = 3;
        for (int x = index + 1; x < arr.length; x++) {
            if (arr[index] > arr[x]) {
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
            }
        }


    }
}
