package CodeStudio;

public class BeautifulString {
    public static void main(String[] args) {
        System.out.println(makeBeautiful("101101011"));
    }

    public static int makeBeautiful(String str) {
        return f(str.toCharArray(), 0, 0);
    }

    //brute force
    private static int f(char[] str, int i, int cost) {
        if (isBeautiful(str)) return cost;
        if (i == str.length) {
            if (isBeautiful(str)) return cost;
            return Integer.MAX_VALUE;
        }

        switchChar(str, i);
        int s = f(str, i + 1, cost + 1);
        switchChar(str, i);
        int ns = f(str, i + 1, cost);

        return Math.min(s, ns);
    }

    private static void switchChar(char[] str, int i) {
        if (str[i] == '0') str[i] = '1';
        else str[i] = '0';
    }

    private static boolean isBeautiful(char[] str) {
        for (int i = 0; i + 1 < str.length; i++) {
            if (str[i] == '0' && str[i + 1] == '0') return false;
            if (str[i] == '1' && str[i + 1] == '1') return false;
        }
        return true;
    }
}
