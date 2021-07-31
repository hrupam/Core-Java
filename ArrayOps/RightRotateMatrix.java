package ArrayOps;

import java.util.Scanner;

public class RightRotateMatrix {


    public static int[][] rotateRight(int[][] a, int length) {
        int b[][] = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                b[j][length - 1 - i] = a[i][j];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Scanner sc = new Scanner(System.in);
        System.out.print("# times you want to right rotate: ");
        long n = sc.nextLong();

        n %= 4;
        System.out.println("# Rotation - " + n);

        System.out.println("Original Matrix");
        displayMatrix(a, 3);

        while (n-- != 0)
            a = rotateRight(a, 3);

        System.out.println("Rotated Matrix");
        displayMatrix(a, 3);

    }

    public static void displayMatrix(int[][] a, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
