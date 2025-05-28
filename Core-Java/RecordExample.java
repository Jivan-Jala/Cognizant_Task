// File: RecordExample.java
import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 17),
            new Person("Charlie", 19),
            new Person("David", 16)
        );

        // Print all persons
        System.out.println("All Persons:");
        people.forEach(System.out::println);

        // Filter persons with age >= 18
        System.out.println("\nAdults (18+):");
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());
        adults.forEach(System.out::println);
    }
}
