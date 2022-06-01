interface Stream {
    void f(int x);
}

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 3};
        Array array = new Array(arr);

        class StreamImpl implements Stream {
            @Override
            public void f(int x) {
                System.out.println(x);
            }
        }

        array.forEach(new Stream() {
            @Override
            public void f(int x) {
                System.out.println(x);
            }
        });

    }


}

class Array {
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    void forEach(Stream s) {
        for (int x : arr) {
            s.f(x);
        }
    }
}