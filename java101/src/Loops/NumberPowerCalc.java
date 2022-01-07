package Loops;
import java.util.Scanner;

public class NumberPowerCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, pow, i = 1, total = 1;

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        num =  input.nextInt();
        System.out.print("Kuvvetini giriniz : ");
        pow = input.nextInt();

        for ( i = 1; i <= pow; i++){
            total *= num;
            }
        System.out.println(total);
    }
}
