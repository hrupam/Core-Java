package leetcode;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddress {
    public static void main(String[] args) {
        String ip = "101023";
        System.out.println(restoreIpAddresses(ip));

    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> validIps = new LinkedList<>();
        solve(s, "", 0, 0, validIps);
        return validIps;
    }

    private static void solve(String s, String ip, int index, int dots, List<String> validIps) {
        if (dots == 3) {
            String substr = s.substring(index);
            if (isValidIp(substr)) {
                validIps.add(ip + substr);
                return;
            }
        }

        for (int i = 1; i <= 3; i++) {
            int j = index + i - 1;
            if (j < s.length()) {
                String substr = s.substring(index, j + 1);
                if (isValidIp(substr)) {
                    solve(s, ip + substr + ".", j + 1, dots + 1, validIps);
                }
            }
        }
    }

    private static boolean isValidIp(String s) {
        if (s == null || s.isBlank() || s.isEmpty()) return false;

        if (s.length() == 1 && Integer.parseInt(s) == 0) return true;

        if (s.startsWith("0")) return false;

        if (s.length() > 3) return false;

        int n = Integer.parseInt(s);
        if (n >= 0 && n <= 255) return true;

        return false;
    }
}
