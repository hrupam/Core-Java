package leetcode;

public class AddBinary {

    public static void main(String[] args) {
        String a = "1000000100101010101001";
        String b = "0100110001010010";
        System.out.println(new AddBinary().addBinary(a, b));
    }

    private static int[] getSumCarry(int a, int b, int c) {
        int num = a + b + c;
        if (num == 0)
            return new int[]{0, 0};
        if (num == 1)
            return new int[]{1, 0};
        if (num == 2)
            return new int[]{0, 1};

        return new int[]{1, 1};
    }


    public String addBinary(String a, String b) {

        if (a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        String result = "";
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int b1 = Integer.parseInt(a.charAt(i) + "");
            int b2 = Integer.parseInt(b.charAt(j) + "");
            int[] sumCarry = getSumCarry(b1, b2, carry);
            int sum = sumCarry[0];
            int nextCarry = sumCarry[1];

            result = sum + result;
            carry = nextCarry;

            i--;

            j--;

        }

        while (i >= 0) {
            int b1 = Integer.parseInt(a.charAt(i) + "");
            int[] sumCarry = getSumCarry(carry, b1, 0);
            int sum = sumCarry[0];
            int nextCarry = sumCarry[1];

            result = sum + result;
            carry = nextCarry;
            i--;
        }
        if (carry == 1)
            result = carry + result;

        return result;
    }
}
