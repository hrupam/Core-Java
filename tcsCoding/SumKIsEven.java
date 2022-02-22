package tcsCoding;

public class SumKIsEven {

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int k = 2;
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(f(a, b, k, 0, mod));
    }

    private static int f(int a, int b, int k, int sum, int mod) {
        if (k == 0) {
            if ((sum & 1) == 0) return 1;
            return 0;
        }


        int count = 0;
        for (int i = a; i <= b; i++) {
            int c = f(a, b, k - 1, sum + i, mod);
            count = (count + c) % mod;
        }

        return count;
    }
}
