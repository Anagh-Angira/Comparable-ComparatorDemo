import java.util.Arrays;

class Pair implements Comparable<Pair> {
    String fname, lname;

    public Pair(String x, String y) {
        this.fname = x;
        this.lname = y;
    }

    public String toString() {
        return "( " + fname + " , " + lname + " )";
    }

    @Override
    public int compareTo(Pair that) {
        if (this.fname.compareTo(that.fname) != 0) {
            return this.fname.compareTo(this.fname);
        } else {
            return this.lname.compareTo(that.lname);
        }
    }
}

public class PairComparable {
    public static void main(String[] args) {

        int n = 4;
        Pair[] arr = new Pair[n];

        arr[0] = new Pair("raj", "kumar");
        arr[1] = new Pair("rohit", "sharma");
        arr[2] = new Pair("amit", "gupta");
        arr[3] = new Pair("suraj", "singh");
        // arr[4] = new Pair("arun", "jetli");

        Arrays.sort(arr);
        print(arr);

    }

    public static void print(Pair[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}