package BaitapSS16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mảng số nguyên:" + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();

        int startIndex = binarySearch(arr, max, false);
        int endIndex = binarySearch(arr, min, true);

        if (startIndex >= 0 && endIndex >= 0) {
            int count = endIndex - startIndex + 1;
            if (count > 0) {
                System.out.println("Số lượng số tìm thấy: " + count);
                System.out.println("Chi tiết số tìm thấy:");
                for (int i = startIndex; i <= endIndex; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                System.out.println("Không có số nào trong khoảng từ " + min + " đến " + max);
            }
        } else {
            System.out.println("Không có số nào trong khoảng từ " + min + " đến " + max);
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

    private static int binarySearch(Integer[] arr, int target, boolean findNext) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (findNext) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
