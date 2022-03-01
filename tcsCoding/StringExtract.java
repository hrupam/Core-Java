package tcsCoding;

public class StringExtract {
    public static void main(String[] args) {
        System.out.println(f("name@1234password"));
    }

    private static String f(String s) {
        String alpha = "";
        String special = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c))
                special += c;
            if (Character.isLetter(c))
                alpha += c;
        }

        return alpha + special;
    }
}
