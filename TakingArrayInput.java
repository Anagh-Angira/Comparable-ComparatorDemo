import java.util.Scanner;

public class TakingArrayInput {
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

        sc.close();
    }

}
