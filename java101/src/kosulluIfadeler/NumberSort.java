package kosulluIfadeler;
import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        int a, b, c;
        String select;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter First Number : ");
        a = input.nextInt();
        System.out.print("Please enter Second Number : ");
        b = input.nextInt();
        System.out.print("Please enter Third Number : ");
        c = input.nextInt();

        System.out.println("For Largest to Smallest type(>) ;\nFor Smallest to Largest type (<)");
        System.out.print("Your Selection : ");
        select = input.next();

        if (select.equals(">")){
            if (a == c){
                if (a > b)
                    System.out.println(a + " = " + c + " > " + b);
                else System.out.println(b + " > " + a + " = " + c);
            }
            else if (a == b){
                if (a > c)
                    System.out.println(a + " = " + b + " > " + c);
                else System.out.println(c + " > " + a + " = " + b);
            }
            else if (b == c){
                if (b > a)
                    System.out.println(b + " = " + c + " > " + a);
                else System.out.println(a + " > " + b + " = " + c);
            }
            else if ((a > b) && (a > c)){
                if (b > c)
                    System.out.println(a + " > " + b + " > " + c);
                else System.out.println(a + " > " + c + " > " + b);
            }
            else if ((b > c) && (b > a)){
                if (a > c)
                    System.out.println(b + " > " + a + " > " + c);
                else System.out.println(b + " > " + c + " > " + a);
            }
            else if ((c > a) && (c > b)){
                if (a > b)
                    System.out.println(c + " > " + a + " > " + b);
                else System.out.println(c + " > " + b + " > " + a);
            }
        }
        else if (select.equals("<")){
            if (a == c) {
                if (a < b)
                    System.out.println(a + " = " + c + " < " + b);
                else System.out.println(b + " < " + c + " = " + a);
            }
            else if (a == b){
                if (a < c)
                    System.out.println(a + " = " + b + " < " + c);
                else System.out.println(c + " < " + a + " = " + b);
            }
            else if (b == c){
                if (b < a)
                    System.out.println(b + " = " + c + " < " + a);
                else System.out.println(a + " < " + c + " = " + b);
            }
            else if ((a < c) && (a < b)){
                if(b < c)
                    System.out.println(a + " < " + b + " < " + c);
                else System.out.println(a + " < " + c + " < " + b);
            }
            else if ((b < a) && (b < c)){
                if (a < c)
                    System.out.println(b + " < " + a + " < " + c);
                else System.out.println(b + " < " + c + " < " + a);
            }
            else if ((c < a) && (c < b)){
                if ( a < b )
                    System.out.println(c + " < " + a + " < " + b);
                else System.out.println(c + " < " + b + " < " + a);
            }
        }else System.out.println("Invalid Selection..!");
    }
}
