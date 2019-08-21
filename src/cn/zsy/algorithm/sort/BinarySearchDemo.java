package cn.zsy.algorithm.sort;

/**
 * 二分查找算法
 */
public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88};
        int index = binarySearch2(arr, 44);
        System.out.println(index);
    }

    /**
     * 二分查找
     */
    private static int binarySearch2(int[] arr, int value) {
        int minIndex = 0;                             //最小索引
        int maxIndex = arr.length - 1;                //最大索引
        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) >>> 1;//无符号右移运算符,取中间值
            if (arr[midIndex] == value) {
                return midIndex;                       //等于值,直接返回
            } else if (arr[midIndex] > value) {
                maxIndex = midIndex - 1;               //中间值大于预设值,在前一半查询
            } else if (arr[midIndex] < value) {
                minIndex = midIndex + 1;               //中间值小于预设值,在后一半查询
            }
        }
        return -1;
    }

    /**
     * 二分查找
     */
    private static int binarySearch(int[] arr, int value) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex = (minIndex + maxIndex) / 2;
        while (minIndex <= maxIndex) {
            if (arr[midIndex] == value) {
                return midIndex;
            } else if (arr[midIndex] > value) {
                maxIndex = midIndex - 1;
            } else if (arr[midIndex] < value) {
                minIndex = midIndex + 1;
            }
            midIndex = (minIndex + maxIndex) / 2;
        }
        return -1;
    }

}
