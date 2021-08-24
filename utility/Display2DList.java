package utility;

import java.util.List;

public class Display2DList {
    public static <T> void display(List<List<T>> list) {
        for (var i : list) {
            for (var x : i)
                System.out.print(x + " ");
        }
    }
}
