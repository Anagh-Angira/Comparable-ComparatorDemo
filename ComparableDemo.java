import java.util.Arrays;

class Pair implements Comparable<Pair> {
    String x;
    int y;

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair that) {
        if (this.x.compareTo(that.x) != 0) {
            return this.x.compareTo(that.x);
        } else {
            return this.y = that.y;
        }
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        int n = 4;
        Pair arr[] = new Pair[n];
        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);

        Arrays.sort(arr);
        print(arr);

    }

    public static void print(Pair[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
