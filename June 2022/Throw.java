import java.util.Scanner;

public class Throw {
    public static void validateAge (int age) {
        if(age<18) {
            throw new ArithmeticException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
    public static void main (String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        validateAge(age);
    }
}