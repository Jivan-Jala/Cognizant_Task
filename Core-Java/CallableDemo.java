// File: CallableDemo.java
import java.util.*;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int id = i;
            tasks.add(() -> "Result from Task " + id);
        }

        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        service.shutdown();
    }
}
