import java.util.Scanner;
public class fibonacci {
    public static void main (String [] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=scanner.nextInt();
        System.out.println("Fibonacci series for "+n+" terms: ");
        for(int i=0;i<n;i++) {
            System.out.println(fibonacciSeries(i)+" ");
        }
    }
    public static int fibonacciSeries (int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
}