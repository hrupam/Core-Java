/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class OxygenValue {

    public static int traineeAvg(int[] a) {
        double sum = 0;
        for (int x : a) {
            sum += x;
        }

        int avg = (int) Math.round(sum / a.length);
        return avg;
    }

    public static int max(int a, int b, int c) {
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 : c;
        return max2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int t1oxy[] = new int[3];
        int t2oxy[] = new int[3];
        int t3oxy[] = new int[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Oxygen level of trainee 1");
            t1oxy[i] = sc.nextInt();
            if (t1oxy[i] < 1 || t1oxy[i] > 100) {
                flag = 1;
            }
            System.out.println("Oxygen level of trainee 2");
            t2oxy[i] = sc.nextInt();
            if (t2oxy[i] < 1 || t2oxy[i] > 100) {
                flag = 1;
            }
            System.out.println("Oxygen level of trainee 3");
            t3oxy[i] = sc.nextInt();
            if (t3oxy[i] < 1 || t3oxy[i] > 100) {
                flag = 1;
            }

        }
        if (flag == 1) {
            System.out.println("INVALID INPUT");
            return;
        }

        int t1avg = traineeAvg(t1oxy);
        int t2avg = traineeAvg(t2oxy);
        int t3avg = traineeAvg(t3oxy);

        if (t1avg < 70 && t2avg < 70 && t3avg < 70) {
            System.out.println("All trainees are unfit");
            return;
        }

        int max = max(t1avg, t2avg, t3avg);
        int avgArray[] = {t1avg, t2avg, t3avg};

        for (int i = 0; i < avgArray.length; i++) {
            if (max == avgArray[i]) {
                System.out.println("Trainee number: " + (i + 1));
            }
        }

    }
}
