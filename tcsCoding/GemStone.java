package tcsCoding;

import java.util.LinkedList;
import java.util.List;

enum Gem {
    RUBY,
    GARNET,
    TOPAZ,
}

public class GemStone {
    public static void main(String[] args) {
        int R = 2;
        int G = 1;
        int T = 1;
        List<String> combinations = new LinkedList<>();
        System.out.println(solve(R, G, T, null, combinations, ""));
        System.out.println(combinations);
    }

    private static int solve(int R, int G, int T, Gem lastGem, List<String> combinations, String gems) {
        if (R == 0 && G == 0 && T == 0) {
            combinations.add(gems);
            return 1;
        }


        int a = 0;
        if (R != 0 && lastGem != Gem.RUBY)
            a = solve(R - 1, G, T, Gem.RUBY, combinations, gems + "R");

        int b = 0;
        if (G != 0 && lastGem != Gem.GARNET)
            b = solve(R, G - 1, T, Gem.GARNET, combinations, gems + "G");

        int c = 0;
        if (T != 0 && lastGem != Gem.TOPAZ)
            c = solve(R, G, T - 1, Gem.TOPAZ, combinations, gems + "T");

        return a + b + c;
    }
}
