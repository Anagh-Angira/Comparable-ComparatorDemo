import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnComparableAndComparator {
    public static void main(String[] args) {

        Animal a1 = new Animal(4, "Buzo", 29);
        Animal a2 = new Animal(5, "Bunty", 40);
        Animal a3 = new Animal(6, "Nitun", 50);
        Animal a4 = new Animal(2, "Buxx", 90);

        List<Animal> dog = new ArrayList<>();
        dog.add(a1);
        dog.add(a2);
        dog.add(a3);
        dog.add(a4);

        System.out.println(dog);

        Collections.sort(dog);
        System.out.println(dog);

    }

}
