package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Test 1"));
        list.add(new Person(2, "Rupam 2"));
        list.add(new Person(3, "Test 3"));
        list.add(new Person(4, "Test 4"));

        Stream<Person> filteredList = list.stream().filter(p -> p.name.contains("Test"));

    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
