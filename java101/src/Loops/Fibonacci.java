package Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fib1 = 0, fib2 =1, temp= 0;
        System.out.print("Fibonacci serisinde ne kadar ilerlemek istiyorsunuz ? : ");
        num = input.nextInt();

        System.out.print(fib1 + " " + fib2  );
        for (int i = 2; i <= (num); i++){
            temp = fib1 + fib2;
            System.out.print(" " + temp);
            fib1 = fib2;
            fib2 = temp;
        }
    }
}
