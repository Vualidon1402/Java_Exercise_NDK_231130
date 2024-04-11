package BaitapSS16;

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        String longestSortedSubstring = findLongestSortedSubstring(input);

        System.out.println("Chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất: " + longestSortedSubstring);
    }

    private static String findLongestSortedSubstring(String input) {
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++) {
            if (!currentSubstring.isEmpty() && (i == input.length() - 1 || input.charAt(i) < input.charAt(i - 1))) {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "";
            }

            currentSubstring += input.charAt(i);
        }

        return longestSubstring;
    }
}
