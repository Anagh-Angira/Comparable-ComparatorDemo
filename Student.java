import java.util.Comparator;

public class Student {

    int rollno;
    String name, address;

    @Override
    public String toString() {
        return this.rollno + " " + this.name + " "
                + this.address;
    }

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

}

class SortByRollno implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }

}

class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

}
