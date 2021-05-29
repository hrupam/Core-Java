package techgig;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
 */
import java.util.*;

public class VirusOutbreak {

    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        String V = sc.next();
        int t = sc.nextInt();
        for (int iter = 1; iter <= t; iter++) {
            // int i=0; int j=0;
            String B = sc.next();
            int count = 0;
            String Vtemp = V;
            outer:
            for (int i = 0; i < B.length(); i++) {
                inner:
                for (int j = 0; j < Vtemp.length(); j++) {
                    if (B.charAt(i) == Vtemp.charAt(j)) {
                        count++;
//                        System.out.println(B.charAt(i)+" MATCH");
                        Vtemp = Vtemp.substring(j + 1);
                        break inner;
                    }
                }
            }
//            System.out.println(count);
            if (count == B.length()) {
                System.out.println("POSITIVE");
            } else {
                System.out.println("NEGATIVE");
            }
        }

    }
}
