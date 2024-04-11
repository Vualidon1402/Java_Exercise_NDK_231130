package BaitapSS16;

import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        int[] arr = getArr();

        int[] selectionSortedArray = selectionSort(arr.clone());
        System.out.println("Mảng sau khi sắp xếp bằng thuật toán sắp xếp chọn:");
        printArray(selectionSortedArray);

        int[] insertionSortedArray = insertionSort(arr.clone());
        System.out.println("Mảng sau khi sắp xếp bằng thuật toán sắp xếp chèn:");
        printArray(insertionSortedArray);

        int[] bubbleSortedArray = bubbleSort(arr.clone());
        System.out.println("Mảng sau khi sắp xếp bằng thuật toán sắp xếp nổi bọt:");
        printArray(bubbleSortedArray);
    }

    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
