public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2 = " + result);
        // Explanation: Multiplication has higher precedence, so 5 * 2 = 10, then 10 + 10 = 20
    }
}