package temelKavramlarVeDegiskenler;
import java.util.Scanner;

public class UcgenAlanHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double alan, cevre;

        System.out.println("Birinci Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();
        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz : ");
        c =input.nextInt();

        String hata = ( a <= 0 || b <= 0 || c <= 0) ? "Kenar uzunluğu Sıfır ya da Sıfırdan Küçük Olamaz! " :
                "Uzunlukları Yeniden Giriniz ! ";
        System.out.println(hata);

        System.out.println("Birinci Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();
        System.out.println("İkinci Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();
        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz : ");
        c =input.nextInt();

        cevre = (a + b + c) / 2;
        alan = cevre * (cevre - a) * (cevre - b) * (cevre - c);
        alan = Math.sqrt(alan);

        System.out.println("Birinci kenar :" + a);
        System.out.println("İkinci Kenar : " + b);
        System.out.println("Üçüncü Kenar : " + c);
        System.out.println("Üçgenin Çevresi : " + 2*cevre + " birim");
        System.out.println("Üçgenin Alanı : " + alan + " birim");
    }
}
