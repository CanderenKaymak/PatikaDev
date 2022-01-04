package kosulluIfadeler;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the year you want to learn if it is a Leap Year : ");
        year = input.nextInt();

        if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("It is a Leap Year!");
            }
            else System.out.println("It's not a Leap Year...");
        }
        else {
            if(year % 4 == 0){
                System.out.println("It is a Leap Year!");
            }else System.out.println("It's Not a Leap Year...");
        }
    }
}
