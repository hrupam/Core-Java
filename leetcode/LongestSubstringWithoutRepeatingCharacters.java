package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("zzabcgoodghjkoo"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0;
        int r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            if (map.containsKey(s.charAt(r)))
                l = Math.max(map.get(s.charAt(r)) + 1, l);

            maxLen = Math.max(r - l + 1, maxLen);
            map.put(s.charAt(r), r);
            r++;
        }
        return maxLen;
    }

}
