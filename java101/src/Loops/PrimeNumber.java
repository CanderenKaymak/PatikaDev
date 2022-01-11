package Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int counter ,i = 0;
        for (i = 1; i <= 100; i++){
            counter = 0;
            for (int j = 1; j <= i; j++){
                    if (i % j == 0){
                        counter++;
                    }
            }
            if(counter == 2 ) System.out.print(i + " ");
        }
    }
}
