package leetcode;

public class Atoi {
    public static String removeZero(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0')
            i++;
        if (i == 0)
            return s;
        return s.substring(i);
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        } else if (s.charAt(0) == '+')
            s = s.substring(1);

        s = removeZero(s);


        int finalNumber = 0;

        try {
            String str = "";
            int i = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
                i++;
            }

            if (str.isEmpty())
                return 0;


            if (isNegative)
                str = "-" + str;


            finalNumber = Integer.parseInt(str);


        } catch (Exception e) {
            if (isNegative)
                finalNumber = Integer.MIN_VALUE;
            else
                finalNumber = Integer.MAX_VALUE;

        }
        return finalNumber;


    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-006325"));
    }
}
