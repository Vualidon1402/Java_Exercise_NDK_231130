package BaitapSS16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Integer[] arr = getArr();

        System.out.println("Mảng số nguyên được tạo:");
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần tìm kiếm: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Số nguyên " + target + " được tìm thấy tại vị trí " + index + " trong mảng.");
        } else {
            System.out.println("Số nguyên " + target + " không được tìm thấy trong mảng.");
        }
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
