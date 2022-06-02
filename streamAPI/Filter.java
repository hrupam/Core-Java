package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Filter {
    public static void main(String[] args) {

        //1
        List<Integer> list = new ArrayList<>(List.of(1, 9, 6, 3, 5, 7, 8));
        List<Integer> evenList = list.stream().filter(n -> (n & 1) == 0).collect(Collectors.toList());
        list.stream().filter(n -> (n & 1) == 0).forEach(System.out::println);

        //2
        List<String> names = Arrays.asList("Ram", null, "Shyam", "Rupam", null, "Modu", "Naren", null);
        List<String> filteredNames = names.stream().filter(name -> name != null && name.length() > 3 && name.toLowerCase().contains("m")).toList();
        System.out.println(filteredNames);

        //3
        Person p1 = new Person("Rupam", 22, Gender.MALE);
        Person p2 = new Person("Narendra", 35, Gender.OTHERS);
        Person p3 = new Person("Narayani", 18, Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1, p2, p3);
        List<String> adultMalePersonNames = personList.stream().filter(p -> p.age > 18 && p.gender == Gender.MALE).map(p -> p.name).collect(Collectors.toList());
        System.out.println(adultMalePersonNames);

    }
}

