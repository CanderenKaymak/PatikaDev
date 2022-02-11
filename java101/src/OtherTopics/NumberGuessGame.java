package OtherTopics;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int number = rnd.nextInt(100);
        int right = 0;
        int guessed;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.println("Tahmin ettiğiniz sayıyı giriniz : ");
            guessed = input.nextInt();

            if (guessed < 0 || guessed > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz");
                continue;
            }
            if (guessed == number) {
                isWin = true;
                System.out.println("Tebrikler, Kazandınız..!");
                break;
            } else {

                if (guessed > number) {
                    System.out.println("Gizli Sayı Daha Küçük ;) ");
                } else {
                    System.out.println("Gizli Sayı Daha büyük ;) ");
                }
                wrongNumbers[right] = guessed;
                right++;
                System.out.println("Kalan Hakkın : " + (5 - right));
            }
        }
        if (!isWin){
            System.out.println("Kaybettin !!!");
            System.out.println("Başarısız tahminleriniz : " + Arrays.toString(wrongNumbers));
            System.out.println("Gizli Sayı : " + number +" idi.. =( ");
        }

    }
 }

