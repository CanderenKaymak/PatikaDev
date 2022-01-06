package Loops;
import java.util.Scanner;

public class CombinationCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arg1, arg2, result, nFact = 1, rFact = 1, nrFact = 1;

        System.out.println("C(n,r) = n!/ (r!*(n-r)!)");
        System.out.print("'n' değerini giriniz : ");
        arg1 = input.nextInt();
        System.out.print("'r' değerini giriniz : ");
        arg2 = input.nextInt();

        for (int i = 1; i <= arg1; i++){
            nFact *= i;
        }
        for (int i = 1; i <= arg2; i++){
            rFact *= i;
        }
        for (int i = 1; i <= (arg1-arg2); i++){
            nrFact *= i;
        }
        result = nFact / (rFact*nrFact);
        System.out.println("N'nin R'li kombinasyonu : " + result);
    }
}
