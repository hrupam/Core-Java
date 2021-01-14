/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

import java.util.*;

/**
 *
 * @author hrupa
 */
class Point implements Comparable<Point> {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Point p) {
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            if (this.y < p.y) {
                return -1;
            } else if (this.y > p.y) {
                return 1;
            } else {
                return 0; //both x and y are same
            }
        }
    }
}

/*################# SUBSTITUTE #################*/
//class PointComparator implements Comparator<Point> {
//
//    @Override
//    public int compare(Point p1, Point p2) {
//        if (p1.x < p2.x) {
//            return -1;
//        } else if (p1.x > p2.x) {
//            return 1;
//        } else {
//            if (p1.y < p2.y) {
//                return -1;
//            } else if (p1.y > p2.y) {
//                return 1;
//            } else {
//                return 0; //both x and y are same
//            }
//        }
//    }
//
//}
public class Treeset {

    public static void main(String args[]) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(5, 5));
        ts.add(new Point(2, 3));
        ts.add(new Point(6, 1));
        ts.add(new Point(1, 4));
        ts.add(new Point(5, 5));
        System.out.print(ts);
    }
}
