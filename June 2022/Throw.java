import java.util.Scanner;

public class Throw {
    public static void vailidateAge (int age) {
        if(age<18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vailidateAge(age);
    }
}
