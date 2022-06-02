package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> names = List.of("Rupam", "Ram", "Modi");
        List<Person> personList = names.stream().map(name -> new Person(name.toUpperCase(), 18, Gender.MALE)).toList();
        System.out.println(personList);

        List<Integer> nums = Arrays.asList(5, 9, 6, 8, 102);
        List<Integer> squaredList = nums.stream().map(n -> (int) Math.pow(n, 2)).collect(Collectors.toList());
        System.out.println(squaredList);


    }
}
