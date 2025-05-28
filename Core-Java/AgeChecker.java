// File: AgeChecker.java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    public static void main(String[] args) {
        int age = 16;  // You can take this from Scanner if needed

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            } else {
                System.out.println("Access granted.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
