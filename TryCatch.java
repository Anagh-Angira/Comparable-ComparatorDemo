public class TryCatch {

    public static void main(String[] args) {

        int a = 12;
        int b = 0;
        try {
            System.out.println(a / b);

            // String abc = null;
            // System.out.println(abc.length());
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("hi");
            System.out.println("hello");
            System.out.println("byy");
        }

    }

}
