package techgig;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StopTheShame {
    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<Integer> list = new LinkedList<>();
        List<Integer> ranks = new LinkedList<>();


        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        ranks.add(1);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) ranks.add(ranks.get(i - 1) + 1);
            else ranks.add(ranks.get(i - 1));
        }

        for (int k = 0; k < p; k++) {
            int el = sc.nextInt();

            int id = getIndex(list, el);
            if (id == list.size()) {
                list.add(el);
                if (list.get(id - 1) == el) {
                    int rank = ranks.get(id - 1);
                    ranks.add(rank);
                    System.out.println(rank);

                } else {
                    int rank = ranks.get(id - 1) + 1;
                    ranks.add(rank);
                    System.out.println(rank);
                }
            } else if (id == 0) {
                list.add(id, el);
                ranks.add(null);
                for (int i = id + 1; i < list.size(); i++) {
                    ranks.set(i, ranks.get(i - 1) + 1);
                }
                int rank = 1;
                System.out.println(rank);


            } else {
                list.add(id, el);
                ranks.add(null);
                if (list.get(id - 1) == el) {
                    for (int i = id + 1; i < list.size(); i++) {
                        ranks.set(i, ranks.get(i - 1));
                    }
                    int rank = ranks.get(id - 1);
                    ranks.set(id, rank);
                    System.out.println(rank);
                } else {
                    for (int i = id + 1; i < list.size(); i++) {
//                        if (i < ranks.size())
                        ranks.set(i, ranks.get(i - 1) + 1);
//                        else ranks.add(ranks.get(i - 1) + 1);
                    }
                    int rank = ranks.get(id);
                    System.out.println(rank);

                }

            }

        }

//        System.out.print(ranks);


    }

    private static int getIndex(List<Integer> arr, int element) {
        int n = arr.size();
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr.get(m) == element)
                return m + 1;

            else if (arr.get(m) > element) l = m + 1;
            else h = m - 1;
        }
        return l;
    }
}
