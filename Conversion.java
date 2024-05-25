public class Conversion {

    static void decToBin(int n) {
        String bin = "";
        while (n != 0) {
            int res = n % 2;
            bin = res + bin;
            n = n / 2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        decToBin(29);
    }
}
