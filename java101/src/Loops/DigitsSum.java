package Loops;
import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, mod = 0;

        System.out.println("Sayı Giriniz : ");
        num = input.nextInt();
        while(num != 0){
            mod += num % 10;
            num /= 10;
        }
        System.out.println(mod);
    }
}
