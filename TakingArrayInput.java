import java.util.Scanner;

public class TakingArrayInput {
    static void reverse(int m, int n) {

        n = m + n - (m = n);
        System.out.println(m + " " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Number to Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Java Ternary Operator in
        int a = 23;
        int b = 58;
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        max = (a > b) ? a : b; // Ternary Operator
        System.out.println(max);

        reverse(12, 13);

        sc.close();
    }

}
