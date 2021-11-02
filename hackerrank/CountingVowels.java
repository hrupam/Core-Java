package hackerrank;

public class CountingVowels {
    public static int words_game(String word) {
        word = word.toLowerCase();
        int ctr = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                ctr++;

        }
        if ((ctr & 1) == 0)
            return 2;
        return 1;
    }

    public static void main(String[] args) {
        String s = "Electrofusion includes codethesis";
        String[] words = s.split(" ");
        int result = 0;
        for (String word : words)
            result += words_game(word);
        
        System.out.println(result);
    }
}
