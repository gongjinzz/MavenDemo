package xyz.nonono.abc.demo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int i=binarySearch(array,2);
        System.out.println(i);
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] > key) {
                right = mid - 1;
            }

            if (array[mid] < key) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
