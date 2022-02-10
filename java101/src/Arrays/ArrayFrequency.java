package Arrays;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 0, 10, 10, 20, 5, 20, 15, 15};
        int[] compared = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!isExist(compared, arr[i])) {
                compared[i] = arr[i];
                int count = counter(arr, arr[i]);
                System.out.println(compared[i] + " sayısı " + count + " kere tekrar edildi.");
                }
            }
        }


    static int counter(int[] a, int val) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (val == a[i])
                count += 1;
            else if (val == 0)
                count += 1;
        }
        return count;
    }

    static boolean isExist(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }
}
