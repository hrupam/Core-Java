package utility;

import java.util.Comparator;
import java.util.List;

public class ListOfTwoIntegerPairComparator implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        if (o1.get(0) < o2.get(0)) return -1;
        else if (o1.get(0) > o2.get(1)) return 1;
        else if (o1.get(0) == o2.get(0)) return o1.get(1) - o2.get(1);
        return 0;
    }
}
