// File: EvenNumbersStream.java
import java.util.*;
import java.util.stream.Collectors;

public class EvenNumbersStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 7, 8, 10, 13, 16);

        // Use Stream to filter even numbers
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());

        System.out.println("Even numbers:");
        evens.forEach(System.out::println);
    }
}
