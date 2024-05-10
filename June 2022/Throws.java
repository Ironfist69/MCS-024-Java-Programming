public class Throws {
    public static void validate(int age) throws ArithmeticException {
        if(age<18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        validate(69);
    }
}
