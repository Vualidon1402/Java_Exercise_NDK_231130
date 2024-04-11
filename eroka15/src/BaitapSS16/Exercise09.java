package BaitapSS16;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Nhập số cần tìm: ");
        int value = scanner.nextInt();

        int index = binarySearch(array, 0, n - 1, value);
        if (index != -1) {
            System.out.println("Số " + value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + value + " trong mảng.");
        }
    }

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }
}
