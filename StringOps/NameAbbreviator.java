package StringOps;

import java.util.Scanner;

public class NameAbbreviator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        String result = "";
        result += strs[0] + " ";
        for (int i = 1; i < strs.length - 1; i++)
            result += strs[i].charAt(0) + ". ";
        if (strs.length != 1)
            result += strs[strs.length - 1];

        System.out.println(result);


    }
}
