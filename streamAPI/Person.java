package streamAPI;

enum Gender {
    MALE,
    FEMALE,
    OTHERS
}

public class Person {
    private static int idCtr = 0;
    int id;
    String name;
    int age;
    Gender gender;

    public Person(String name, int age, Gender gender) {
        this.id = ++idCtr;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
