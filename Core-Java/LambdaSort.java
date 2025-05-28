// File: LambdaSort.java
import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "Eve");

        // Sort using lambda expression
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted List:");
        names.forEach(System.out::println);
    }
}
