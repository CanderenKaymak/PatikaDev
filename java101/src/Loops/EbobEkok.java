package Loops;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, num1, num2, ebob = 0, ekok = 0, temp = 0;

        System.out.print("Birinci sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        num2 = input.nextInt();

        //ebob işleminde girilen küçük sayıya göre işlem yapılacağı için ilk sayının küçüğe göre ayarlanması...
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //ebob-gcf
        while (i <= num1){
            if (num1 % i == 0 && num2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);
        //ekok-lcm
        while(i <= (num1*num2)){
            if (i % num1 == 0 && i % num2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok : " + ekok);
    }
}
