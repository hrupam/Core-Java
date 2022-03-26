package techgig;

import java.util.Scanner;

public class WorldArmyvsAliens {
    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        String hh = sc.next();
        String mm = sc.next();

        int h = removeInitialZeros(hh);
        int m = removeInitialZeros(mm);

        hh = sc.next();
        mm = sc.next();
        int addH = removeInitialZeros(hh);
        int addM = removeInitialZeros(mm);

        //resultant minute - min
        int min = m + addM;
        int extraHr = 0;
        if (min >= 60) {
            extraHr = min / 60;
            min = min % 60;
        }

        //resultant hour - hour
        int hour = h + addH + extraHr;
        if (hour > 23) hour = hour % 24;

        String hourInString = hour < 10 ? "0" + hour : "" + hour;
        String minInString = min < 10 ? "0" + min : "" + min;

        System.out.print(hourInString + " " + minInString);


    }

    private static int removeInitialZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }
        if (i == s.length()) return 0;
        return Integer.parseInt(s.substring(i));
    }

}
