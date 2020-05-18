package xyz.nonono.abc.demo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 4, 5, 6, 9, 8};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[array.length];

        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[t++] = array[i++];
            } else {
                temp[t++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[t++] = array[i++];
        }

        while (j <= right) {
            temp[t++] = array[j++];
        }

        t = 0;
        while (left <= right) {
            array[left++] = temp[t++];
        }
    }
}
