package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        List<List<Character>> wrappedList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            int j = i;
            int increment = (numRows - 2 - (i % (numRows - 1))) * 2 + 1;
            List<Character> list = new ArrayList<>();
            while (j < s.length()) {
                list.add(s.charAt(j));
                j = increment + 1 + j;
            }
            wrappedList.add(list);
        }
        System.out.println(wrappedList);
        return "";
    }

    public static void main(String[] args) {
        convert("PAYPALISHIRING", 4);
//        convert("A", 1);
    }
}
