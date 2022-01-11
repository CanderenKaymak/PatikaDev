package Loops;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 0;
        System.out.print("Sayı giriniz : ");
        num = input.nextInt();

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                total += i;
            }
        }
        if (num == total) System.out.println(num + " Mükemmel Sayıdır.");
        else System.out.println(num + " Mükemmel Sayı Değildir");

    }
}
