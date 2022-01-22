package Methods;
import java.util.Scanner;

public class DesignMethodByPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, temp;

        System.out.print("N Sayısı : ");
        num = input.nextInt();

        temp = descendingPatternMethod(num);
        if (temp <= 0) ascendingPatternMethod(temp, num);
    }

    private static int descendingPatternMethod(int a){
        int result = a;
        System.out.print(" " + result);

        if (result > 0){
            result -=5;
            return descendingPatternMethod(result);
        }
        return a;
    }

    private static int ascendingPatternMethod(int a, int b){
        int result = a;

        if (result < b){
            result += 5;
            System.out.print(" " + result);
            return ascendingPatternMethod(result, b);
        }
        return b;
    }
}

