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

    static void binToDecimal(String str) {

        int pos = 0;
        int dec = 0;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == '1') {
                dec += Math.pow(2, pos);
            }
            pos++;
        }
        System.out.println(dec);

    }

    public static void main(String[] args) {
        // decToBin(29);
        binToDecimal("110010");
    }
}
