package Methods;
import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        while(true){
            System.out.println("Çıkış yapmak için 0 tuşlayınız ... ");
            System.out.print("Lütfen asal olup olmadığını kontrol etmek için bir sayı giriniz : ");
            num = input.nextInt();

            if (isPrime(num,2) == true) System.out.println(num + " Asal Sayıdır..");
            else System.out.println(num + " Asal Sayı Değildir..!");
            System.out.println("----------------------------------------------");

            if (num == 0) break;
        }
    }

    private static boolean isPrime(int a, int b){
        int i = b;

        if (a <= 2)
            return (a == 2) ? true : false;
        if (a % i == 0)
            return false;
        if (i * i > a)
            return true;

        return isPrime(a, i + 1);
    }
}
