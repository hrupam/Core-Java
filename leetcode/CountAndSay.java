package leetcode;

public class CountAndSay {
    public static void main(String[] args) {
        String res = new CountAndSay().countAndSay(5);
        System.out.println(res);
    }

    public String countAndSay(int n) {
        if (n == 1) return "1";

        String s = countAndSay(n - 1);
        int i = 0;
        int j = 0;
        String res = "";
        int ctr = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                ctr++;
                j++;
            } else {
                res = (res + ctr) + s.charAt(i);
                i = j;
                ctr = 0;
            }
        }
        res = (res + ctr) + s.charAt(i);
        return res;


    }
}
