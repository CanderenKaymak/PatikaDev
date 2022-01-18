package Methods;
import java.util.Scanner;

public class AdvancedCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı İşlemi\n"
                + "6- Faktoriyel Hesaplama İşlemi\n"
                + "7- Mod Alma İşlemi\n"
                + "8- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0- Çıkış Yap";
        
        do {
            System.out.println(menu);
            System.out.print("Bir işlem Seçiniz : ");
            selection = input.nextInt();

            switch (selection){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 0:
                    System.out.println("Güle Güle...");
                    break;
                default:
                    System.out.println("Geçersiz bir işlem seçtiniz..! ya da Çıkış Yapmak için Sıfır Tuşlayınız..!");
                    break;
            }
        }while (selection != 0);
    }

    private static void sum() {
       int number, result = 0, i = 1;
       Scanner input = new Scanner(System.in);
       System.out.println("Toplama işlemi için sayıları giriniz, giriş işlemi bittiğinde 0 tuşlayınız.");

       while(true){
           System.out.print(i++ + ". sayı : ");
           number = input.nextInt();

           if (number==0)
               break;
           result += number;
       }
        System.out.println("Sonuç :" + result);
       return;
    }

    private static void minus(){
        int number, result = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Çıkarma işlemi için sayıları giriniz, giriş işlemi bittiğinde 0 tuşlayınız.");

        while (true){
            System.out.print(i++ + ". sayı: ");
            number = input.nextInt();
            if (i == 2){
                result = number;
            }
            if(i > 2 && (number < 0 || number >0)) result -= number;
            if (number == 0){
                break;
            }
        }
        System.out.println("Sonuç : " + result);
        return;
    }

    private static void times(){
        int number, result = 1, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Çarpmak istediğiniz sayıları giriniz - sayıları 1 veya 0 ile çarpmanız durumunda çıkış " +
                "yapmış olursunuz.");

        while (true){
            System.out.print(i++ + ". Sayı : ");
            number = input.nextInt();

            if (number == 1) break;
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    private static void divide(){
        int i = 1;
        double number, result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz sayıları giriniz. girilen sayılar bittiğinde 1 tuşlayıp çıkış " +
                "yapabilirsiniz..");

        while(true){
            System.out.print(i++ +". Sayı: ");
            number = input.nextDouble();

            if (i == 2) {
                result = number;
                continue;
            }
            if (i != 1 && number == 0.0) {
                System.out.println("bir sayı Sıfıra bölünemez..!");
                break;
            }
            if (number == 1) break;

            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    private static void power(){
        int base, exp, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz : ");
        base = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        exp = input.nextInt();

        for (int i = 1; i <= exp; i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    private  static void factorial(){
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Lütfen faktöriyelini bulmak istediğiniz sayıyı giriniz : ");
        int num = input.nextInt();

        for (int i = 1; i<=num; i++){
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void  mod(){
        Scanner input = new Scanner(System.in);
        int result = 0, num, modNum;

        System.out.print("Modunu almak istediğiniz sayıyı giriniz : ");
        num = input.nextInt();
        System.out.print("Mod sayısını giriniz : ");
        modNum = input.nextInt();

        result = num % modNum;
        System.out.println("Sonuç : " + result);
    }

    private static void dikdortgen(){
        Scanner input = new Scanner(System.in);
        int lengthShort, lengthLong, area = 0, perimeter = 0 ;

        System.out.print("Uzun Kenarı giriniz : ");
        lengthLong = input.nextInt();
        System.out.print("Kısa Kenarı giriniz : ");
        lengthShort = input.nextInt();

        area = lengthLong * lengthShort;
        perimeter = 2 * (lengthLong + lengthShort);

        System.out.println("Alan : " + area + " Çevre : " + perimeter);
    }
}
