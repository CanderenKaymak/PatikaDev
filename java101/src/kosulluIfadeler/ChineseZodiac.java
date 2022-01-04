package kosulluIfadeler;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, signNum;

        System.out.print("Please enter the year you want to Calculate / Doğum yılınızı Giriniz : ");
        year = input.nextInt();

        if (year >= -4000){
            signNum = year % 12;
            switch (signNum){
                case 0:
                    System.out.println("Monkey / Maymun");
                    break;
                case 1:
                    System.out.println("Rooster / Horoz");
                    break;
                case 2:
                    System.out.println("Dog / Köpek");
                    break;
                case 3:
                    System.out.println("Pig / Domuz");
                    break;
                case 4:
                    System.out.println("Rat / Fare");
                    break;
                case 5:
                    System.out.println("Ox / Öküz");
                    break;
                case 6:
                    System.out.println("Tiger / Kaplan");
                    break;
                case 7:
                    System.out.println("Rabbit / Tavşan");
                    break;
                case 8:
                    System.out.println("Dragon / Ejderha");
                    break;
                case 9:
                    System.out.println("Snake / Yılan");
                    break;
                case 10:
                    System.out.println("Horse / At");
                    break;
                case 11:
                    System.out.println("Goat / Keçi");
                    break;
                default:
                    System.out.println("Unknown Error Occured.!. / Bilinmeyen Bir Hata Oluştu.!.");
            }
        }else System.out.println("Invalid Year!!! / Yanlış bir Yıl girildi!!!");

    }
}
