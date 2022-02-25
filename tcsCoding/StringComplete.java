package tcsCoding;

import java.util.ArrayList;
import java.util.List;

public class StringComplete {

    public static void main(String[] args) {
        String s = "bifl";
        String target = "beautiful";
//        System.out.println(canComplete(s, target));
        System.out.println(canComplete2(s, target, 0, ""));
    }

    private static boolean canComplete(String s, String target) {

        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++)
            target = target.replaceFirst("" + str[i], "" + i);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (Character.isDigit(c))
                list.add(Integer.parseInt("" + c));
        }

        if (list.size() == str.length && isSorted(list))
            return true;
        return false;
    }

    private static boolean canComplete2(String s, String target, int i, String str) {
        if (i == target.length()) {
            if (str.equals(s)) return true;
            return false;
        }

        if (canComplete2(s, target, i + 1, str + target.charAt(i))) return true;
        if (canComplete2(s, target, i + 1, str)) return true;

        return false;
    }

    private static boolean isSorted(List<Integer> list) {
        for (int i = 0; i + 1 < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) return false;
        }
        return true;
    }
}
