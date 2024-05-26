public class Patterns2 {
    static void printPyramidReverse(int n) {

        // Printing the Lines
        for (int i = 1; i <= n; i++) {

            // printing the spaces

            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }

            // printing the stars

            for (int k = n; k >= i; k--) {

                System.out.print("*");

            }
            for (int l = n - 1; l >= i; l--) {

                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramidReverse(4);

    }

}
