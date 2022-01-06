package Loops;
import java.util.Scanner;

public class DivisibleToThreeAndFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, total = 0, counter = 0;
        double avg;

        System.out.print("Please enter a number / Lütfen bir sayı giriniz : ");
        num = input.nextInt();

        for (i = 1; i <= num; i++){
            if (i % 3 == 0 || i % 4 == 0){
                System.out.print(i + " ");
                total += i;
                counter++;
            }
        }
        avg = total / counter;
        System.out.println("Girilen sayıya kadar 3'e ve 4'e bölünebilen sayıların ortalaması : " + avg);
    }
}
