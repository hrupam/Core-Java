package hackerrank;

public class Calculator {

    public static boolean isArmstrong(String str) {
        int count = str.length();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            res += (int) Math.pow(n, count);
        }
        if (res == Integer.parseInt(str))
            return true;
        return false;

    }

    public static void main(String[] args) {
//        String s = "2 + 5 =";
//        String[] arr = s.split(" ");
//        System.out.println(Arrays.toString(arr));

        int sqrt = (int) Math.sqrt(100);
        for (int i = 1; i < sqrt; i++) {

        }


    }
}
