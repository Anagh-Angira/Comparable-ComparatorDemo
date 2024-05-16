public class ChainedException {
    public static void main(String[] args) {

        try {
            NumberFormatException ex = new NumberFormatException();
            ex.initCause(new NullPointerException(
                    "This is actual cause of the exception I am Anagh"));

            throw ex;
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
        System.out.println("Hello");
    }
}
