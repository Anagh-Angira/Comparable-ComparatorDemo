class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Animal {age=" + age + ", name=" + name + ", weight=" + weight + "}" + "\n";
    }

    @Override
    public int compareTo(Animal that) {
        if (this.name == that.name) {
            return this.weight - that.weight;
        }

        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        } else {
            return this.age - that.age;
        }
    }
}