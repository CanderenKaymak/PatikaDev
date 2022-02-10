package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ClosestNumbersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upper, lower, number;
        int[] numbers = {15,12,788,1,-1,-778,2,0};

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        upper = number;
        lower = number;
        Arrays.sort(numbers);

        for (int num = 0; num < numbers.length; num++) {
            if (number < numbers[num]){
                lower = numbers[num -1];
                upper = numbers[num];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük ve ona en yakın sayı : " + lower);
        System.out.println("Girilen sayıdan büyük ve ona en yakın sayı : " + upper);
    }
}
