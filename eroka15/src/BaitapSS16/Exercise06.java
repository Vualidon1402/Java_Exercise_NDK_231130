package BaitapSS16;

import java.util.Arrays;

public class Exercise06 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }
    }
}
