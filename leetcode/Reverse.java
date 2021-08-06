package leetcode;

class Reverse {
    public static void main(String[] args) {
        System.out.println(new Reverse().reverse(1534236469));
    }

    public int reverse(int x) {
        if (x == 0)
            return 0;
        boolean negativeFlag = false;
        if (x < 0)
            negativeFlag = true;

        x = Math.abs(x);
        long rev = 0;
        int result;
        try {
            while (x != 0) {
                int d = x % 10;
                rev = rev * 10 + d;
                x = x / 10;
            }
            if (negativeFlag)
                rev = -rev;

            result = Integer.parseInt(String.valueOf(rev));

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        return result;
    }
}
