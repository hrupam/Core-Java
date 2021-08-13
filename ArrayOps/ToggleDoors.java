package ArrayOps;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleDoors {
    public static boolean[] toggleDoors(int n) {
        boolean[] doors = new boolean[n + 1];
        Arrays.fill(doors, false);
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j = j + i) {
                doors[j] = !doors[j];
            }
        }
        return doors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # doors - ");
        int n = sc.nextInt();
        boolean result[] = toggleDoors(n);
        System.out.println("##### OPENED DOORS #####");
        for (int i = 1; i < result.length; i++) {
            if (result[i])
                System.out.println(i);
        }
    }
}
