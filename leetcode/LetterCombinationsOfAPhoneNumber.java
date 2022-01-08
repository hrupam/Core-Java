package leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        String digits = "2356";
        System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations(digits));
    }

    private static List<String> merge(List<String> a, List<String> b) {
        List<String> result = new ArrayList<>();
        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }
        return result;
    }

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "a,b,c");
        map.put(3, "d,e,f");
        map.put(4, "g,h,i");
        map.put(5, "j,k,l");
        map.put(6, "m,n,o");
        map.put(7, "p,q,r,s");
        map.put(8, "t,u,v");
        map.put(9, "w,x,y,z");


        int firstDigit = Integer.parseInt(digits.charAt(0) + "");
        List<String> letters = Arrays.asList(map.get(firstDigit).split(","));
        for (int i = 1; i < digits.length(); i++) {
            int digit = Integer.parseInt("" + digits.charAt(i));
            List<String> temp = Arrays.asList(map.get(digit).split(","));
            letters = merge(letters, temp);

        }

        return letters;
    }
}
