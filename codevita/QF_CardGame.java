package codevita;

import java.util.*;

public class QF_CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> map = new HashMap<>();
        int I = sc.nextInt();
        int P = sc.nextInt();
        for (int i = 1; i <= I; i++) {
            String item = sc.next();
            Set<String> props = new TreeSet<>();
            for (int j = 1; j <= P; j++) {
                String prop = sc.next();
                props.add(prop);
            }
            map.put(item, props);
        }

        int cards = sc.nextInt();
        for (int i = 1; i <= cards; i++) {
            int item1_status = 0;
            int item2_status = 0;

            String item1 = sc.next();
            Set<String> item1_props = new TreeSet<>();
            for (int j = 1; j <= P; j++) {
                String prop = sc.next();
                item1_props.add(prop);
            }
            item1_status = search(map, item1, item1_props);

            String item2 = sc.next();
            Set<String> item2_props = new TreeSet<>();
            for (int j = 1; j <= P; j++) {
                String prop = sc.next();
                item2_props.add(prop);
            }

            item2_status = search(map, item2, item2_props);

            if (item1_status == 0 && item2_status == 0) {
                f(map, item1, item1_props, item2, item2_props);
            }

        }
    }

    private static void f(Map<String, Set<String>> map, String item1, Set<String> item1_props, String item2, Set<String> item2_props) {
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (key != item1 && key != item2 && !value.equals(item1_props) && !value.equals(item2_props)) {
                System.out.print(key + " ");
                for (String v : value) System.out.print(v + " ");
                System.out.println();
            }
        }
    }

    private static int search(Map<String, Set<String>> map, String item, Set<String> itemProps) {
        if (map.containsKey(item)) {
            if (map.get(item).equals(itemProps)) {

                System.out.print(item + " ");
                for (String val : map.get(item)) System.out.print(val + " ");
                System.out.println();
                return 1;
            } else return 0;
        }
        return 0;
    }
}
