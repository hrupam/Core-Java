package tcsCoding;

import java.util.ArrayList;
import java.util.List;

public class StringComplete {

    public static void main(String[] args) {
        String s = "butl";
        String target = "beautiful";
        System.out.println(canComplete(s, target));
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

    private static boolean isSorted(List<Integer> list) {
        for (int i = 0; i + 1 < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) return false;
        }
        return true;
    }
}
