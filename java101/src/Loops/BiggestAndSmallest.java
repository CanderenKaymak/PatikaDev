package Loops;
import java.util.Scanner;

public class BiggestAndSmallest {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int num = 0, howMany = 0, count = 1, biggest = 0, smallest = 0;

        System.out.print("Kaç Sayı gireceksiniz : ");
        howMany = input.nextInt();
        for (count = 1; count <= howMany; count++){
            System.out.print(count + ". Sayı : ");
            num = input.nextInt();
            if (count == 1){
                smallest = num;
                biggest = num;
            }
            else if (num <= smallest) smallest = num;
            else if (num >= biggest) biggest = num;
        }
        System.out.println("Biggest Number : " + biggest);
        System.out.println("Smallest Number: " + smallest);
    }
}
