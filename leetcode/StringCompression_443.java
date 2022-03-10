package leetcode;

public class StringCompression_443 {

    public int compress(char[] chars) {

        int i = 0;
        int j = 0;
        String res = "";
        int ctr = 0;
        while (j < chars.length) {

            if (chars[i] == chars[j]) {
                ctr++;
                j++;
            } else {
                if (ctr != 1) res = res + chars[i] + ctr;
                else res = res + chars[i];
                ctr = 0;
                i = j;
            }
        }
        if (ctr != 1) res = res + chars[i] + ctr;
        else res = res + chars[i];

        int n = res.length();
        for (i = 0; i < n; i++)
            chars[i] = res.charAt(i);
        return n;
    }
}
