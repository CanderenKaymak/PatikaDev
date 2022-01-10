package Loops;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.print("Sayı giriniz : ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num -1; i >= 0; i--){
            for (int j = 1; j <= (num - i); j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
