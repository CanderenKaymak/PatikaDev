package Arrays;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println("[1, 2, 3, 4, 5] Dizisindeki sayıların harmonik ortalaması: " + numbers.length/harmonicMean(numbers));
    }
    static double harmonicMean(int[] arr) {
        double harmonicMean = 0;
        for (int i : arr) {
            harmonicMean += (1.0/i);
        }
        return harmonicMean;
    }
}
