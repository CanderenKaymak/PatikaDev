package Loops;
import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        int num,i ,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz :");
        num = input.nextInt();
        System.out.println("Powers Of Four ");
        for (i = 1; i <= num ; i *= 4){
            System.out.println("\t  "+i);
        }
        System.out.println("Powers Of Five ");
        for (j = 1; j <= num; j*=5){
            System.out.println("\t  " + j);
        }
    }
}
