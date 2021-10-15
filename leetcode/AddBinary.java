package leetcode;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int num = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(num);
    }

    public static String addBinary2(String b1, String b2) {
        int len1 = b1.length();
        int len2 = b2.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {
            int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }


    public static void main(String[] args) {
        System.out.println(addBinary2("11", "1"));
    }
}
