package com.location.java.algorithm;


public class TestMain {
    public void test() {
        int[] array = {12, 5, 3, 8, 1, 1};
//        quick(array,0,array.length - 1);
        test3(array);
        for (int i : array) {
            System.out.println("array=" + i);
        }
    }

    /**
     * 冒泡排序
     */
    public void bubbling(int[] array) {
        if (array == null) {
            return;
        }
        final int length = array.length;
        int tempValue = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int second = 0; second < length - 1 - i; second++) {
                if (array[second] < array[second + 1]) {
                    tempValue = array[second];
                    array[second] = array[second + 1];
                    array[second + 1] = tempValue;
                }
            }
            System.out.println("index=" + i);
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for (int v : array) {
                builder.append(v).append(", ");

            }
            builder.append("]");
            System.out.println(builder);
        }
    }

    /**
     * 快速排序
     */
    public void quick(int[] array, int start, int end) {
        if (start >= end || start < 0 || end >= array.length)
            return;
        //设置基准数 后面的数和基准数比较 小的放左边 大的放右边
        int stand = array[start];
        int low = start;
        int high = end;
        while (low < high) {
            //如果高位比基准数大 高位向前移动一位
            while (low < high && array[high] >= stand) {
                high--;
            }
            //如果比基准数小 则覆盖低位的数字
            array[low] = array[high];

            //如果低位比标准数小 则低位向后移动一位
            while (low < high && array[low] <= stand) {
                low++;
            }
            //如果低位比基准数大 则替换高位的数据
            array[high] = array[low];
        }
        //退出循环外高位和低位数据相同 此时用基准数替换
        array[low] = stand;
        quick(array, start, low - 1);
        quick(array, low + 1, end);
    }

    /**
     * 选择排序
     */
    public void test3(int[] array) {
        if (array == null)
            return;
        int length = array.length;
        int tempValue;
        for (int i = 0; i < length - 1; i++) {
            //假设最小值的下标
            int minIndex = i;
            //从i+1开始遍历
            for (int second = i + 1; second < length; second++) {
                if (array[second] < array[minIndex]) {
                    minIndex = second;
                }
            }
            //如果最小值的下标不是i 则交换
            tempValue = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tempValue;
        }
    }


    //二分查找
    public int binarySearch(int[] array, int value) {
        if (array == null)
            return -1;
        int length = array.length;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
