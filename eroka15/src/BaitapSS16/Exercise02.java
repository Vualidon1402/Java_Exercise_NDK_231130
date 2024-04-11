package BaitapSS16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int[][] arr = getArr();

        System.out.println("Mảng số nguyên:");
        printArray(arr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();
        boolean found = linearSearch(arr, target);

        if (found) {
            System.out.println("Số " + target + " được tìm thấy trong mảng.");
        } else {
            System.out.println("Số " + target + " không được tìm thấy trong mảng.");
        }
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static boolean linearSearch(int[][] arr, int target) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowList.add(i);
                    colList.add(j);
                    found = true;
                }
            }
        }

        if (found) {
            System.out.print("Vị trí của số " + target + ": ");
            for (int k = 0; k < rowList.size(); k++) {
                System.out.print("(" + rowList.get(k) + ", " + colList.get(k) + ") ");
            }
            System.out.println();
        }

        return found;
    }
}
