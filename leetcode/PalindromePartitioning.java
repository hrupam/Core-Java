package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        partition("aabb");
    }

    private static void func(String s, int index, List<String> subList, List<List<String>> wrappedList) {
        if (index == s.length()) {
            wrappedList.add(new ArrayList<>(subList));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                subList.add(s.substring(index, i + 1));
                func(s, i + 1, subList, wrappedList);
                subList.remove(subList.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if (s == null) return false;
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> wrappedList = new LinkedList<>();
        List<String> subList = new ArrayList<>();
        func(s, 0, subList, wrappedList);
        return wrappedList;
    }
}

