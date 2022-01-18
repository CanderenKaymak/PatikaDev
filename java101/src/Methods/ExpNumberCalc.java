package Methods;
import java.util.Scanner;

public class ExpNumberCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp, result = 0;
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz : ");
        base = input.nextInt();
        System.out.print("Kuvvetini giriniz : ");
        exp = input.nextInt();

        result = expCalc(base, exp);
        System.out.println(base + "^" + exp +" : " + result);
    }

    private static int expCalc(int a,int b){
        if (b == 1){
            return a;
        }else return expCalc(a, b-1) * a;
    }
}
