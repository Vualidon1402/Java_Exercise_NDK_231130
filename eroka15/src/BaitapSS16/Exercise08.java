package BaitapSS16;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = scanner.nextLine();

        String sortedSubstring = getSortedSubstring(input);
        System.out.println("Chuỗi kí tự con được sắp xếp từ bé đến lớn: " + sortedSubstring);
    }

    private static String getSortedSubstring(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
