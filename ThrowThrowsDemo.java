public class ThrowThrowsDemo {

    static void fun() {
        try {
            throw new NullPointerException("hii");
        } catch (NullPointerException e) {
            System.out.println("caught inside fun() Hii I am Anagh");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("caught in main.");
        }
    }

}
