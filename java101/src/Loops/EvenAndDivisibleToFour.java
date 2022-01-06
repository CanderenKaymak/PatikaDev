package Loops;
import java.util.Scanner;

public class EvenAndDivisibleToFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num , total = 0;

        System.out.println("Gireceğiniz sayılar bittiğinde, tek sayı girerek toplam sonucu görebilirsiniz..!");
        do {
            System.out.print("Sayı Giriniz : ");
            num = input.nextInt();

            if (num % 4 == 0) {
                total += num;
            }
        }while(num % 2 == 0);

        System.out.println("Girilen çift sayılardan 4'e bölünebilenlerin toplamı = " + total);
    }
}
