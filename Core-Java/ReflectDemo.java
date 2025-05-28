// File: ReflectDemo.java
import java.lang.reflect.*;

public class ReflectDemo {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectDemo");
        Object obj = cls.getDeclaredConstructor().newInstance();

        for (Method method : cls.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            if (method.getName().equals("sayHello")) {
                method.invoke(obj, "Reflection");
            }
        }
    }
}

