package tcsCoding;

public class MaxInterviews {
    public static void main(String[] args) {
        int[] start = {2, 4, 1, 6, 9, 6};
        int[] end = {3, 5, 7, 8, 10, 10};

        System.out.println(f(start, end));
    }

    private static int f(int[] start, int[] end) {

        int ctr = 0;
        int i = 0;
        int j = 1;
        while (j < start.length) {
            if (end[i] <= start[j]) {
                ctr++;
                i = j;
            }
            j++;
        }
        return ctr + 1;
    }
}
