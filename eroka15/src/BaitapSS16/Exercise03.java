package BaitapSS16;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        int[] arr = {12, 56, 99, 76, 54, 78, 43, 34, 68, 79};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
