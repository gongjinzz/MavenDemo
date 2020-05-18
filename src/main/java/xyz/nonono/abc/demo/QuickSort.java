package xyz.nonono.abc.demo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {


        int[] array = {9, 7, 8, 52, 7, 23};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start > end) {
            return;
        }

        int i = start;
        int j = end;
        int key = array[start];

        while (i < j) {
            while (i < j && array[j] > key) {
                j--;
            }

            while (i < j && array[i] <= key) {
                i++;
            }

            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        int p = array[start];
        array[start] = array[i];
        array[i] = p;

        quickSort(array, start, i - 1);
        quickSort(array, i + 1, end);
    }
}
