package leetcode;

import java.util.*;

/* ALTERNATE */
class MyComparator<T extends Comparable<T>> implements Comparator<List<T>> {
    @Override
    public int compare(List<T> a, List<T> b) {
        return a.size() - b.size();
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));

    }

    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0)
                return false;
        }
        return true;

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean visited[] = new boolean[strs.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                String a = strs[i];
                List<String> pairs = new ArrayList<>();
                for (int j = i + 1; j < strs.length; j++) {
                    if (!visited[j]) {
                        String b = strs[j];
                        if (isAnagram(a, b)) {
                            pairs.add(b);
                            visited[j] = true;
                        }
                    }
                }
                visited[i] = true;
                pairs.add(a);
                Collections.sort(pairs);
                list.add(pairs);
            }
        }
        Collections.sort(list, (a, b) -> {
            return a.size() - b.size();
        });
        return list;
    }
}
