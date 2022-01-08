package Loops;
import java.util.Scanner;

public class HarmonicSerieOfANum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, res = 0.0;
        System.out.print("Harmonik serisini bulmak istediğiniz sayıyı giriniz : ");
        num = input.nextDouble();

        for (double i = 1; i <= num; i++){
            res += 1 / i;
        }
        System.out.println("Girdiğiniz sayının harmoniği = " + res);
    }

}
