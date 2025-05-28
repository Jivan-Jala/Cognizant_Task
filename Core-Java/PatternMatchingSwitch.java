// File: PatternMatchingSwitch.java

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        printTypeMessage("Hello");
        printTypeMessage(42);
        printTypeMessage(3.14);
        printTypeMessage(true);
    }

    public static void printTypeMessage(Object obj) {
        String message = switch (obj) {
            case Integer i -> "Integer with value: " + i;
            case String s  -> "String with value: " + s;
            case Double d  -> "Double with value: " + d;
            case Boolean b -> "Boolean with value: " + b;
            default        -> "Unknown type";
        };
        System.out.println(message);
    }
}
