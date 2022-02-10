package Arrays;
import java.util.Arrays;
import  java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz 'n' : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <= size; i++){
            System.out.print(i + ". elemanı : ");
            int entry = input.nextInt();

            arr[i-1] = entry;
        }

        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
