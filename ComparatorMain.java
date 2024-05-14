import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "manish", "kota"));
        list.add(new Student(102, "rohan", "mumbai"));
        list.add(new Student(109, "mohit", "ranchi"));
        list.add(new Student(104, "ram", "delhi"));
        list.add(new Student(105, "keshav", "indore"));

        System.out.println(list);
        Collections.sort(list, new SortByRollno());
        System.out.println(list);
        Collections.sort(list, new SortByName());
        System.out.println(list);
    }
}