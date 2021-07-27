package ArrayOps;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KthHighest {
    static int[] removeDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int x : a)
            set.add(x);
        int temp[] = new int[set.size()];
        int k = 0;
        for (int x : set)
            temp[k++] = x;
        return temp;

    }

    static int findKHighest(int[] a, int k) {
        k -= 1;
        int[] a1 = removeDuplicates(a);
        int[] a2 = a1.clone();
        for (int element1 : a1) {
            int ctr = 0;
            for (int element2 : a2) {
                if (element2 > element1)
                    ctr++;
            }
            if (ctr == k)
                return element1;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # elements in array: ");
        int a[] = new int[sc.nextInt()];
        System.out.println("Enter elements-");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter Kth Highest: ");
        int k = sc.nextInt();

        int highest = findKHighest(a, k);
        if (highest == Integer.MIN_VALUE)
            System.out.println(k + "th highest does not exist");
        else
            System.out.println(k + "th highest = " + highest);
    }
}
