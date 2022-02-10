package Arrays;
import java.util.Arrays;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int count = 1;
        int[] numbers = {3, 21, 14, 3, 6, 8, 12, 6, 14};
        int[] compared = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                for (int j = 0; j < numbers.length; j++){
                    if ((i != j) && numbers[i] == numbers[j]){
                        if (!isExist(compared, numbers[j])){
                            compared[count++] = numbers[j];
                        }
                        break;
                    }
                }
            }
        }
        for (int i : compared){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
    static boolean isExist(int[] arr, int val){
        for (int value: arr) {
            if (value == val)
                return true;
        }
        return false;
    }
}
