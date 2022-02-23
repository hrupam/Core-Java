package tcsCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueDigits {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String str = "";
        for (int x : unique(a, b))
            str += x + " ";

        System.out.println(str.trim());

    }

    private static List<Integer> unique(int a, int b) {
        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (!set.contains(c)) {
                    list.add(c);
                    set.add(c);
                } else {
                    list.remove((Object) c);
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        for (char c : list)
            res.add(Integer.parseInt("" + c));

        return res;
    }
}
