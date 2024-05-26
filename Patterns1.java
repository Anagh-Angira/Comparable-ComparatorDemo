public class Patterns1 {
    static void pattern1(int n) {

        // For Loop for line Printing
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern2(int n) {

        for (int i = 4; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n) {

        // For Print the Line
        for (int i = 1; i <= n; i++) {

            // For space
            for (int j = n - 1; j >= i; j--) {

                System.out.print(" ");

            }

            // For Pattern Printing

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void reverseLeft(int n) {
        // for loop printing the line

        for (int i = 1; i <= n; i++) {

            // for loop for spaces

            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }

            // for loop for stars
            for (int k = n; k >= i; k--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPyramid(int n) {

        // for loop for lines
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = n; j >= i; j--) {

                System.out.print(" ");
            }

            // patternsPrint

            for (int k = 1; k <= i; k++) {

                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // pattern1(5);
        // pattern2(4);
        // rightTriangle(4);
        // reverseLeft(4);
        printPyramid(4);

    }

}
