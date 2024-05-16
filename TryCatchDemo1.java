public class TryCatchDemo1 {

    public static void main(String[] args) {

        int a = 34;
        int b = 0;
        // program to print the exception information using printStackTrace() method

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hii");

        // program to print the exception information using toString() method
        System.out.println("-----------------------------------");
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Hello");

        // program to print the exception information using getMessage() method
        System.out.println("-----------------------------------");
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello Hii");

        System.out.println("-----------------------------------");
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Hello Hii");

        System.out.println("-----------------------------------");

        // String str = null;
        // System.out.println(str.length());
        // o/p Exception in thread "main" java.lang.NullPointerException
        // at TryCatchDemo1.main(TryCatchDemo1.java:45)

        
    }

}
