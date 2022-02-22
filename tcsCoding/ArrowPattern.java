package tcsCoding;

import java.util.ArrayList;
import java.util.List;

public class ArrowPattern {
    public static void main(String[] args) {
        String[] res = printArrowPattern(5);
        for (var x : res) System.out.println(x);
    }

    public static String[] printArrowPattern(int n) {

        // Write your code here
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            for (int j = 1; j <= i; j++)
                s += " ";

            for (int j = 1; j <= i; j++)
                s += "*";

            list.add(s);

        }
        for (int i = n - 1; i >= 1; i--) {
            String s = "";
            for (int j = 1; j <= i; j++)
                s += " ";

            for (int j = 1; j <= i; j++)
                s += "*";

            list.add(s);

        }

        return list.toArray(new String[list.size()]);
    }
}
