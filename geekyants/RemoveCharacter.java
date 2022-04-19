package geekyants;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s = "JAVASCRIPT";
        System.out.println(removeChar(s, 'R'));
    }

    private static String removeChar(String s, char x) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == x) str[i] = Character.MIN_VALUE;
        }

        String res = "";
        for (char c : str) if (c != Character.MIN_VALUE) res += c;
        return res;
    }
}
