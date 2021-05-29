/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.*;

/**
 *
 * @author rupam
 */
public class ASoberWalk {

    public static void main(String args[]) {
        int x = 0;
        int y = 0;
        int distance = 0;
        char direction = 'R';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of iterations-");
        int T = sc.nextInt();

        while (T-- != 0) {
            distance += 10;
            if (direction == 'R') {
                x += distance;
                direction = 'U';

            } else if (direction == 'U') {
                y += distance;
                direction = 'L';

            } else if (direction == 'L') {
                x -= distance;
                direction = 'D';

            } else if (direction == 'D') {
                y -= distance;
                direction = 'R';

            }
        }

        System.out.println("x = " + x + ", y = " + y);
    }
}
