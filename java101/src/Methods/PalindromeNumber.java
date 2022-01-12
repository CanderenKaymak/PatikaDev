package Methods;
import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int a){
        int temp = a, reversedNumber = 0, lastNumber = 0;
        while(temp != 0){
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        return (reversedNumber == a) ? true : false;
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        num = input.nextInt();

        System.out.println(isPalindrome(num));
    }
}
