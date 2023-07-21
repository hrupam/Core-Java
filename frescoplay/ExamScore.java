package frescoplay;

import java.util.Arrays;

public class ExamScore {
    public static void main(String[] args) {
        int answered_count = 3;
        int[] answered = {24, 27, 0};
        int needed_count = 3;
        int[] needed = {51, 52, 100};
        int q = 200;
        int res = maxSubjectsNumber(answered_count, answered, needed_count, needed, q);
        System.out.println(res);
    }

    static int maxSubjectsNumber(int answered_count, int[] answered, int needed_count, int[] needed, int q) {
        int[] required = new int[answered_count];
        for (int i = 0; i < answered_count; i++)
            required[i] = Math.max(0, needed[i] - answered[i]);

        Arrays.sort(required);

        int ctr = 0;
        for (int i = 0; i < answered_count; i++) {
            if (required[i] <= q) {
                q -= required[i];
                ctr++;
            } else break;
        }
        return ctr;

    }
}
