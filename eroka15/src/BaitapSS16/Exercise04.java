package BaitapSS16;

import java.util.Scanner;

import java.util.Arrays;

public class Exercise04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        int index = Arrays.binarySearch(arr, target);

        if (index >= 0) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }

        int max = arr[arr.length - 1];
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
