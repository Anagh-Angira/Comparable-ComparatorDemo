public final class ImmutableClass {
    // Immutable class means once we create the object
    // of the class its value cannot be changed

    // String when we once created the string object we cannot
    // update the value

    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
